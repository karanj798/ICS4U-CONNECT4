package karan.harsh;

public class Board {

	private char board[][] = new char[7][7];
	int x, y;
	boolean playerSwitch, gameEnd, playerAWon, playerBWon;
	Chip chip = new Chip();

	public Board(int x, int y) {

	}

	public void setX(int i) {
		this.x = i;
	}

	public void setY(int j) {
		this.y = j;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void makeBoard() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				board[i][j] = '*';
			}
		}
	}

	public void setCondition(boolean x) {
		this.playerSwitch = x;
	}

	public boolean getCondition() {
		return playerSwitch;
	}

	public void updateBoard(int i, int j) {

		if (!getCondition()) {
			board[i][j] = 'Y';
			setCondition(true);
		} else {
			board[i][j] = 'R';
			setCondition(false);
		}
	}

	public void printBoard() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	public void checkWinnerA() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i >= 3) {
					if (board[i][j] == 'Y' && board[i - 1][j] == 'Y' && board[i - 2][j] == 'Y'
							&& board[i - 3][j] == 'Y') {
						setWinnerA(true);
						setGameOver(true, false);
					}
				}
				if (j <= 3) {
					if (board[i][j] == 'Y' && board[i][j + 1] == 'Y' && board[i][j + 2] == 'Y'
							&& board[i][j + 3] == 'Y') {
						setWinnerA(true);
						setGameOver(true, false);
					}
				}
				if (i <= 3 && j <= 3) {
					if (board[i][j] == 'Y' && board[i + 1][j + 1] == 'Y' && board[i + 2][j + 2] == 'Y'
							&& board[i + 3][j + 3] == 'Y') {
						setWinnerA(true);
						setGameOver(true, false);
					}
				}
				if (i <= 3 && j >= 3) {
					if (board[i][j] == 'Y' && board[i + 1][j - 1] == 'Y' && board[i + 2][j - 2] == 'Y'
							&& board[i + 3][j - 3] == 'Y') {
						setWinnerA(true);
						setGameOver(true, false);
					}
				}
			}
		}
	}

	public void checkWinnerB() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i >= 3) {
					if (board[i][j] == 'R' && board[i - 1][j] == 'R' && board[i - 2][j] == 'R'
							&& board[i - 3][j] == 'R') {
						setWinnerB(true);
						setGameOver(false, true);
					}
				}
				if (j <= 3) {
					if (board[i][j] == 'R' && board[i][j + 1] == 'R' && board[i][j + 2] == 'R'
							&& board[i][j + 3] == 'R') {
						setWinnerB(true);
						setGameOver(false, true);
					}
				}
				if (i <= 3 && j <= 3) {
					if (board[i][j] == 'R' && board[i + 1][j + 1] == 'R' && board[i + 2][j + 2] == 'R'
							&& board[i + 3][j + 3] == 'R') {
						setWinnerB(true);
						setGameOver(false, true);
					}
				}
				if (i <= 3 && j >= 3) {
					if (board[i][j] == 'R' && board[i + 1][j - 1] == 'R' && board[i + 2][j - 2] == 'R'
							&& board[i + 3][j - 3] == 'R') {
						setWinnerB(true);
						setGameOver(false, true);
					}
				}
			}
		}
	}

	public void setWinnerA(boolean condition) {
		this.playerAWon = condition;
	}

	public void setWinnerB(boolean condition) {
		this.playerBWon = condition;
	}

	public boolean getWinnerA() {
		return playerAWon;
	}

	public boolean getWinnerB() {
		return playerBWon;
	}

	public void setGameOver(boolean a, boolean b) {
		if (a || b) {
			this.gameEnd = true;
		} else {
			this.gameEnd = false;
		}
	}

	public boolean getGameOver() {
		return gameEnd;
	}
}
