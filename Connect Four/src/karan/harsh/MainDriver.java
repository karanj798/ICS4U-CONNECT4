package karan.harsh;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainDriver extends JFrame implements ActionListener {
	private JFrame frame; 
	private JPanel panel, panel1, panel2; 
	private JButton btnSingle, btnMulti;
	
	public static void main(String[] args) {
		MainDriver md = new MainDriver();
		
	}
	public MainDriver () {
		frame = new JFrame("Connect 4");
		panel = new JPanel();
		btnSingle = new JButton("Single Player");
		btnSingle.addActionListener(this);
		btnMulti = new JButton("Multi Player");
		btnMulti.addActionListener(this);
		panel.add(btnSingle);
		panel.add(btnMulti);
		add(panel);
		setVisible(true);
		setSize(700, 600);
		setResizable(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSingle) {
			// make a new frame
		}
		if (e.getSource() == btnMulti) {
			remove(panel);
			panel2 = new MultiplayerPanel ();
			add(panel2);
		}
	}
}
