package karan.harsh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MultiplayerPanel extends JPanel {

	JLabel lblTitle;
	JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG;
	JLabel lblCircles[][];
	int x = 0, y = 7;
	boolean switchPlayer = false;
	Board board = new Board();
	String playerA = "";
	String playerB = "";

	public MultiplayerPanel() {
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

		board.makeBoard();

		playerA = JOptionPane.showInputDialog(null, "Name of Player A: ");

		while (playerA == null || playerA.isEmpty()) {
			playerA = JOptionPane.showInputDialog(null, "Name of Player A: ");
		}
		playerB = JOptionPane.showInputDialog(null, "Name of Player B: ");

		while (playerB == null || playerB.isEmpty()) {
			playerB = JOptionPane.showInputDialog(null, "Name of Player B: ");
		}
		
		JOptionPane.showMessageDialog(null, playerA + " is red.");
		JOptionPane.showMessageDialog(null, playerB + " is yellow.");
		JOptionPane.showMessageDialog(null, " It's " + playerA + "'s turn first.");
	}

	public void updateChips() {
		int x = board.getX();
		int y = board.getY();

		if (!board.getCondition()) {
			lblCircles[x][y].setIcon(new ImageIcon(getClass().getResource("/resources/redChip.png")));
		} else {
			lblCircles[x][y].setIcon(new ImageIcon(getClass().getResource("/resources/yellowChip.png")));
		}
	}

	private class ClickListener implements ActionListener {
		int x, y;

		public void actionPerformed(ActionEvent e) {

			if (e.getSource().equals(btnA)) {
				y = 0;
				x = board.getIndex(y);
				board.setX(x);
				board.setY(y);
				board.updateBoard(x, y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (x == 0) {
					btnA.setEnabled(false);
				}
			}

			if (e.getSource().equals(btnB)) {
				y = 1;
				x = board.getIndex(y);
				board.setX(x);
				board.setY(y);
				board.updateBoard(x, y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (x == 0) {
					btnB.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnC)) {
				y = 2;
				x = board.getIndex(y);
				board.setX(x);
				board.setY(y);
				board.updateBoard(x, y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (x == 0) {
					btnC.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnD)) {
				y = 3;
				x = board.getIndex(y);
				board.setX(x);
				board.setY(y);
				board.updateBoard(x, y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (x == 0) {
					btnD.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnE)) {
				y = 4;
				x = board.getIndex(y);
				board.setX(x);
				board.setY(y);
				board.updateBoard(x, y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (x == 0) {
					btnE.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnF)) {
				y = 5;
				x = board.getIndex(y);
				board.setX(x);
				board.setY(y);
				board.updateBoard(x, y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (x == 0) {
					btnF.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnG)) {
				y = 6;
				x = board.getIndex(y);
				board.setX(x);
				board.setY(y);
				board.updateBoard(x, y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (x == 0) {
					btnG.setEnabled(false);
				}
			}
			if (board.getWinnerA()) {
				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				JOptionPane.showMessageDialog(null, playerA + " wins!");
				System.exit(10);

			} else if (board.getWinnerB()) {

				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				JOptionPane.showMessageDialog(null, playerB + " wins!");
				System.exit(10);
			} else if (board.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Tie Game!");
				System.exit(10);
			}
		}
	}
}
