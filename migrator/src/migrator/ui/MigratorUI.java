package migrator.ui;

import javax.swing.JFrame;

import java.awt.event.*;
import java.awt.*;
import java.util.List;
import java.util.LinkedList;

import javax.swing.*;

import migrator.Migrator;

public class MigratorUI extends JFrame implements ActionListener  {

    private JTextField urlGoogleProject, gitHubLogin;
    private JTextArea gitHubTokens;
    private JPasswordField gitHubPassword;
    private JComboBox gitHubCredentialType;
    private Migrator migrator;
    
    private JPanel googleCode2GitHubPanel, loginPasswordPanel, 
				   tokensPanel, addRemoveTokens, selectTokens, selectedCredentialsPanel, 
				   replaceGitHubRepositorySelectionPanel, decisionPanel;
    
    private final String URL_GOOGLE_PROJECT = "URL Google Project";
    private final String GITHUB_CREDENTIALS = "GitHub credentials";
    private final String LOGIN = "login";
    private final String PASSWORD = "password";
    private final String LOGINPASSWORDGITHUB = LOGIN + "/" + PASSWORD;
    private final String GITHUBTOKENS = "tokens";
    private final String MIGRATE = "Migrate";
    private final String POSITIVE_DECISION = "yes";
    private final String NEGATIVE_DECISION = "no";
    private final String REPLACE = "Replace GitHub repository if exists?";
    private final int DEFAULT_SELECTED_GITHUB_CREDENTIALS_TYPE = 0;
    private final boolean DEFAULT_REPLACE_DECISION = false;
    private boolean current_decision = DEFAULT_REPLACE_DECISION;
    
    JButton buttonMigrate;

    public MigratorUI() {
    	this.initMigratorUI(LOGINPASSWORDGITHUB, DEFAULT_SELECTED_GITHUB_CREDENTIALS_TYPE);
    }
    
    
    public void initMigratorUI(String credentialsType, int selectedCredentials) {
    	setLayout(new GridLayout(0, 1));
    	
    	googleCode2GitHubPanel = new JPanel();
    	initGoogleCode2GitHubPanel(selectedCredentials);
        
        if (credentialsType.equals(LOGINPASSWORDGITHUB)) {
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
        
        
        buttonMigrate = new JButton(MIGRATE);
        
        
        add(googleCode2GitHubPanel);
        add(selectedCredentialsPanel);
        add(replaceGitHubRepositorySelectionPanel);
        add(buttonMigrate);

        buttonMigrate.addActionListener(this);
    }
    
    
    public void initGoogleCode2GitHubPanel(int indexSelectedGitHubCredentials) {
    	googleCode2GitHubPanel.setLayout(new GridLayout(0, 2));
        
        JLabel urlGoogleProjectLabel = new JLabel(URL_GOOGLE_PROJECT, SwingConstants.LEFT);
        urlGoogleProject = new JTextField(20);
        
        JLabel gitHubCredentialsLabel = new JLabel(GITHUB_CREDENTIALS, SwingConstants.LEFT);
        gitHubCredentialType = new JComboBox(new String[]{LOGINPASSWORDGITHUB, GITHUBTOKENS});
        gitHubCredentialType.setSelectedIndex(indexSelectedGitHubCredentials);
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
    	gitHubLogin = new JTextField(15);
    	JLabel gitHubPasswordLabel = new JLabel(PASSWORD);
    	gitHubPassword = new JPasswordField(15);
    	
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
    	gitHubTokens.setText("token-1, token-2, ...");
    	
    	this.tokensPanel.add(gitHubTokensLabel);
    	this.tokensPanel.add(gitHubTokens);
    	
    	this.tokensPanel.setVisible(true);
    	
    }


    public void actionPerformed(ActionEvent e) {
    	String actionCommand = e.getActionCommand();
    	
    	if (actionCommand.equals(MIGRATE)) {
    		Migrator m = new Migrator();
    		String selected = (String)this.gitHubCredentialType.getSelectedItem();
    		String googleProject = urlGoogleProject.getText();
    		String tokens, login, password;
    		boolean replace = current_decision;
    		   		
    		if (selected.equals(GITHUBTOKENS)) {
    			tokens = this.gitHubTokens.getText();
    			
    			m.migrate(replace, googleProject, tokens.split(","));
    		}
			else {
				login = this.gitHubLogin.getText();
				password = this.gitHubPassword.getText();
				m.migrate(replace, googleProject, login, password);
			}
    		
    		this.setVisible(false);
    		this.dispose();
    	}
    	else if (e.getActionCommand().equals(POSITIVE_DECISION)) {
    		this.current_decision = true;
    	}
    	else if (e.getActionCommand().equals(NEGATIVE_DECISION)) {
    		this.current_decision = false;
    	}
    	else {
    		String selected = (String)this.gitHubCredentialType.getSelectedItem();
    		this.getContentPane().removeAll();
    		if (selected.equals(GITHUBTOKENS)) {
    			initMigratorUI(GITHUBTOKENS, 1);
    		}
    		else {
    			initMigratorUI(LOGINPASSWORDGITHUB, 0);
    		}
    		validate();
    	}
    }


    public static void main(String args[]) {
    	MigratorUI gui = new MigratorUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(500, 200);
        gui.setTitle("OSS Migrator");
        gui.setVisible(true);
        
        /* test parameters: 
         * url: https://code.google.com/p/guava-libraries
         * login: migrator
         * password: ihategooglescholar
         * 
         * */

    }

}

