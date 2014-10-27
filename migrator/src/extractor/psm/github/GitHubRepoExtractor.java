package extractor.psm.github;


import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;


import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.Label;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.RepositoryId;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.EventService;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.LabelService;
import org.eclipse.egit.github.core.service.MilestoneService;
import org.eclipse.egit.github.core.service.OAuthService;
import org.eclipse.egit.github.core.service.RepositoryService;
import org.eclipse.egit.github.core.service.UserService;
import org.eclipse.egit.github.core.client.IGitHubConstants;

public class GitHubRepoExtractor {
	
			
	private GitHubModelQuerier querier;
	
	//access section -- client or tokens
	private GitHubClient client;
	private List<String> tokens = new LinkedList<String>();
	private String login;
	private String current_token;
	
	//github services to interact with the repository
	private UserService uservice;
	private RepositoryService rservice;
	private IssueService iservice;
	private LabelService lservice;
	private MilestoneService mservice;
	private EventService eservice;
	private OAuthService oservice;
	
	//repository information
	private RepositoryId repoId; 
	private Repository repo;
	
	Map<Integer, Integer> issueNumber2GitHubIssueNumber =  new HashMap<Integer, Integer>();
	
	private int issueCounter = 0;
	private int milestoneCounter = 1;
	
	
	public void extract(boolean replaceIfExist, String githubModelPath, String login, String password) {
		this.querier = new GitHubModelQuerier(githubModelPath);	
		this.login = login;
		init(login, password);
		
		if(!repoAlreadyExists())
			this.createRepo();
		else if(repoAlreadyExists() && replaceIfExist) { 
			this.deleteRepo();
			this.createRepo();
		}
		else {
			System.out.println("repo already exists!");
		}
	}
	
