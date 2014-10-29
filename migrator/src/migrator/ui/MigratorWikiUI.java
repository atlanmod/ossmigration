package migrator.ui;

import javax.swing.JFrame;

import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

import javax.swing.*;

import migrator.RepoMigrator;
import migrator.WikiMigrator;

public class MigratorWikiUI extends JFrame implements ActionListener  {

    private JTextField urlGoogleProject, gitHubLogin, githubRepositoryName;
    private JPasswordField gitHubPassword;
    
    private JPanel googleCode2GitHubPanel, loginPasswordPanel, selectRepositoryNamePanel,
				   replaceGitHubRepositoryWikiPanel, decisionPanel;
    
    private final String URL_GOOGLE_PROJECT = "Google Project URL";
    private final String GITHUB_CREDENTIALS = "GitHub credentials";
    private final String LOGIN = "Login";
    private final String PASSWORD = "Password";
    private final String LOGINPASSWORDGITHUB = LOGIN + "/" + PASSWORD;
    private final String MIGRATE = "Migrate";
    private final String POSITIVE_DECISION = "yes";
    private final String NEGATIVE_DECISION = "no";
    private final String SELECT_REPOSITORY_NAME = "Name Repository";
    private final String REPLACE = "Replace Wiki if exists?";
    private final boolean DEFAULT_REPLACE_DECISION = false;
    private boolean current_decision = DEFAULT_REPLACE_DECISION;

    
    JButton buttonMigrate;

    public MigratorWikiUI(int xpos, int ypos) {
    	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	this.setSize(MigratorUI.WIDTH, MigratorUI.HEIGHT);
    	this.setLocation(xpos, ypos);
    	this.setTitle("Wiki Migrator");
    	
    	setLayout(new GridLayout(0, 2));
    	
    	initMigratorWikiUI(LOGINPASSWORDGITHUB);
    	
    	this.setResizable(false);
    	this.setVisible(true);
    }
    
    
    public void initMigratorWikiUI(String credentialsType) {
    	setLayout(new GridLayout(0, 1));
    	
    	googleCode2GitHubPanel = new JPanel();
    	initGoogleCode2GitHubPanel();
        
        loginPasswordPanel = new JPanel();
	    initLoginPasswordPanel();
	    
	    selectRepositoryNamePanel = new JPanel();
	    initSelectRepositoryNamePanel();
	    
        replaceGitHubRepositoryWikiPanel = new JPanel();
        initReplaceGitHubRepositoryWikiPanel();
        
        
        buttonMigrate = new JButton(MIGRATE);
        
        
        add(googleCode2GitHubPanel);
        add(loginPasswordPanel);
        add(selectRepositoryNamePanel);
        add(replaceGitHubRepositoryWikiPanel);
        add(buttonMigrate);

        buttonMigrate.addActionListener(this);
    }
    
    
    public void initGoogleCode2GitHubPanel() {
    	googleCode2GitHubPanel.setLayout(new GridLayout(0, 2));
        
        JLabel urlGoogleProjectLabel = new JLabel(URL_GOOGLE_PROJECT, SwingConstants.LEFT);
        urlGoogleProject = new JTextField();
        
        JLabel gitHubCredentialsLabel = new JLabel(GITHUB_CREDENTIALS, SwingConstants.LEFT);
        
        googleCode2GitHubPanel.add(urlGoogleProjectLabel);
        googleCode2GitHubPanel.add(urlGoogleProject);
        googleCode2GitHubPanel.add(gitHubCredentialsLabel);
       
        
        googleCode2GitHubPanel.setVisible(true);
    }
    
    
    public void initReplaceGitHubRepositoryWikiPanel() {
    	replaceGitHubRepositoryWikiPanel.setLayout(new GridLayout(0, 2));
    	
    	JLabel replaceGitHubWikiLabel = new JLabel(REPLACE);
    	 
    	
    	decisionPanel = new JPanel();
    	initDecisionPanel();
    	
        
    	replaceGitHubRepositoryWikiPanel.add(replaceGitHubWikiLabel);
    	replaceGitHubRepositoryWikiPanel.add(decisionPanel);
        
    	replaceGitHubRepositoryWikiPanel.setVisible(true);
    	
    }
    
    
    public void initDecisionPanel() {
    	//Create the radio buttons.
        JRadioButton positiveDecision = new JRadioButton(POSITIVE_DECISION);
        positiveDecision.setActionCommand(POSITIVE_DECISION);
        positiveDecision.setSelected(DEFAULT_REPLACE_DECISION);

        JRadioButton negativeDecision = new JRadioButton(NEGATIVE_DECISION);
        negativeDecision.setActionCommand(POSITIVE_DECISION);
        negativeDecision.setSelected(!DEFAULT_REPLACE_DECISION);

        //Group the radio buttons.
        ButtonGroup group = new ButtonGroup();
        group.add(positiveDecision);
        group.add(negativeDecision);

        //Register a listener for the radio buttons.
        positiveDecision.addActionListener(this);
        negativeDecision.addActionListener(this);
        
        decisionPanel.add(positiveDecision);
        decisionPanel.add(negativeDecision);
        
        decisionPanel.setVisible(true);
    }
    
    
    public void initLoginPasswordPanel() {
    	this.loginPasswordPanel.setLayout(new GridLayout(0, 2));
    	
    	JLabel gitHubLoginLabel = new JLabel(LOGIN);
    	gitHubLogin = new JTextField();
    	JLabel gitHubPasswordLabel = new JLabel(PASSWORD);
    	gitHubPassword = new JPasswordField();
    	
    	this.loginPasswordPanel.add(gitHubLoginLabel);
    	this.loginPasswordPanel.add(gitHubLogin);
    	
    	this.loginPasswordPanel.add(gitHubPasswordLabel);
    	this.loginPasswordPanel.add(gitHubPassword);
    	
    	this.loginPasswordPanel.setVisible(true); 	
    }
    
    
    public void initSelectRepositoryNamePanel() {
    	this.selectRepositoryNamePanel.setLayout(new GridLayout(0, 2));
    	
    	JLabel gitHubRepositoryNameLabel = new JLabel(SELECT_REPOSITORY_NAME);
    	githubRepositoryName = new JTextField();
    	
    	this.selectRepositoryNamePanel.add(gitHubRepositoryNameLabel);
    	this.selectRepositoryNamePanel.add(githubRepositoryName);
    	
    	this.selectRepositoryNamePanel.setVisible(true);
    	
    }


    public void actionPerformed(ActionEvent e) {
    	String actionCommand = e.getActionCommand();
    	
    	if (actionCommand.equals(MIGRATE)) {
    		WikiMigrator m = new WikiMigrator();
    		String googleProject = urlGoogleProject.getText();
    		String login = this.gitHubLogin.getText();
    		String password = this.gitHubPassword.getText();
    		String githubProject = this.githubRepositoryName.getText();
    		boolean replace = current_decision;
    		   						
			try {
				m.migrate(replace, googleProject, login, password, githubProject);
				this.shutDown();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}    	
    	}
    	else if (e.getActionCommand().equals(POSITIVE_DECISION)) {
    		this.current_decision = true;
    	}
    	else if (e.getActionCommand().equals(NEGATIVE_DECISION)) {
    		this.current_decision = false;
    	}
    }
    
    
    public void showErrorMessage(String message) {
    	final JFrame errorFrame = new JFrame();
    	JOptionPane.showMessageDialog(errorFrame, message);
    	errorFrame.setVisible(true);
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	errorFrame.setVisible(false);
    	errorFrame.dispose();
    }
    
    
    public void shutDown() {
    	this.setVisible(false);
    	this.dispose();
    }

}


