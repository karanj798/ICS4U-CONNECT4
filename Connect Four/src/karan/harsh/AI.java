package karan.harsh;
import java.util.*;
/**
 * 
 * @author Karan Jariwala, Harsh Joshi
 * @description This class defines the game of connect 4.
 * @version 3.5
 */
public class AI {

	private char board[][] = new char[7][7];
	private final char EMPTY = '*';
	private boolean AIWon, playerWon;
	private int x, y;

	/**
	 * Constructor of AI class.
	 */
	public AI() {

	}

	/**
	 * Mutator method of X
	 * @param x
	 */
	public void setAIX(int x) {
		this.x = x;
	}

	/**
	 * Mutator method of Y
	 * @param y
	 */
	public void setAIY(int y) {
		this.y = y;
	}

	/**
	 * Accessor method of X
	 * @return
	 */
	public int getAIX() {
		return x;
	}

	/**
	 * Accessor method of Y
	 * @return
	 */
	public int getAIY() {
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
	 * This method updates board.
	 * @param i
	 * @param j
	 * @param chipColor
	 */
	public void updateBoard(int i, int j, char chipColor) {
		board[i][j] = chipColor;
	}

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
	 * Helper method used to check if a column is full.
	 * @param colNum
	 * @return
	 */
	public boolean isColumnFull (int colNum){
		if (board[0][colNum] == EMPTY){
			return false;
		}
		return true;
	}

	/**
	 * Helper method places chips randomly. 
	 */
	public void move() {
		Random rn = new Random();
		int random=0;
		
		boolean isValidColumn=false;
		while (!isValidColumn){
			random = rn.nextInt((6 - 0) + 1) + 0;
			if (!isColumnFull(random)){
				isValidColumn = true;
			}
		}
		
		setAIX(getIndex(random));
		setAIY(random);
		updateBoard(getAIX(), getAIY(), 'Y');
	}

	/**
	 * This method is used to check for winner.
	 */
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

	/**
	 * This method is used to check for winner.
	 */
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

	/**
	 * Mutator method of playerAWon
	 * @param condition
	 */
	public void setWinnerA(boolean condition) {
		this.playerWon = condition;
	}

	/**
	 * Mutator method of playerBWon
	 * @param condition
	 */
	public void setWinnerB(boolean condition) {
		this.AIWon = condition;
	}

	/**
	 * Accessor method of playerAWon
	 * @return
	 */
	public boolean getWinnerA() {
		return playerWon;
	}

	/**
	 * Accessor method of playerBWon
	 * @return
	 */
	public boolean getWinnerB() {
		return AIWon;
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
