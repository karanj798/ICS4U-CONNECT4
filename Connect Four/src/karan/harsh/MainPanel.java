package karan.harsh;

import javax.swing.*;

/**
 * 
 * @author Karan Jariwala, Harsh Joshi
 * @description This class creates a JFrame of SingleplayerPanel and MultiplayerPanel class according to
 * user's selection from JOptionPane.
 * 	
 *
 */
@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	private JFrame singlePlayer = new JFrame("Single Player");
	private JFrame multiPlayer = new JFrame("Multi Player");

	/**
	 * Constructor of the MainPanel class
	 */
	public MainPanel() {
		Object[] homeoption = { "Single Player Game", "Two Player Game", "Cancel" };
		int n = JOptionPane.showOptionDialog(null, "To play Connect 4, please select one of the options below.",
				"Connect 4", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, homeoption,
				homeoption[2]);
		if (n == 0) {
			singlePlayer.getContentPane().add(new SingleplayerPanel());
			singlePlayer.pack();
			singlePlayer.setVisible(true);
			singlePlayer.setResizable(false);
			singlePlayer.setSize(700, 700);
			singlePlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (n == 1) {
			multiPlayer.getContentPane().add(new MultiplayerPanel());
			multiPlayer.pack();
			multiPlayer.setVisible(true);
			multiPlayer.setResizable(false);
			multiPlayer.setSize(700, 700);
			multiPlayer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (n == 2) {
			int response = JOptionPane.showConfirmDialog(null, "Do you want to exit the program?");
			if (response == 0) {
				System.exit(0);
			} else if (response == 1) {
				new MainPanel();
			}
			while (response == 2) {
				response = JOptionPane.showConfirmDialog(null, "Do you want to exit the program?");
				if (response == 0) {
					System.exit(0);
				} else if (response == 1) {
					new MainPanel();
				}
			}
		}
	}
}