	public void extract(boolean replaceIfExist, String githubModelPath, String... tokens) {
		this.querier = new GitHubModelQuerier(githubModelPath);	
		this.tokens = new LinkedList<String>();
		for (String t : tokens) {
			this.tokens.add(t.trim());
		}
		init(this.tokens.get(0));
		
		if(!repoAlreadyExists())
			this.createRepo();
		else if(repoAlreadyExists() && replaceIfExist) { 
			this.deleteRepo();
			this.createRepo();
		}
		else {
			System.out.println("repo already exists!");
		}	
	}
	
	
	public void init(String login, String password) {
		this.client = new GitHubClient();
		this.client.setCredentials(login, password);
		this.initGitHubServices();
	}
	
	
	public void init(String token) {
		this.client = new GitHubClient();
		this.client.setOAuth2Token(token);
		this.current_token = token;
		this.initGitHubServices();
		
		//get the login of the user. This information is needed to interact with the repository
		try {
			this.login = this.uservice.getUser().getLogin();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void initGitHubServices() {
		this.eservice = new EventService(client);
		this.uservice = new UserService(client);
		this.rservice = new RepositoryService(client);
		this.iservice = new IssueService(client);
		this.lservice = new LabelService(client);
		this.mservice = new MilestoneService(client);
		this.eservice = new EventService(client);
		this.oservice = new OAuthService(client);
		
	}
	
	
	public String makeUpColor() {
		String[] LABEL_COLORS = { 
				"e11d21", "fbca04",
				"eb6420", "009800",
				"006b75", "207de5",
				"0052cc", "0052cc",
				"0052cc", "5319e7",
				"f7c6c7", "fad8c7",
				"fef2c0", "bfe5bf",
				"bfdadc", "c7def8",
				"bfd4f2", "d4c5f9"};
		Random rn = new Random();
		
		int position = rn.nextInt(LABEL_COLORS.length);
		
		return LABEL_COLORS[position];
		
	}
	
	
	public int generatedGitHubIssueNumber() {
		issueCounter++;
		return issueCounter;
	}
	
	
	public boolean repoAlreadyExists() {
		this.repoId = new RepositoryId(this.login, querier.getRepository().getName());
		return this.repoId != null;
	}
	
	
	public void changeToken() {
		if (oservice.getClient().getRemainingRequests() == 0) {
			int size = this.tokens.size();
			int current_position = this.tokens.indexOf(current_token);
			this.current_token = this.tokens.get((current_position+1)%size);
			
			client.setOAuth2Token(current_token);
			this.initGitHubServices();
			System.out.println("the current token is now: " + current_token);
		}
	}
	
	
	public void monitorRemainingRequests() {
		if (this.tokens.size() > 1) {
			changeToken();
		}
			
		if (client.getRemainingRequests() == 0) {
			System.out.println("the remaining requests are not enough to finalize the migration process. "
					+ "The process will continue in 1 hour. ");
			new CountDownTimer();
		}
		
		System.out.println(client.getRemainingRequests());
		
	}

	
	public void createRepo() {
		try {
			this.repo = new Repository();
			repo.setName(querier.getRepository().getName());
			repo.setFork(false);
			repo.setHasIssues(querier.hasRepoIssues());
			repo.setPrivate(false);
			repo.setHasWiki(querier.hasRepoWiki());
			repo.setDescription(querier.getRepository().getDescription());
			
			rservice.createRepository(repo);
			this.repoId = new RepositoryId(this.login, querier.getRepository().getName());
			
			//monitor remaining requests
			this.monitorRemainingRequests();
			
			if (querier.hasRepoLabels()) {
				for (String label: querier.getRepoLabels()) {
					this.createLabel(label, this.makeUpColor());
				}
			}
			
			if (querier.hasRepoIssues()) {
				for(Object[] infoIssue: querier.getRepoIssues()) {
					
					String title = (String)infoIssue[0];
					String body = (String)infoIssue[1];
					String createdAt = (String)infoIssue[2];
					String closedAt = (String)infoIssue[3];
					String assignee = (String)infoIssue[4];
					String creator = (String)infoIssue[5];
					int issueNumber = Integer.parseInt((String)infoIssue[6]);
					
					List<String> labels = (List<String>) infoIssue[7];
					List<String[]> comments = (List<String[]>) infoIssue[8];
					List<String[]> events = (List<String[]>) infoIssue[9];
					
					this.createIssue(issueNumber, title, body, createdAt, closedAt, assignee, creator, labels, comments, events);
				}
				
			}
			
			if (querier.hasRepoWiki()) {
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		this.createIssue("this is a test", "we are talking about something serious @"+login, issueCounter, Arrays.asList("won't fix!"), milestoneCounter);
		issueCounter++;
		milestoneCounter++;
		
		this.createMilestone("milestone 1.x", milestoneCounter);
		this.createIssue("a new test", "we are really talking about something serious #1", issueCounter, Arrays.asList("supermegabug"), milestoneCounter);
		issueCounter++;		
		milestoneCounter++;
		*/
		
	}
	
//	public void createMilestone(String title, int number) throws IOException {
//		Milestone m = new Milestone();
//		m.setTitle(title);
//		m.setNumber(number);
//		mservice.createMilestone(repoId, m);
//	}
//	
//	public Milestone getMilestone(int number) throws IOException {
//		return mservice.getMilestone(repoId, number);
//	}
	
	public void createLabel(String name, String color) throws IOException {
		Label l = new Label();
		l.setName(name);
		l.setColor(color);
		lservice.createLabel(repoId, l);
		
		//monitor remaining requests
		this.monitorRemainingRequests();
	}
	
	
	public void closeIssue(Issue i) throws IOException {
		i.setState("closed");
		iservice.editIssue(repoId, i);
		
		//monitor remaining requests
		this.monitorRemainingRequests();
	}
	
	
	public Label getLabel(String name) throws IOException {
		Label found = null;
		for (Label l : lservice.getLabels(repoId))
			if (l.getName().equals(name))
				found = l;
		
		//monitor remaining requests
		this.monitorRemainingRequests();
		
		return found;
	}
	
	
	public List<Label> getLabels(List<String> labelNames) throws IOException {
		List<Label> labels = new LinkedList<Label>();
		for (String name : labelNames) {
			Label l = this.getLabel(name);
			labels.add(l);
		}
		
		return labels;
	}
	
	
	public void createIssueComments(int githubIssueNumber, List<String[]> comments) throws IOException {
		for(String[] comment: comments) {
			String commentBody = comment[0]; 
			String commentCreated_at = comment[1]; 
			String commentCreator = comment[2];
			
			String commentToInsert = commentBody + "\n creator: " + commentCreator + "\n created at: " + commentCreated_at; 
			
			iservice.createComment(repoId, githubIssueNumber, commentToInsert);
			
			//monitor remaining requests
			this.monitorRemainingRequests();
		}
	}
	
	
	public void createIssueCommentForEvents(int gitHubIssueNumber, List<String[]> events) throws IOException {
		String commentToInsert = "Past Events: \n";
		for (String[] event: events) {
			String type = event[0];
			String actor = event[1];
			String created_at = event[2];
			String referencedIssueNumber = event[3];
				
			String line = "";
			if (referencedIssueNumber != null)
				line = "action:" + type + " user: " + actor + " at: " + created_at + " referenced issue: " + this.issueNumber2GitHubIssueNumber.get(referencedIssueNumber);
			else
				line = "action:" + type + " user: " + actor + " at: " + created_at;
			
			commentToInsert = commentToInsert + line + "\n";
					
		}
		
		iservice.createComment(repoId, gitHubIssueNumber, commentToInsert);
		
		//monitor remaining requests
		this.monitorRemainingRequests();
		
	}
	
	
	public void createIssue(int issueNumber, String title, String body, String createdAt, String closedAt, String assignee, String creator, List<String> labels, List<String[]> comments, List<String[]> events) {
		try {
			Issue i = new Issue();
			i.setTitle(title);
			i.setBody(body);
			i.setLabels(this.getLabels(labels));
			iservice.createIssue(repoId, i);
			
			//monitor remaining requests
			this.monitorRemainingRequests();
			
			int gitHubIssueNumber = generatedGitHubIssueNumber();
			issueNumber2GitHubIssueNumber.put(issueNumber, gitHubIssueNumber);
					
			this.createIssueComments(gitHubIssueNumber, comments);
			
			if (events.size() > 0)
				this.createIssueCommentForEvents(gitHubIssueNumber, events);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void deleteRepo() {
		StringBuilder uri = new StringBuilder(IGitHubConstants.SEGMENT_REPOS);
		uri.append('/').append(repoId.generateId());
		try {
			client.delete(uri.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
