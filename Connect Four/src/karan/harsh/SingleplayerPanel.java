package karan.harsh;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import karan.harsh.MultiplayerPanel.ClickListener;

public class SingleplayerPanel extends JPanel{
	JLabel lblCircles[][];
	JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG;
	JLabel lblTitle;

	public SingleplayerPanel() {
		setPreferredSize(new Dimension(500, 600));
		setLayout(new GridLayout(8, 0, 55, 20));
		setBackground(Color.BLACK);
		btnA = new JButton("A");
		btnA.setPreferredSize(new Dimension(100, 100));
		add(btnA);
		btnB = new JButton("B");
		btnB.setPreferredSize(new Dimension(100, 100));
		add(btnB);
		btnC = new JButton("C");
		btnC.setPreferredSize(new Dimension(100, 100));
		add(btnC);
		btnD = new JButton("D");
		btnD.setPreferredSize(new Dimension(100, 100));
		add(btnD);
		btnE = new JButton("E");
		btnE.setPreferredSize(new Dimension(100, 100));
		add(btnE);
		btnF = new JButton("F");
		btnF.setPreferredSize(new Dimension(100, 100));
		add(btnF);
		btnG = new JButton("G");
		btnG.setPreferredSize(new Dimension(100, 100));
		add(btnG);
		lblCircles = new JLabel[7][7];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				lblCircles[i][j] = new JLabel();
				lblCircles[i][j].setIcon(new ImageIcon(getClass().getResource("/resources/whiteChip.png")));
				add(lblCircles[i][j]);
			}
		}

		btnA.addActionListener(new ClickListener());
		btnB.addActionListener(new ClickListener());
		btnC.addActionListener(new ClickListener());
		btnD.addActionListener(new ClickListener());
		btnE.addActionListener(new ClickListener());
		btnF.addActionListener(new ClickListener());
		btnG.addActionListener(new ClickListener());

	}
	public class ClickListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnA){
				
			}
			if (e.getSource() == btnB){
				
			}
			if (e.getSource() == btnC){
				
			}
			if (e.getSource() == btnD){
				
				0 
			}
		}
	}
}
