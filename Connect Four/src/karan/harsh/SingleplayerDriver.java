package karan.harsh;

import javax.swing.JFrame;

public class SingleplayerDriver {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Single Player");
		frame.setVisible(true);
		frame.getContentPane().add(new SingleplayerPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 600);
		frame.setResizable(false);
	}
}
