package migrator.ui;

import javax.swing.JFrame;

import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;

import javax.swing.*;

import migrator.RepoMigrator;

public class MigratorUI extends JFrame implements ActionListener  {

	public final static int WIDTH = 500;
	public final static int HEIGHT = 200;
	public final static int X_POS = 500;
	public final static int Y_POS = 300;
	public final static int SCRAP = 10;
	    
    private final String MIGRATE_ISSUES_AND_LABELS = "Migrate Issues and Labels";
    private final String MIGRATE_WIKI = "Migrate Wiki";
    
    public MigratorUI() {
    	setLayout(new GridLayout(0, 2));
    	
    	JButton migrateRepoButton = new JButton(MIGRATE_ISSUES_AND_LABELS);
    	JButton migrateWikiButton = new JButton(MIGRATE_WIKI);
    	
    	this.add(migrateRepoButton);
    	this.add(migrateWikiButton);
    	
    	migrateRepoButton.addActionListener(this);
    	migrateWikiButton.addActionListener(this);
    	
    }

    public void actionPerformed(ActionEvent e) {
    	String actionCommand = e.getActionCommand();
    	
    	if (actionCommand.equals(MIGRATE_ISSUES_AND_LABELS)) {
    		int x_location = X_POS;
    		int y_location = Y_POS + HEIGHT + SCRAP;
    		new MigratorRepoUI(x_location, y_location);
    	}
    	else {
    		int x_location = X_POS + WIDTH + SCRAP;
    		int y_location = Y_POS;
    		new MigratorWikiUI(x_location, y_location);
    	}
    }
    
    
    public static void main(String args[]) {
    	MigratorUI gui = new MigratorUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setLocation(X_POS, Y_POS);
        gui.setSize(WIDTH, HEIGHT);
        gui.setResizable(false);
        gui.setTitle("OSS Migrator");
        gui.setVisible(true);
        
        /* test parameters: 
         * url: https://code.google.com/p/guava-libraries
         * login: migrator
         * password: ihategooglescholar
         * token: 648d3ff6bd4e5c5128b04d692701e5151dcdbbb0
         * */

    }

}

