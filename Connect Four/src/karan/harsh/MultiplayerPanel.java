package karan.harsh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * @author Karan Jariwala, Harsh Joshi
 * @description This class allows 2 users to play amongst themselves.
 * @version 3.5 
 */
@SuppressWarnings("serial")
public class MultiplayerPanel extends JPanel {

	private JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG;
	private JLabel lblCircles[][];
	private Board board = new Board();
	private String playerA = "", playerB = "";

	/**
	 * Constructor of a MultiplayerPanel class
	 */
	public MultiplayerPanel() {
		setPreferredSize(new Dimension(500, 600));
		setLayout(new GridLayout(8, 0, 55, 20));
		setBackground(new Color(27, 179, 245));

		playerA = JOptionPane.showInputDialog(null, "Name of Player A: ");

		while (playerA == null || playerA.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please enter your name in the field.");
			playerA = JOptionPane.showInputDialog(null, "Name of Player A: ");
		}
		playerB = JOptionPane.showInputDialog(null, "Name of Player B: ");

		while (playerB == null || playerB.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please enter your name in the field.");
			playerB = JOptionPane.showInputDialog(null, "Name of Player B: ");
		}

		JOptionPane.showMessageDialog(null, playerA + " will place red chip. \n" + playerB + " will place yellow chip."
				+ "\nIt's " + playerB + "'s turn to place a chip.");

		ImageIcon image = new ImageIcon(getClass().getResource("/resources/arrowDown.png"));

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
	}

	/**
	 * This method updates the 2d array of JLabel.
	 */
	public void updatePanel() {
		if (!board.getCondition()) {
			lblCircles[board.getX()][board.getY()]
					.setIcon(new ImageIcon(getClass().getResource("/resources/redChip.png")));
		} else {
			lblCircles[board.getX()][board.getY()]
					.setIcon(new ImageIcon(getClass().getResource("/resources/yellowChip.png")));
		}
	}
	/**
	 * 
	 * @author Karan
	 * @description This class is used for receiving clicks on buttons.
	 * @version 3.5
	 */
	private class ClickListener implements ActionListener {
		int row, col;

		public void actionPerformed(ActionEvent e) {

			if (e.getSource().equals(btnA)) {
				col = 0;
				row = board.getIndex(col);
				board.setX(row);
				board.setY(col);
				board.updateBoard(row, col);
				board.checkWinnerA();
				board.checkWinnerB();
				updatePanel();
				if (row == 0) {
					btnA.setEnabled(false);
				}
			}

			if (e.getSource().equals(btnB)) {
				col = 1;
				row = board.getIndex(col);
				board.setX(row);
				board.setY(col);
				board.updateBoard(row, col);
				board.checkWinnerA();
				board.checkWinnerB();
				updatePanel();
				if (row == 0) {
					btnB.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnC)) {
				col = 2;
				row = board.getIndex(col);
				board.setX(row);
				board.setY(col);
				board.updateBoard(row, col);
				board.checkWinnerA();
				board.checkWinnerB();
				updatePanel();
				if (row == 0) {
					btnC.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnD)) {
				col = 3;
				row = board.getIndex(col);
				board.setX(row);
				board.setY(col);
				board.updateBoard(row, col);
				board.checkWinnerA();
				board.checkWinnerB();
				updatePanel();
				if (row == 0) {
					btnD.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnE)) {
				col = 4;
				row = board.getIndex(col);
				board.setX(row);
				board.setY(col);
				board.updateBoard(row, col);
				board.checkWinnerA();
				board.checkWinnerB();
				updatePanel();
				if (row == 0) {
					btnE.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnF)) {
				col = 5;
				row = board.getIndex(col);
				board.setX(row);
				board.setY(col);
				board.updateBoard(row, col);
				board.checkWinnerA();
				board.checkWinnerB();
				updatePanel();
				if (row == 0) {
					btnF.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnG)) {
				col = 6;
				row = board.getIndex(col);
				board.setX(row);
				board.setY(col);
				board.updateBoard(row, col);
				board.checkWinnerA();
				board.checkWinnerB();
				updatePanel();
				if (row == 0) {
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
				int responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
				if (responds == 0) {
					new MainPanel();
				} else if (responds == 1) {
					System.exit(0);
				}
				while (responds == 2) {
					responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
					if (responds == 0) {
						new MainPanel();
					} else if (responds == 1) {
						System.exit(0);
					}
				}

			} else if (board.getWinnerB()) {
				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				JOptionPane.showMessageDialog(null, playerB + " wins!");
				int responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
				if (responds == 0) {
					new MainPanel();
				} else if (responds == 1) {
					System.exit(0);
				}
				while (responds == 2) {
					responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
					if (responds == 0) {
						new MainPanel();
					} else if (responds == 1) {
						System.exit(0);
					}
				}
			} else if (board.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Tie Game!");
				int responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
				if (responds == 0) {
					new MainPanel();
				} else if (responds == 1) {
					System.exit(0);
				}
				while (responds == 2) {
					responds = JOptionPane.showConfirmDialog(null, "Do you want to play the game agian?");
					if (responds == 0) {
						new MainPanel();
					} else if (responds == 1) {
						System.exit(0);
					}
				}
			}
		}
	}
}
