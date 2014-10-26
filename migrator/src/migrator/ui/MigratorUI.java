package migrator.ui;

import javax.swing.JFrame;

import java.awt.event.*;
import java.awt.*;
import java.util.List;
import java.util.LinkedList;

import javax.swing.*;

import migrator.logic.Migrator;

public class MigratorUI extends JFrame implements ActionListener  {

    private JLabel urlGoogleProjectLabel, gitHubCredentialsLabel, gitHubLoginLabel, gitHubPasswordLabel, gitHubTokensLabel;
    private JTextField urlGoogleProject, gitHubLogin;
    private JTextArea gitHubTokens;
    private JPasswordField gitHubPassword;
    private JComboBox gitHubCredentialType;
    private Migrator migrator;
    
    private JPanel googleCode2GitHubPanel, loginPasswordPanel, tokensPanel, addRemoveTokens, selectTokens, selectedCredentialsPanel;
    
    private final String URL_GOOGLE_PROJECT = "URL Google Project";
    private final String GITHUB_CREDENTIALS = "GitHub credentials";
    private final String LOGIN = "login";
    private final String PASSWORD = "password";
    private final String LOGINPASSWORDGITHUB = LOGIN + "/" + PASSWORD;
    private final String GITHUBTOKENS = "tokens";
    private final String MIGRATE = "Migrate";
    private final int DEFAULT_SELECTED_GITHUB_CREDENTIALS_TYPE = 0;
    
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
        
        
        buttonMigrate = new JButton(MIGRATE);
        
        
        add(googleCode2GitHubPanel);
        add(selectedCredentialsPanel);
        add(buttonMigrate);

        buttonMigrate.addActionListener(this);
    }
    
    
    public void initGoogleCode2GitHubPanel(int indexSelectedGitHubCredentials) {
    	googleCode2GitHubPanel.setLayout(new GridLayout(0, 2));
        
        urlGoogleProjectLabel = new JLabel(URL_GOOGLE_PROJECT, SwingConstants.LEFT);
        urlGoogleProject = new JTextField(20);
        
        gitHubCredentialsLabel = new JLabel(GITHUB_CREDENTIALS, SwingConstants.LEFT);
        gitHubCredentialType = new JComboBox(new String[]{LOGINPASSWORDGITHUB, GITHUBTOKENS});
        gitHubCredentialType.setSelectedIndex(indexSelectedGitHubCredentials);
        gitHubCredentialType.addActionListener(this);
        
        googleCode2GitHubPanel.add(urlGoogleProjectLabel);
        googleCode2GitHubPanel.add(urlGoogleProject);
        googleCode2GitHubPanel.add(gitHubCredentialsLabel);
        googleCode2GitHubPanel.add(gitHubCredentialType);
        
        googleCode2GitHubPanel.setVisible(true);
    }
    
    
    public void initLoginPasswordPanel() {
    	this.loginPasswordPanel.setLayout(new GridLayout(0, 2));
    	
    	gitHubLoginLabel = new JLabel(LOGIN);
    	gitHubLogin = new JTextField(15);
    	gitHubPasswordLabel = new JLabel(PASSWORD);
    	gitHubPassword = new JPasswordField(15);
    	
    	this.loginPasswordPanel.add(gitHubLoginLabel);
    	this.loginPasswordPanel.add(gitHubLogin);
    	
    	this.loginPasswordPanel.add(gitHubPasswordLabel);
    	this.loginPasswordPanel.add(gitHubPassword);
    	
    	this.loginPasswordPanel.setVisible(true); 	
    }
    
    
    public void initTokensPanel() {
    	this.tokensPanel.setLayout(new GridLayout(0, 2));
    	
    	gitHubTokensLabel = new JLabel(GITHUBTOKENS);
    	
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
    		
    		if (selected.equals(GITHUBTOKENS)) {
    			tokens = this.gitHubTokens.getText();
    			
    			List<String> strippedTokens = new LinkedList<String>();
    			for (String t: tokens.split(",")) {
    				strippedTokens.add(t.trim());
    			}
    			
    			m.migrate(googleProject, strippedTokens);
    		}
			else {
				login = this.gitHubLogin.getText();
				password = this.gitHubPassword.getText();
				m.migrate(googleProject, login, password);
			}
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

    }

}

