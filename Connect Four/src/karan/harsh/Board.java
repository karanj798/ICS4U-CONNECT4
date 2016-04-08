package karan.harsh;

/**
 * 
 * @author Karan Jariwala, Harsh Joshi
 * @description This class defines the game of connect 4.
 * @version 3.5
 */
public class Board {

	private char board[][] = new char[7][7];
	private final char EMPTY = '*';
	private int x, y;
	private boolean playerSwitch, playerAWon, playerBWon;

	/**
	 * Constructor of Board class.
	 */
	public Board() {

	}

	/**
	 * Mutator method of X
	 * @param i
	 */
	public void setX(int i) {
		this.x = i;
	}

	/**
	 * Mutator method of Y
	 * @param j
	 */
	public void setY(int j) {
		this.y = j;
	}

	/**
	 * Accessor method of X
	 * @return
	 */
	public int getX() {
		return x;
	}

	/**
	 * Accessor method of Y
	 * @return
	 */
	public int getY() {
		return y;
	}

	/** 
	 * This method creates a blank 2d array (board).
	 */
	public void makeBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = EMPTY;
			}
		}
	}
	
	/**
	 * Mutator method of playerSwitch
	 * @param x
	 */

	public void setCondition(boolean x) {
		this.playerSwitch = x;
	}

	/**
	 * Accessor method of playerSwitch
	 * @return
	 */
	public boolean getCondition() {
		return playerSwitch;
	}

	/**
	 * This method updates board according to the value of playerSwitch.
	 * @param i
	 * @param j
	 */
	public void updateBoard(int i, int j) {
		if (!getCondition()) {
			board[i][j] = 'R';
			setCondition(true);
		} else {
			board[i][j] = 'Y';
			setCondition(false);
		}
	}

	/**
	 * Accessor method returns the current index of a specific column in the array.  
	 * @param i
	 * @return
	 */
	public int getIndex(int i) {
		int index = 6;
		boolean found = false;
		while (!found) {
			if (board[index][i] == EMPTY) {
				found = true;
			} else {
				if (index > 0) {
					index--;
				}
			}
		}
		return index;
	}

	/**
	 * This method is used to check for winner.
	 */
	public void checkWinnerA() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i >= 3) {
					if (board[i][j] == 'Y' && board[i - 1][j] == 'Y' && board[i - 2][j] == 'Y'
							&& board[i - 3][j] == 'Y') {
						setWinnerA(true);
					}
				}
				if (j <= 3) {
					if (board[i][j] == 'Y' && board[i][j + 1] == 'Y' && board[i][j + 2] == 'Y'
							&& board[i][j + 3] == 'Y') {
						setWinnerA(true);
					}
				}
				if (i <= 3 && j <= 3) {
					if (board[i][j] == 'Y' && board[i + 1][j + 1] == 'Y' && board[i + 2][j + 2] == 'Y'
							&& board[i + 3][j + 3] == 'Y') {
						setWinnerA(true);
					}
				}
				if (i <= 3 && j >= 3) {
					if (board[i][j] == 'Y' && board[i + 1][j - 1] == 'Y' && board[i + 2][j - 2] == 'Y'
							&& board[i + 3][j - 3] == 'Y') {
						setWinnerA(true);
					}
				}
			}
		}
	}
	
	/**
	 * This method is used to check for winner.
	 */	
	public void checkWinnerB() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i >= 3) {
					if (board[i][j] == 'R' && board[i - 1][j] == 'R' && board[i - 2][j] == 'R'
							&& board[i - 3][j] == 'R') {
						setWinnerB(true);
					}
				}
				if (j <= 3) {
					if (board[i][j] == 'R' && board[i][j + 1] == 'R' && board[i][j + 2] == 'R'
							&& board[i][j + 3] == 'R') {
						setWinnerB(true);
					}
				}
				if (i <= 3 && j <= 3) {
					if (board[i][j] == 'R' && board[i + 1][j + 1] == 'R' && board[i + 2][j + 2] == 'R'
							&& board[i + 3][j + 3] == 'R') {
						setWinnerB(true);
					}
				}
				if (i <= 3 && j >= 3) {
					if (board[i][j] == 'R' && board[i + 1][j - 1] == 'R' && board[i + 2][j - 2] == 'R'
							&& board[i + 3][j - 3] == 'R') {
						setWinnerB(true);
					}
				}
			}
		}
	}

	/**
	 * Mutator method of playerAWon
	 * @param condition
	 */
	public void setWinnerA(boolean condition) {
		this.playerAWon = condition;
	}

	/**
	 * Mutator method of playerBWon
	 * @param condition
	 */
	public void setWinnerB(boolean condition) {
		this.playerBWon = condition;
	}

	/**
	 * Accessor method of playerAWon
	 * @return
	 */
	public boolean getWinnerA() {
		return playerAWon;
	}

	/**
	 * Accessor method of playerBWon
	 * @return
	 */
	public boolean getWinnerB() {
		return playerBWon;
	}
	
	/**
	 * Helper method check for any * in array.
	 * @return
	 */
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
