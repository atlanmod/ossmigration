package extractor.psm.github;

import java.awt.event.*;
import javax.swing.*;

public class CountDownTimer extends JFrame implements ActionListener  {
	int counter = 60*60*60;
    JLabel promptLabel, timerLabel;
    JButton button;
    Timer timer;

    public CountDownTimer() {
        timerLabel = new JLabel("Waiting...", SwingConstants.CENTER);
        add(timerLabel);
        timerLabel.setText("Time left: 60:00");
        
        timer = new Timer(1000, this);
        timer.start();
    }
    
    public void actionPerformed(ActionEvent tc) {
        counter--;

        if(counter >= 1) {
        	int seconds = (int) (counter % 60) ;
        	int minutes = (int) ((counter / 60) % 60);
        	
            timerLabel.setText(String.valueOf(minutes) + ":" + String.valueOf(seconds));
        }
        else {
        	timer.stop();
        	this.dispose();
        }
    }
    
    
    public static void main(String args[]) {
        CountDownTimer gui = new CountDownTimer();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(250, 100);
        gui.setVisible(true);

    }

}
