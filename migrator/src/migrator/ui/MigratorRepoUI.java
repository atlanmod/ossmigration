package migrator.ui;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

import javax.swing.*;

import migrator.RepoMigrator;

public class MigratorRepoUI extends JFrame implements ActionListener  {

    private JTextField urlGoogleProject, gitHubLogin, githubRepositoryName;
    private JTextArea gitHubTokens;
    private JPasswordField gitHubPassword;
    private JComboBox gitHubCredentialType;
    
    private JPanel googleCode2GitHubPanel, loginPasswordPanel, 
				   tokensPanel, selectedCredentialsPanel, 
				   replaceGitHubRepositorySelectionPanel, decisionPanel, selectRepositoryNamePanel;
    
    private final String URL_GOOGLE_PROJECT = "Google Project URL";
    private final String GITHUB_CREDENTIALS = "GitHub credentials";
    private final String LOGIN = "Login";
    private final String PASSWORD = "Password";
    private final String LOGINPASSWORDGITHUB = LOGIN + "/" + PASSWORD;
    private final String GITHUBTOKENS = "Tokens";
    private final String MIGRATE = "Migrate";
    private final String POSITIVE_DECISION = "yes";
    private final String NEGATIVE_DECISION = "no";
    private final String REPLACE = "Overwrite Repository if exists?";
    private final String SELECT_REPOSITORY_NAME = "Select New Repository Name";
    private final int TOKEN_CREDENTIALS = 1;
    private final int LOGIN_PSW_CREDENTIALS = 0;
    private final int DEFAULT_SELECTED_GITHUB_CREDENTIALS_TYPE = LOGIN_PSW_CREDENTIALS;
    private final boolean DEFAULT_REPLACE_DECISION = true;
    private final String DEFAULT_TOKENS = "token-1, token-2, ...";
    
    private String current_google_url_project = "";
    private int current_selected_github_credentials = DEFAULT_SELECTED_GITHUB_CREDENTIALS_TYPE;
    private boolean current_decision = DEFAULT_REPLACE_DECISION;
    private String project_name_github = "";
    
    JButton buttonMigrate;

