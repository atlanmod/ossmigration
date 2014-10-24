package injector.psm.googlecode;

import googlecode.GoogleCodeProject;
import googlecode.GoogleIssue;
import googlecode.GoogleIssueComment;
import googlecode.GoogleIssueLabel;
import googlecode.GoogleIssueTracker;
import googlecode.GoogleProjectLabel;
import googlecode.GoogleUser;
import googlecode.GoogleWiki;
import googlecode.GoogleWikiLabel;
import googlecode.GoogleWikiPage;
import googlecode.GooglecodeFactory;
import googlecode.GooglecodePackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class GoogleCodeInjector {
	public static final int MAX_ELEMS = 1;
	public static final String OUTPUT = "result.xmi";

	HashMap<String, GoogleUser> users = new HashMap<String, GoogleUser>();
	
	HashMap<String, GoogleIssue> issues = new HashMap<String, GoogleIssue>();
	HashMap<String, GoogleWikiPage> wikipages = new HashMap<String, GoogleWikiPage>();
	
	HashMap<String, GoogleProjectLabel> projectLabels = new HashMap<String, GoogleProjectLabel>();
	HashMap<String, GoogleIssueLabel> issueLabels = new HashMap<String, GoogleIssueLabel>();
	HashMap<String, GoogleWikiLabel> wikiLabels = new HashMap<String, GoogleWikiLabel>();
	
	public static void main(String[] args) {
        GoogleCodeInjector injector = new GoogleCodeInjector();
      injector.inject("https://code.google.com/p/guava-libraries");
//        injector.inject("https://code.google.com/a/eclipselabs.org/p/api2mol");
    }
	
	public WebDriver getDriver() {
        WebDriver driver = new HtmlUnitDriver();
        Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF); 
                
        return driver;
    }
	
	public GoogleUser getUser(String id) {
		GoogleUser user = users.get(id);
		if(user == null) { 
			user = GooglecodeFactory.eINSTANCE.createGoogleUser();
			user.setId(id);
			user.setEmail(id); // TODO Check that id and email are always the same
			users.put(id, user);
		}
		return user;
	}
	
	public GoogleIssue getIssue(String id) {
		GoogleIssue issue = issues.get(id);
		if(issue == null) {
			issue = GooglecodeFactory.eINSTANCE.createGoogleIssue();
			issue.setId(id);
			issues.put(id, issue);
		}
		return issue;
	}

	public GoogleProjectLabel getProjectLabel(String id) {
		GoogleProjectLabel projectLabel = projectLabels.get(id);
		if(projectLabel == null) {
			projectLabel = GooglecodeFactory.eINSTANCE.createGoogleProjectLabel();
			projectLabel.setName(id);
			projectLabels.put(id, projectLabel);
		}
		return projectLabel;
	}
	
	public GoogleIssueLabel getIssueLabel(String id) {
		GoogleIssueLabel issueLabel = issueLabels.get(id);
		if(issueLabel == null) {
			issueLabel = GooglecodeFactory.eINSTANCE.createGoogleIssueLabel();
			issueLabel.setName(id);
			issueLabels.put(id, issueLabel);
		}
		return issueLabel;
	}
	
	public GoogleWikiLabel getWikiLabel(String id) {
		GoogleWikiLabel wikiLabel = wikiLabels.get(id);
		if(wikiLabel == null) {
			wikiLabel = GooglecodeFactory.eINSTANCE.createGoogleWikiLabel();
			wikiLabel.setName(id);
			wikiLabels.put(id, wikiLabel);
		}
		return wikiLabel;
	}
	
	public void inject(String url) {
		GoogleCodeProject project = injectProject(url);
		
        injectIssues(url);
        injectWikiPages(url);
        
        System.out.println("Wiki pages found: " + wikipages.keySet().size());
        System.out.println("Issues found: " + issues.keySet().size());
        
        project.getIssueTracker().getIssues().addAll(issues.values());
        project.getIssueLabels().addAll(issueLabels.values());
        project.getWiki().getPages().addAll(wikipages.values());
        project.getWikiLabels().addAll(wikiLabels.values());
        project.getProjectLabels().addAll(projectLabels.values());
        project.getUsers().addAll(users.values());
        
        save(OUTPUT, project);
    }
	
	
	public GoogleCodeProject injectProject(String projectURL) {
		GoogleCodeProject project = GooglecodeFactory.eINSTANCE.createGoogleCodeProject();

        WebDriver driver = getDriver();
        driver.get(projectURL);
        
        // Info from the header
        WebElement headerElement = driver.findElement(By.className("headbg"));
        
        WebElement nameElement = headerElement.findElement(By.id("pname"));
        String name = nameElement.getText();
        project.setName(name);
        
        WebElement summaryElement = headerElement.findElement(By.id("project_summary_link"));
        String summary = summaryElement.getText();
        project.setSummary(summary);
        
        // Info from left column
        WebElement leftElement = driver.findElement(By.className("pscolumnl"));
        
        // TODO fix this
        /*WebElement starElement = leftElement.findElement(By.id("star_count"));
        int stars = Integer.valueOf(starElement.getText());
        project.setStars(stars);*/
        
        List<WebElement> psmetaElements = driver.findElements(By.className("psmeta"));
        if(psmetaElements.size() > 2) { 
        	WebElement licenseElement = psmetaElements.get(2);
        	String license = licenseElement.getText();
        	project.setLicense(license);
        }
        
        WebElement projectLabelsElement = leftElement.findElement(By.id("project_labels"));
        List<WebElement> labelElements = projectLabelsElement.findElements(By.className("label"));
        for(WebElement labelElement : labelElements) {
        	String labelName = labelElement.getText();
        	GoogleProjectLabel projectLabel = getProjectLabel(labelName);
        	project.getLabels().add(projectLabel);
        }
        
        List<WebElement> userElements = leftElement.findElements(By.className("userlink"));
        for(WebElement userElement : userElements) {
        	String username = userElement.getText();
        	GoogleUser user = getUser(username);
        	project.getMembers().add(user); 
        }
        		
        
        // Info from the main column (right)
        WebElement rightElement = driver.findElement(By.id("wikicontent"));
        String description = rightElement.getText();
        project.setDescription(description);
        
        // The rest        
        GoogleIssueTracker issueTracker = GooglecodeFactory.eINSTANCE.createGoogleIssueTracker();
        issueTracker.setUrl(projectURL + "/issues");
        project.setIssueTracker(issueTracker);
        
        GoogleWiki wiki = GooglecodeFactory.eINSTANCE.createGoogleWiki();
        project.setWiki(wiki);
        
        return project;   
				
	}
	

    public void injectIssues(String projectURL) {
    	WebDriver driver = getDriver();

        // TODO the URL param sets the limit to 1000, check if there are more!
        String issuesURL = projectURL + "/issues/list?num=1000&start=0";
        driver.get(issuesURL);
        List<WebElement> issueElements = driver.findElements(By.className("ifOpened"));
        
        int counter = 0;
        for(WebElement issue : issueElements) {
        	// Navigating to issue page        	
        	WebElement aIssue = issue.findElement(By.tagName("a"));
        	String href = aIssue.getAttribute("href");
        	GoogleIssue googleIssue = injectIssue(href);
        	issues.put(googleIssue.getId(), googleIssue);
        	if(++counter >= MAX_ELEMS) 
        		break;
        }
    }
    
    public GoogleIssue injectIssue(String issueURL) {
    	GoogleIssue googleIssue = GooglecodeFactory.eINSTANCE.createGoogleIssue();
    	
    	// Navigating to issue page
    	WebDriver driver = getDriver();
    	driver.get(issueURL);
    	
    	// Analyzing the header
    	WebElement header = driver.findElement(By.id("issueheader"));
    
    	String id = header.findElement(By.className("h3")).findElement(By.tagName("a")).getText();
    	googleIssue.setId(id);
    	
    	String summary = header.findElements(By.tagName("td")).get(1).getText();
    	googleIssue.setSummary(summary);
    	
    	// Searching the stars
    	List<WebElement> secondTRHeader = header.findElements(By.tagName("tr"));
    	if(secondTRHeader.size() > 0) {
    		List<WebElement> secondTDHeader = secondTRHeader.get(1).findElements(By.tagName("td"));
    		if(secondTDHeader.size() > 0) {
    	    	String starString = secondTDHeader.get(1).getText();
    	    	String stars = starString.substring(0, starString.indexOf(" " ));
    	    	googleIssue.setStars(stars);
    		}
    	}
    	
    	// Analyzing the left side info
    	WebElement leftElement = driver.findElement(By.id("meta-float"));
    	List<WebElement> tableElements = leftElement.findElements(By.tagName("tr"));
    	
    	if(tableElements.size() > 0) {
	    	WebElement statusElement = tableElements.get(0);
	    	String status = statusElement.findElement(By.tagName("td")).getText();
	    	googleIssue.setStatus(status);
    	}
    	
    	if(tableElements.size() > 1) {
    		WebElement ownerElement = tableElements.get(1);
    		String owner = ownerElement.findElement(By.tagName("td")).getText();
    		GoogleUser user = getUser(owner);
    		googleIssue.setOwner(user);
    	}
    	
    	if(tableElements.size() > 2) {
    		WebElement ccElementContainer = tableElements.get(2);
    		List<WebElement> ccElements = ccElementContainer.findElements(By.className("userlink"));
    		for(WebElement ccElement : ccElements) {
    			String cc = ccElement.getText();
    			GoogleUser user = getUser(cc);
    			googleIssue.getCc().add(user);
    		}
    	}

		List<WebElement> labelElements = leftElement.findElements(By.className("label"));
		for(WebElement labelElement : labelElements) {
			String labelName = labelElement.getText();
			GoogleIssueLabel issueLabel = getIssueLabel(labelName);
			googleIssue.getLabels().add(issueLabel);
		}
    	
    	WebElement blockElement = leftElement.findElement(By.className("rel_issues"));
    	if(blockElement != null ) {
    		// TODO Support for Blocked and Blocking elements
    	}
    	
    	// Analyzing the main content
    	WebElement rightElement = driver.findElement(By.className("issuedescription"));
    	
    	WebElement authorElement = rightElement.findElement(By.className("author"));
    	String reporter = authorElement.findElement(By.className("userlink")).getText();
    	GoogleUser user = getUser(reporter);
    	googleIssue.setReporter(user);
    	
    	WebElement descriptionElement = rightElement.findElement(By.tagName("pre"));
    	String description = descriptionElement.getText();
    	googleIssue.setDescription(description);
    			
    	WebElement dateElement = rightElement.findElement(By.className("date"));
    	String date = dateElement.getText();
    	googleIssue.setDate(date);
    	
    	// Analyzing the comments
    	List<WebElement> commentElements = rightElement.findElements(By.className("issuecomment"));
    	for(WebElement commentElement : commentElements) {
    		GoogleIssueComment comment = GooglecodeFactory.eINSTANCE.createGoogleIssueComment();
    		
    		String commentDate = commentElement.findElement(By.className("date")).getText();
    		comment.setDate(commentDate);
    		
    		String commentAuthor = commentElement.findElement(By.className("author")).findElement(By.className("userlink")).getText();
    		GoogleUser commentUser = getUser(commentAuthor);
    		comment.setOwner(commentUser);
    		
    		String commentText = commentElement.findElement(By.tagName("pre")).getText();
    		comment.setText(commentText);
    	
    		googleIssue.getComments().add(comment);
    	}
    	
    	return googleIssue;    	
    }

    public void injectWikiPages(String projectURL) {
        WebDriver driver = getDriver();

        // TODO the URL param sets the limit to 1000, check if there are more!
        String issuesURL = projectURL + "/w/list?num=1000&start=0";
        driver.get(issuesURL);
        List<WebElement> wikipagesElement = driver.findElements(By.className("ifOpened"));
        
        int counter = 0;
        for(WebElement wikipageElement : wikipagesElement) {
        	String wikipageURL = wikipageElement.findElement(By.className("col_0")).findElement(By.tagName("a")).getAttribute("href");
        	GoogleWikiPage wikipage = injectWikiPage(wikipageURL);
        	wikipages.put(wikipage.getName(), wikipage);
        	if(++counter >= MAX_ELEMS) 
        		break;
        	
        }
    }
    
    public GoogleWikiPage injectWikiPage(String url) {
    	GoogleWikiPage wikipage = GooglecodeFactory.eINSTANCE.createGoogleWikiPage();
    	
    	WebDriver driver = getDriver();
    	driver.get(url);
    	
    	// Info from the header
    	WebElement headerElement = driver.findElement(By.id("wikiheader"));
    	
    	WebElement nameElement = headerElement.findElement(By.tagName("span"));
    	String name = nameElement.getText();
    	wikipage.setName(name);
    	
    	WebElement summaryElement = headerElement.findElement(By.tagName("i"));
    	String summary = summaryElement.getText();
    	wikipage.setSummary(summary);
    	
    	WebElement authorElement = headerElement.findElement(By.id("wikiauthor"));
    	
    	WebElement dateElement = authorElement.findElement(By.tagName("span"));
    	wikipage.setUpdated_at(dateElement.getText());
    	
    	WebElement userLinkElement = authorElement.findElement(By.className("userlink"));
    	GoogleUser user = getUser(userLinkElement.getText());
    	wikipage.setOwner(user);
    	
    	List<WebElement> labelElements = headerElement.findElements(By.className("label"));
    	for(WebElement labelElement : labelElements) {
    		String label = labelElement.getText();
    		GoogleWikiLabel wikiLabel = getWikiLabel(label);
    		wikipage.getLabels().add(wikiLabel);
    	}
    	
    	// Info from the content
    	WebElement contentElement = driver.findElement(By.id("wikicontent"));
    	wikipage.setContent(contentElement.getText());
    	
    	return wikipage;
    }

	public void save(String pathName, GoogleCodeProject project) {
		ResourceSet rset = new ResourceSetImpl();
		rset.getPackageRegistry().put(GooglecodePackage.eNS_URI, GooglecodePackage.eINSTANCE);
		rset.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource res = rset.createResource(URI.createFileURI(pathName));
		res.getContents().add(project);
		try {
			res.save(null);
		} catch (IOException e) {
			System.err.println("Problem saving the model");
			e.printStackTrace();
		}
	}
}
