package karan.harsh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class Panel extends JPanel {

	JLabel lblTitle;
	JButton btnA, btnB, btnC, btnD, btnE, btnF, btnG;
	JLabel lblCircles[][];
	int x = 0, y = 7;
	boolean switchPlayer = false;
	Board board = new Board(x, y);
	String playerA = "";
	String playerB = "";

	public Panel() {
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

		board.makeBoard();
			
		playerA = JOptionPane.showInputDialog(null, "Name of Player A: ");
		
		while (playerA == null){
			playerA = JOptionPane.showInputDialog(null, "Name of Player A: ");	
		}
		
		playerB = JOptionPane.showInputDialog(null, "Name of Player B: ");
		
		while (playerB == null){
			playerB = JOptionPane.showInputDialog(null, "Name of Player B: ");
		}	
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
		int X = 7, Y;

		public void actionPerformed(ActionEvent e) {

			if (e.getSource().equals(btnA)) {
				Y = 0;
				X--;
				board.setX(X);
				board.setY(Y);
				board.updateBoard(X, Y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (X == 0) {
					btnA.setEnabled(false);
				}
			}

			if (e.getSource().equals(btnB)) {
				Y = 1;
				X--;
				board.setX(X);
				board.setY(Y);
				board.updateBoard(X, Y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (X == 0) {
					btnB.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnC)) {
				Y = 2;
				X--;
				board.setX(X);
				board.setY(Y);
				board.updateBoard(X, Y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (X == 0) {
					btnC.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnD)) {
				Y = 3;
				X--;
				board.setX(X);
				board.setY(Y);
				board.updateBoard(X, Y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (X == 0) {
					btnD.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnE)) {
				Y = 4;
				X--;
				board.setX(X);
				board.setY(Y);
				board.updateBoard(X, Y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (X == 0) {
					btnE.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnF)) {
				Y = 5;
				X--;
				board.setX(X);
				board.setY(Y);
				board.updateBoard(X, Y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (X == 0) {
					btnF.setEnabled(false);
				}
			}
			if (e.getSource().equals(btnG)) {
				Y = 6;
				X--;
				board.setX(X);
				board.setY(Y);
				board.updateBoard(X, Y);
				board.checkWinnerA();
				board.checkWinnerB();
				updateChips();
				if (X == 0) {
					btnG.setEnabled(false);
				}
			}
			if (board.getGameOver()){
				btnA.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				btnD.setEnabled(false);
				btnE.setEnabled(false);
				btnF.setEnabled(false);
				btnG.setEnabled(false);
				if (board.playerAWon){
					JOptionPane.showMessageDialog(null, playerA + " wins!");
					System.exit(10);
					
				}
				else if (board.playerBWon){
					JOptionPane.showMessageDialog(null, playerB + " wins!");
					System.exit(10);
				}
				else {
					JOptionPane.showMessageDialog(null, "Tie Game!");
					System.exit(10); 
				}
					
			}
		}
	}
}
