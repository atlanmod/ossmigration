package extractor.psm.github;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.egit.github.core.RepositoryId;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opera.core.systems.scope.protos.EsdbgProtos.ExamineList;

public class GitHubRepoWikiExtractor {
	
	private GitHubModelQuerier querier;
	private static final String WIKI = "wiki";
	private String login, password, projectName;
	private final String GITHUB_WEBSITE = "https://github.com";
	private final String LOGIN_DIR = "login";
	private final String NEW_PAGE_DIR = "_new";
	private WebDriver driver;
	private final String LOGIN_FIELD = "login_field";
	private final String PSW_FIELD = "password";
	private final String SIGNIN_BUTTON = "commit";
	private final String EDIT_PAGE_BUTTON = "Edit";
	private final String DELETE_PAGE_BUTTON = "Delete Page";
	private final String WIKI_PAGES = "wiki-pages";
	private final String CREATE_FIRST_PAGE = "Create first page";
	private final String EDITOR_PAGE_TITLE = "gollum-editor-page-title";
	private final String EDITOR_PAGE_BODY = "gollum-editor-body";
	private final String EDITOR_PAGE_SUBMIT = "gollum-editor-submit";
	private final String PAGE_NOT_FOUND_ID = "parallax_wrapper";
	private String WIKI_PAGE = "";
	
	public GitHubRepoWikiExtractor() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		this.driver = new ChromeDriver();
		
		//currently htmlUnitDriver is not able to deal with alert message
		//this.driver = new HtmlUnitDriver();
	}
	
	public void initQuerier(String githubModelPath) throws IOException {
		if (this.querier == null)
			this.querier = new GitHubModelQuerier(githubModelPath);	
	}
	
	
	private void staticWait(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void expandPageList() {
		try {
			driver.findElement(By.className("js-wiki-more-pages-link")).click();
		}
		catch (Exception e) {}
	}
	
	
	public List<String> getWikiPageHrefs() {
		expandPageList();
		
		List<WebElement> pages = driver.findElement(By.className(WIKI_PAGES)).findElements(By.tagName("li"));
		List<String> page_hrefs = new LinkedList<String>();
		//collect wiki page hrefs
		for (WebElement page : pages) {
			try {
				String href = page.findElement(By.tagName("strong")).findElement(By.tagName("a")).getAttribute("href");
				page_hrefs.add(href);
			}
			catch (Exception e) {
				continue;
			}
		}
		
		return page_hrefs;
	}
		
	
	public void deleteWikiPages(List<String> page_hrefs) {	
		for (String href : page_hrefs) {
			driver.get(href);
			WebDriverWait wait = new WebDriverWait(driver, 5);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText(EDIT_PAGE_BUTTON))).click();	
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText(DELETE_PAGE_BUTTON))).click();	
			
			driver.switchTo().alert().accept();
		}
		
		
	}
	
	
	public void accessGitHub() {
		
		driver.get(GITHUB_WEBSITE + "/" + LOGIN_DIR);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id(LOGIN_FIELD))).sendKeys(login);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(PSW_FIELD))).sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(By.name(SIGNIN_BUTTON))).click();
	}
	
	public void access(String URL) {
		driver.get(URL);
	}
	
	
	public boolean wikiExist() {
		boolean exist = false;
		access(WIKI_PAGE + "/Home/_edit");
		if (driver.getCurrentUrl().endsWith("/Home/_edit"))
			exist = true;
		
		return exist;
	}
		
	
	public void createWikiHomePage(String href) {
		String[] homeWikiContent = querier.getWikiHome();
		if (homeWikiContent != null) {
			String title = homeWikiContent[0];
			String body = homeWikiContent[1];
			
			access(href);
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
				
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EDITOR_PAGE_BODY))).sendKeys("\n" + title + "\n" + body);		
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EDITOR_PAGE_SUBMIT))).click();	
				
		}
	}
	
	
	public void createWikiPages(String projectNewWikiPageURL) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		for (String[] pageContent: querier.getWikiPages()) {
			access(projectNewWikiPageURL);
			
			driver.get(projectNewWikiPageURL);
			
			String title = pageContent[0];
			String body = pageContent[1];
			
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EDITOR_PAGE_TITLE))).sendKeys(title);		
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EDITOR_PAGE_BODY))).sendKeys(body);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(EDITOR_PAGE_SUBMIT))).click();	
			
		}
	}
	
	public void initGitHubProjectInformation(String login, String password, String projectName) {
		this.login = login;
		this.password = password;
		this.projectName = projectName;
		
		WIKI_PAGE = GITHUB_WEBSITE + "/" + this.login + "/" + this.projectName + "/" + WIKI;
		
	}
	
	public boolean repoAlreadyExists() {
		
		boolean found = false;
		access(GITHUB_WEBSITE + "/" + this.login + "/" + this.projectName);
		try {
			driver.findElement(By.id(PAGE_NOT_FOUND_ID));
		}
		catch (Exception e) {
			found = true;
		}
		
		return found;
	}
	
	
	public void extractWiki(Boolean replace, String githubModelPath, String login, String password, String projectName) throws IOException {
		initQuerier(githubModelPath);
		initGitHubProjectInformation(login, password, projectName);
		
		if(repoAlreadyExists()) {
			accessGitHub();
			
			if (wikiExist()) {
				if(replace) {
					access(WIKI_PAGE);
					List<String> hrefs = getWikiPageHrefs();
					deleteWikiPages(hrefs);
					createWikiHomePage(WIKI_PAGE + "/Home/_edit");
				}
			}
			else {
				createWikiHomePage(WIKI_PAGE + "/_new");
			}
			
			
			String projectNewWikiPageURL = WIKI_PAGE + "/" + NEW_PAGE_DIR;
			createWikiPages(projectNewWikiPageURL);
			
			driver.close();
		}
		else {
			System.out.println("Repository does not exit");
		}
	}

}
