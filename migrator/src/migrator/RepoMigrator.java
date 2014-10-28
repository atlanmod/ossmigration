package migrator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import googlecode.GooglecodePackage;
import injector.psm.googlecode.GoogleCodeInjector;
import m2m.googlecode2github.GoogleCode2GitHub;

import org.eclipse.emf.ecore.EPackage;

import GitHub.GitHubPackage;
import extractor.psm.github.GitHubRepoExtractor;

public class RepoMigrator {
	
	private Properties prop = new Properties();
	private final static String CONFIG_PROPERTIES_PATH = "config.properties";
	
	private GoogleCodeInjector injector = new GoogleCodeInjector();
	private GitHubRepoExtractor extractor = new GitHubRepoExtractor();
	private GoogleCode2GitHub transformation = new GoogleCode2GitHub();
	
	public RepoMigrator() {
		registerMetamodels();
		initProperties();
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
	
	
	public void migrate(boolean replaceGitHubRepoIfExist, String gitHubProject, String googleProject, String... tokens) throws IOException {
		// TODO Auto-generated method stub
		injector.inject(googleProject, prop.getProperty("GOOGLECODE_MODEL_PATH"));
		
		transformation.transform(prop.getProperty("GOOGLECODE_METAMODEL_PATH"),
								 prop.getProperty("GITHUB_METAMODEL_PATH"),
								 prop.getProperty("GOOGLECODE_MODEL_PATH"),
								 prop.getProperty("GITHUB_MODEL_PATH"),
								 prop.getProperty("TRANSFORMATION_ASM_PATH"));
		
		extractor.extractRepo(replaceGitHubRepoIfExist, gitHubProject, prop.getProperty("GITHUB_MODEL_PATH"), tokens);
	}

	public void migrate(boolean replaceGitHubRepoIfExist, String gitHubProject, String googleProject, String login, String password) throws IOException {
		injector.inject(googleProject, prop.getProperty("GOOGLECODE_MODEL_PATH"));
		
		transformation.transform(prop.getProperty("GOOGLECODE_METAMODEL_PATH"),
				 prop.getProperty("GITHUB_METAMODEL_PATH"),
				 prop.getProperty("GOOGLECODE_MODEL_PATH"),
				 prop.getProperty("GITHUB_MODEL_PATH"),
				 prop.getProperty("TRANSFORMATION_ASM_PATH"));
		
		extractor.extractRepo(replaceGitHubRepoIfExist, gitHubProject, prop.getProperty("GITHUB_MODEL_PATH"), login, password);
	}

}
