package karan.harsh;

import javax.swing.*;


@SuppressWarnings("serial")
public class MainDriver extends JFrame {

	
	public static void main(String[] args) {
		new MainDriver();
	}
	public MainDriver () {
		JFrame frame = new JFrame("Connect 4");
		JPanel panel = new JPanel();
		
		Object[] homeoption = {"Single Player", "Multiplayer", "Instructions"};
		int n = JOptionPane.showOptionDialog(frame,"To play Connect 4, please select one of the options below.",
			    "Connect 4",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    homeoption,
			    homeoption[2]);
		if (n == 0){
			JFrame optionFrame = new JFrame("Connect Four");
			optionFrame.getContentPane().add(new SingleplayerPanel());
			optionFrame.pack();
			optionFrame.setVisible(true);
			optionFrame.setResizable(false);
			optionFrame.setSize(700, 600);
			optionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (n == 1){
			JFrame optionFrame = new JFrame("Connect Four");
			optionFrame.getContentPane().add(new MultiplayerPanel());
			optionFrame.pack();
			optionFrame.setVisible(true);
			optionFrame.setResizable(false);
			optionFrame.setSize(700, 600);
			optionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	}
}
