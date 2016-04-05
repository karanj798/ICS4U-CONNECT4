package karan.harsh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class SingleplayerPanel extends JPanel {
	private JLabel lblCircles[][];
	private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG;
	AI ai;
	final int COL_LENGTH = 7;
	final int ROW_LENGTH = 7;
	String  UserName = "";

	public SingleplayerPanel() {
		setPreferredSize(new Dimension(500, 600));
		setLayout(new GridLayout(8, 0, 55, 20));
		setBackground(Color.BLUE);
		ImageIcon image = new ImageIcon (getClass().getResource("/resources/arrowDown.png"));
		btnA = new JButton(image);
		btnA.setPreferredSize(new Dimension(100, 100));
		btnA.setContentAreaFilled(false);
		add(btnA);
		
		btnB = new JButton(image);
		btnB.setPreferredSize(new Dimension(100, 100));
		btnB.setContentAreaFilled(false);
		add(btnB);
		
		btnC = new JButton(image);
		btnC.setPreferredSize(new Dimension(100, 100));
		btnC.setContentAreaFilled(false);
		add(btnC);
		
		btnD = new JButton(image);
		btnD.setPreferredSize(new Dimension(100, 100));
		btnD.setContentAreaFilled(false);
		add(btnD);
		
		btnE = new JButton(image);
		btnE.setPreferredSize(new Dimension(100, 100));
		btnE.setContentAreaFilled(false);
		add(btnE);
		
		btnF = new JButton(image);
		btnF.setPreferredSize(new Dimension(100, 100));
		btnF.setContentAreaFilled(false);
		add(btnF);
		
		btnG = new JButton(image);
		btnG.setPreferredSize(new Dimension(100, 100));
		btnG.setContentAreaFilled(false);
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

		ai = new AI();
		ai.makeBoard(); 
		
		UserName = JOptionPane.showInputDialog(null, "Name of Player: ");

		while (UserName == null || UserName.isEmpty()) {
			UserName = JOptionPane.showInputDialog(null, "Name of Player: ");
		}
	}

	public class ClickListener implements ActionListener {
		int rowPlayer, colPlayer;
		char playerColor = 'R';

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnA) {
				colPlayer = 0;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnA.setEnabled(false);
				}
			}
			if (e.getSource() == btnB) {
				colPlayer = 1;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnB.setEnabled(false);
				}
			}
			if (e.getSource() == btnC) {
				colPlayer = 2;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnC.setEnabled(false);
				}
			}
			if (e.getSource() == btnD) {
				colPlayer = 3;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnD.setEnabled(false);
				}
			}
			if (e.getSource() == btnE) {
				colPlayer = 4;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnE.setEnabled(false);
				}
			}
			if (e.getSource() == btnF) {
				colPlayer = 5;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnF.setEnabled(false);
				}
			}
			if (e.getSource() == btnG) {
				colPlayer = 6;
				rowPlayer = ai.getIndex(colPlayer);
				ai.updateBoard(rowPlayer, colPlayer, playerColor);
				updatePlayer(rowPlayer, colPlayer);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (rowPlayer == 0) {
					btnG.setEnabled(false);
				}
			}
			
			if (ai.isColumnFull (ai.getAIY())){
				if (ai.getAIY() == 0){
					btnA.setEnabled(false);
				}
				else if ((ai.getAIY() == 1)){
					btnB.setEnabled(false);
				}
				else if ((ai.getAIY() == 2)){
					btnC.setEnabled(false);
				}
				else if ((ai.getAIY() == 3)){
					btnD.setEnabled(false);
				}
				else if ((ai.getAIY() == 4)){
					btnE.setEnabled(false);
				}
				else if ((ai.getAIY() == 5)){
					btnF.setEnabled(false);
				}
				else if ((ai.getAIY() == 6)){
					btnG.setEnabled(false);
				}
				
			}
			
			if (ai.getWinnerA()) {
				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				JOptionPane.showMessageDialog(null,  UserName + " wins!");
				System.exit(10);

			} else if (ai.getWinnerB()) {

				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Computer wins!");
				System.exit(10);
			} else if (ai.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Tie Game!");
				System.exit(10);
			}
		}
	}

	public void updatePlayer(int i, int j) {
		lblCircles[i][j].setIcon(new ImageIcon(getClass().getResource("/resources/redChip.png")));
	}

	public void updateAI(int i, int j) {
		lblCircles[i][j].setIcon(new ImageIcon(getClass().getResource("/resources/yellowChip.png")));

	}
}
