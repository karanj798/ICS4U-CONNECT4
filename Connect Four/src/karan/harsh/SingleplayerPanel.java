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

	public SingleplayerPanel() {
		setPreferredSize(new Dimension(500, 600));
		setLayout(new GridLayout(8, 0, 55, 20));
		setBackground(Color.BLUE);
		btnA = new JButton("A");
		btnA.setPreferredSize(new Dimension(100, 100));
		add(btnA);
		btnA.addActionListener(new ClickListener());
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

		btnB.addActionListener(new ClickListener());
		btnC.addActionListener(new ClickListener());
		btnD.addActionListener(new ClickListener());
		btnE.addActionListener(new ClickListener());
		btnF.addActionListener(new ClickListener());
		btnG.addActionListener(new ClickListener());

		ai = new AI();
		ai.makeBoard(); // makes board
	}

	public class ClickListener implements ActionListener {
		int x, y;
		char player = 'R', AI = 'Y';

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnA) {
				y = 0;
				x = ai.getIndex(y);
				ai.updateBoard(x, y, player);
				updatePlayer(x, y);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (x == 0) {
					btnA.setEnabled(false);
				}
			}
			if (e.getSource() == btnB) {
				y = 1;
				x = ai.getIndex(y);
				ai.updateBoard(x, y, player);
				updatePlayer(x, y);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (x == 0) {
					btnA.setEnabled(false);
				}
			}
			if (e.getSource() == btnC) {
				y = 2;
				x = ai.getIndex(y);
				ai.updateBoard(x, y, player);
				updatePlayer(x, y);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (x == 0) {
					btnA.setEnabled(false);
				}
			}
			if (e.getSource() == btnD) {
				y = 3;
				x = ai.getIndex(y);
				ai.updateBoard(x, y, player);
				updatePlayer(x, y);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (x == 0) {
					btnA.setEnabled(false);
				}
			}
			if (e.getSource() == btnE) {
				y = 4;
				x = ai.getIndex(y);
				ai.updateBoard(x, y, player);
				updatePlayer(x, y);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (x == 0) {
					btnA.setEnabled(false);
				}
			}
			if (e.getSource() == btnF) {
				y = 5;
				x = ai.getIndex(y);
				ai.updateBoard(x, y, player);
				updatePlayer(x, y);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (x == 0) {
					btnA.setEnabled(false);
				}
			}
			if (e.getSource() == btnG) {
				y = 6;
				x = ai.getIndex(y);
				ai.updateBoard(x, y, player);
				updatePlayer(x, y);
				ai.move();
				updateAI(ai.getAIX(), ai.getAIY());
				ai.checkWinnerA();
				ai.checkWinnerB();
				if (x == 0) {
					btnA.setEnabled(false);
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
				JOptionPane.showMessageDialog(null, "Player wins!");
				System.exit(10);

			} else if (ai.getWinnerB()) {

				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				JOptionPane.showMessageDialog(null, "AI wins!");
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
