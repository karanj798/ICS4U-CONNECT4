import java.awt.Color;

public class Board {

	private char board[][] = new char[7][7];
	int x, y;
	boolean playerSwitch;
	Chip chip = new Chip();
	public Board(int x, int y) {

	}

	public void makeBoard() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				board[i][j] = 'X';
			}
		}
	}

	public void updateBoard(int i, int j) {
		// Make an object which sets color
		if (!playerSwitch){
			// if theres R set color to red 
			board[i][j] = 'R';
			chip.setColor(Color.red);
			playerSwitch = true;
		}
		else {
			// if theres B set color to blue
			board[i][j] = 'B';
			chip.setColor(Color.blue);
			playerSwitch = false;
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
		checkWinnerA();
		// checkWinnerB();
	}

	public void checkWinnerA() {
		
	}
}
