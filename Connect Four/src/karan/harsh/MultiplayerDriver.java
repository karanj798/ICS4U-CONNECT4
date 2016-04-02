package karan.harsh;
import javax.swing.*;
public class MultiplayerDriver {
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Connect 4 Made By: Karan & Harsh");
		frame.setVisible(true);
		frame.getContentPane().add(new MultiplayerPanel ());
		frame.getContentPane().add(frame, new AIPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 600);
		frame.setResizable(false);
	}
}