    public MigratorRepoUI(int xpos, int ypos) {
    	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	this.setSize(MigratorUI.WIDTH, MigratorUI.HEIGHT);
    	this.setLocation(xpos, ypos);
    	this.setTitle("Repo Migrator");
    	
    	setLayout(new GridLayout(0, 2));
    	
    	initMigratorRepoUI();
    	
    	this.setResizable(false);
    	this.setVisible(true);
    }
    
    
    public void initMigratorRepoUI() {
    	setLayout(new GridLayout(0, 1));
    	
    	googleCode2GitHubPanel = new JPanel();
    	initGoogleCode2GitHubPanel();
        
        if (this.current_selected_github_credentials == LOGIN_PSW_CREDENTIALS) {
	        loginPasswordPanel = new JPanel();
	        initLoginPasswordPanel();
	        this.selectedCredentialsPanel = loginPasswordPanel;
        }
	    else {
	    	tokensPanel = new JPanel();
	    	initTokensPanel();
	    	this.selectedCredentialsPanel = tokensPanel;
	    }
        
        replaceGitHubRepositorySelectionPanel = new JPanel();
        initReplaceGitHubRepositorySelectionPanel();
        
        selectRepositoryNamePanel = new JPanel();
        if (!this.current_decision) {
	    	initSelectRepositoryNamePanel();
        }
	    
        
        
        buttonMigrate = new JButton(MIGRATE);
        
        
        add(googleCode2GitHubPanel);
        add(selectedCredentialsPanel);
        add(replaceGitHubRepositorySelectionPanel);
        add(selectRepositoryNamePanel);
        add(buttonMigrate);

        buttonMigrate.addActionListener(this);
    }
    
    
    public void initGoogleCode2GitHubPanel() {
    	googleCode2GitHubPanel.setLayout(new GridLayout(0, 2));
        
        JLabel urlGoogleProjectLabel = new JLabel(URL_GOOGLE_PROJECT, SwingConstants.LEFT);
        urlGoogleProject = new JTextField();
        urlGoogleProject.setText(current_google_url_project);
        
        JLabel gitHubCredentialsLabel = new JLabel(GITHUB_CREDENTIALS, SwingConstants.LEFT);
        gitHubCredentialType = new JComboBox(new String[]{LOGINPASSWORDGITHUB, GITHUBTOKENS});
        gitHubCredentialType.setSelectedIndex(this.current_selected_github_credentials);
        gitHubCredentialType.addActionListener(this);
        
        googleCode2GitHubPanel.add(urlGoogleProjectLabel);
        googleCode2GitHubPanel.add(urlGoogleProject);
        googleCode2GitHubPanel.add(gitHubCredentialsLabel);
        googleCode2GitHubPanel.add(gitHubCredentialType);
        
        googleCode2GitHubPanel.setVisible(true);
    }
    
    
    public void initReplaceGitHubRepositorySelectionPanel() {
    	replaceGitHubRepositorySelectionPanel.setLayout(new GridLayout(0, 2));
    	
    	JLabel replaceGitHubRepositoryLabel = new JLabel(REPLACE);
    	 
    	
    	decisionPanel = new JPanel();
    	initDecisionPanel();
    	
        replaceGitHubRepositorySelectionPanel.add(replaceGitHubRepositoryLabel);
        replaceGitHubRepositorySelectionPanel.add(decisionPanel);
        
        replaceGitHubRepositorySelectionPanel.setVisible(true);
    	
    }
    
    
    public void initSelectRepositoryNamePanel() {
    	
    	selectRepositoryNamePanel.setLayout(new GridLayout(0, 2));
    	
    	JLabel selectRepositoryNameLabel = new JLabel(SELECT_REPOSITORY_NAME);
    	githubRepositoryName = new JTextField();
    	githubRepositoryName.setText(this.project_name_github);
    	
    	selectRepositoryNamePanel.add(selectRepositoryNameLabel);
    	selectRepositoryNamePanel.add(githubRepositoryName);
    	
    	selectRepositoryNamePanel.setVisible(true);
    }
    
    
    public void initDecisionPanel() {
    	//Create the radio buttons.
        JRadioButton positiveDecision = new JRadioButton(POSITIVE_DECISION);
        positiveDecision.setActionCommand(POSITIVE_DECISION);
        positiveDecision.setSelected(current_decision);

        JRadioButton negativeDecision = new JRadioButton(NEGATIVE_DECISION);
        negativeDecision.setActionCommand(NEGATIVE_DECISION);
        negativeDecision.setSelected(!current_decision);

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
    
    
    public void initTokensPanel() {
    	this.tokensPanel.setLayout(new GridLayout(0, 2));
    	
    	JLabel gitHubTokensLabel = new JLabel(GITHUBTOKENS);
    	
    	gitHubTokens = new JTextArea();
    	gitHubTokens.setText(DEFAULT_TOKENS);
    	
    	this.tokensPanel.add(gitHubTokensLabel);
    	this.tokensPanel.add(gitHubTokens);
    	
    	this.tokensPanel.setVisible(true);
    	
    }
    
    
    public String getGitHubRepositoryName() {
    	try {
    		this.project_name_github = githubRepositoryName.getText();
    	}
    	catch (Exception e) {
    		this.project_name_github = "";
    	}
    	
    	return this.project_name_github;
    	
    }
    
    
    public String getGoogleCodeURL() {
    	String url; 
    	if (this.current_google_url_project.equals(""))
    		url = this.urlGoogleProject.getText();
    	else
    		url = this.current_google_url_project;
    	
    	return url;
    }


    public void actionPerformed(ActionEvent e) {
    	String actionCommand = e.getActionCommand();
 
    	if (actionCommand.equals(MIGRATE)) {
    		this.migrate(e);
    		this.shutDown();
    	}
    	else {
    		this.updateParameters(e);
	    	this.updateFrame();
    	}
    }
    
    
    public void migrate(ActionEvent e) {
    	RepoMigrator m = new RepoMigrator();
		String selected = (String)this.gitHubCredentialType.getSelectedItem();
		String tokens, login, password;
		boolean replace = current_decision;
		String gitHubRepo = this.getGitHubRepositoryName();
		String googleURL = this.getGoogleCodeURL();
		   		
		if (selected.equals(GITHUBTOKENS)) {
			tokens = this.gitHubTokens.getText();
			
			try {
				m.migrate(current_decision, gitHubRepo, googleURL, tokens.split(","));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				this.shutDown();
			}
		}
		else {
			login = this.gitHubLogin.getText();
			password = this.gitHubPassword.getText();
			try {
				m.migrate(current_decision, gitHubRepo, googleURL, login, password);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				this.shutDown();
			}
		}
		
		this.shutDown();
    }
     
    
    public void updateParameters(ActionEvent e) {
    	current_google_url_project = urlGoogleProject.getText();	
    	
    	if (e.getActionCommand().equals(POSITIVE_DECISION)) {    		
    		this.current_decision = true;
    		this.project_name_github = "";
    	}
    	else if (e.getActionCommand().equals(NEGATIVE_DECISION)) {
    		this.current_decision = false;   		
    	}
    	else {
    		String selected = (String)this.gitHubCredentialType.getSelectedItem();
    		if (selected.equals(GITHUBTOKENS)) {
    			this.current_selected_github_credentials = TOKEN_CREDENTIALS;
    		}
    		else {
    			this.current_selected_github_credentials = LOGIN_PSW_CREDENTIALS;
    		}
    	}
    }
    
    
    public void updateFrame() {
    	this.getContentPane().removeAll();
    	initMigratorRepoUI();
		validate();
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

