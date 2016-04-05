package karan.harsh;

import java.util.*;

public class AI {

	private char board[][] = new char[7][7];
	private final char EMPTY = '*';
	private boolean AIWon, playerWon;
	private int x, y;

	public AI() {

	}

	public void setAIX(int x) {
		this.x = x;
	}

	public void setAIY(int y) {
		this.y = y;
	}

	public int getAIX() {
		return x;
	}

	public int getAIY() {
		return y;
	}

	public void makeBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = EMPTY;
			}
		}
	}

	public void updateBoard(int i, int j, char chipColor) {
		board[i][j] = chipColor;
	}

	public int getIndex(int i) {
		int index = 6;
		boolean found = false;
		while (!found) {
			if (board[index][i] == '*') {
				found = true;
			} else {
				if (index > 0) {
					index--;
				}
			}
		}
		return index;
	}

	public void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}

	public void move() {
		Random rn = new Random();
		int random = rn.nextInt((6 - 0) + 1) + 0;
		setAIX(getIndex(random));
		setAIY(random);
		updateBoard(getAIX(), getAIY(), 'Y');
	}

	public void checkWinnerA() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i >= 3) {
					if (board[i][j] == 'R' && board[i - 1][j] == 'R' && board[i - 2][j] == 'R'
							&& board[i - 3][j] == 'R') {
						setWinnerA(true);
					}
				}
				if (j <= 3) {
					if (board[i][j] == 'R' && board[i][j + 1] == 'R' && board[i][j + 2] == 'R'
							&& board[i][j + 3] == 'R') {
						setWinnerA(true);
					}
				}
				if (i <= 3 && j <= 3) {
					if (board[i][j] == 'R' && board[i + 1][j + 1] == 'R' && board[i + 2][j + 2] == 'R'
							&& board[i + 3][j + 3] == 'R') {
						setWinnerA(true);
					}
				}
				if (i <= 3 && j >= 3) {
					if (board[i][j] == 'R' && board[i + 1][j - 1] == 'R' && board[i + 2][j - 2] == 'R'
							&& board[i + 3][j - 3] == 'R') {
						setWinnerA(true);
					}
				}
			}
		}
	}

	public void checkWinnerB() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i >= 3) {
					if (board[i][j] == 'Y' && board[i - 1][j] == 'Y' && board[i - 2][j] == 'Y'
							&& board[i - 3][j] == 'Y') {
						setWinnerB(true);
					}
				}
				if (j <= 3) {
					if (board[i][j] == 'Y' && board[i][j + 1] == 'Y' && board[i][j + 2] == 'Y'
							&& board[i][j + 3] == 'Y') {
						setWinnerB(true);
					}
				}
				if (i <= 3 && j <= 3) {
					if (board[i][j] == 'Y' && board[i + 1][j + 1] == 'Y' && board[i + 2][j + 2] == 'Y'
							&& board[i + 3][j + 3] == 'Y') {
						setWinnerB(true);
					}
				}
				if (i <= 3 && j >= 3) {
					if (board[i][j] == 'Y' && board[i + 1][j - 1] == 'Y' && board[i + 2][j - 2] == 'Y'
							&& board[i + 3][j - 3] == 'Y') {
						setWinnerB(true);
					}
				}
			}
		}
	}

	public void setWinnerA(boolean condition) {
		this.playerWon = condition;
	}

	public void setWinnerB(boolean condition) {
		this.AIWon = condition;
	}

	public boolean getWinnerA() {
		return playerWon;
	}

	public boolean getWinnerB() {
		return AIWon;
	}

	public boolean isEmpty() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == EMPTY) {
					return false;
				}
			}
		}
		return true;
	}
}
