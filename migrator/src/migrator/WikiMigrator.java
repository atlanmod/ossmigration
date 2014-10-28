package migrator;

import extractor.psm.github.GitHubRepoExtractor;
import extractor.psm.github.GitHubRepoWikiExtractor;
import googlecode.GooglecodePackage;
import injector.psm.googlecode.GoogleCodeInjector;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import m2m.googlecode2github.GoogleCode2GitHub;

import org.eclipse.emf.ecore.EPackage;

import GitHub.GitHubPackage;

public class WikiMigrator {
	
	private Properties prop = new Properties();
	private final static String CONFIG_PROPERTIES_PATH = "config.properties";
	
	private GoogleCodeInjector injector = new GoogleCodeInjector();
	private GitHubRepoWikiExtractor extractor = new GitHubRepoWikiExtractor();
	private GoogleCode2GitHub transformation = new GoogleCode2GitHub();
	
	public WikiMigrator() {
		initProperties();
		registerMetamodels();
	}
	
	public void initProperties() {
		String filename = CONFIG_PROPERTIES_PATH;
		try {
			InputStream input = new FileInputStream(filename);
			prop.load(input);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void registerMetamodels() {
		EPackage.Registry.INSTANCE.put(GooglecodePackage.eNS_URI, GooglecodePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(GitHubPackage.eNS_URI, GitHubPackage.eINSTANCE);
	}
	

	public void migrate(boolean replace, String googleProject, String login, String password, String githubProject) throws IOException {
		// TODO Auto-generated method stub
		injector.inject(googleProject, prop.getProperty("GOOGLECODE_MODEL_PATH"));
		
		transformation.transform(prop.getProperty("GOOGLECODE_METAMODEL_PATH"),
				 prop.getProperty("GITHUB_METAMODEL_PATH"),
				 prop.getProperty("GOOGLECODE_MODEL_PATH"),
				 prop.getProperty("GITHUB_MODEL_PATH"),
				 prop.getProperty("TRANSFORMATION_ASM_PATH"));
		
		extractor.extractWiki(replace, prop.getProperty("GITHUB_MODEL_PATH"), login, password, githubProject);
	}

}
