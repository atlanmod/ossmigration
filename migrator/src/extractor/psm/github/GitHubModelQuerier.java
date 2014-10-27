package extractor.psm.github;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import GitHub.*;


public class GitHubModelQuerier {
	
	private Resource model;
	private Repository repo;
	private String modelPath;
	
	public GitHubModelQuerier(String githubModelPath) {
		this.modelPath = githubModelPath;
		this.model = this.loadGitHubRepoModel(githubModelPath);
		this.repo = findRepository();
	}
	
	public Repository findRepository() {
		Repository found = null;
		for(EObject content: model.getContents()) {
			if (content instanceof Repository) {
				found = (Repository)content;
				break;
			}
		}
		
		return found;
	}
	
	public Repository getRepository() {
		return this.repo;
	}
	
	public List<String> getRepoLabels() {
		List<String> labels = new LinkedList<String>();
		for(Label l: repo.getLabels()) {
			labels.add(l.getName());
		}
		
		return labels;
	}
	
	public List<String> getIssueLabels(Issue i) {
		List<String> labels = new LinkedList<String>();
		for(Label l: i.getLabels()) {
			labels.add(l.getName());
		}
		
		return labels;
	}
	
	public List<String[]> getIssueComments(Issue i) {
		List<String[]> comments = new LinkedList<String[]>();
		for(IssueComment ic: i.getComments()) {
			
			String body = "---";
			if (!i.getBody().equals(""))
				body = i.getBody();
			
			String[] infoComment = {
									ic.getBody(), 
									ic.getCreated_at(), 
									ic.getCreator().getLogin()
									};
			
			comments.add(infoComment);
		}
		
		return comments;
	}
	
	public List<String[]> getIssueEvents(Issue i) {
		List<String[]> events = new LinkedList<String[]>();
		for(IssueEvent ie: i.getEvents()) {
			
			String referencedIssue = "";
			if (ie.getReferenced_issue() != null)
				referencedIssue = ie.getReferenced_issue().getNumber().toString();
			
			String[] infoEvent = {
									ie.getType().getLiteral(),
									ie.getActor().getLogin(),
									ie.getCreated_at(),
									referencedIssue
									};
			
			events.add(infoEvent);
		}
		
		return events;
	}
	
	
	public List<Object[]> getRepoIssues() {
		LinkedList<Object[]> issues = new LinkedList<Object[]>();
		for(Issue i: repo.getIssues()) {
			
			String assignee = "";
			if (i.getAssignee() != null)
				assignee = i.getAssignee().getLogin();
					
			String closedAt = "";
			if (i.getClosed_at() != null)
				closedAt = i.getClosed_at();
			
			String body = "---";
			if (i.getBody() != "")
				body = i.getBody();
			
			issues.add(new Object[]{
									i.getTitle(),
				                    i.getBody(),
				                    i.getCreated_at(),
				                    i.getClosed_at(),
				                    assignee,
				                    i.getCreator().getLogin(),
				                    i.getNumber().toString(), 
									this.getIssueLabels(i),
									this.getIssueComments(i),
									this.getIssueEvents(i)
									});
			
		}
		
		return issues;
			
	}
	
	public boolean hasRepoIssues() {
		return !repo.getIssues().isEmpty();
	}
	
	public boolean hasRepoWiki() {
		return repo.getWiki() != null;
	}
	
	public boolean hasRepoLabels() {
		return !repo.getLabels().isEmpty();
	}
	
	public Resource loadGitHubRepoModel(String githubModelPath) {
		//load resource
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(GitHubPackage.eNS_URI, GitHubPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resLoad = resSet.getResource(URI.createURI(githubModelPath),true);		               
		
		try {
			resLoad.load(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
		return resLoad;
		
	}
	

}
