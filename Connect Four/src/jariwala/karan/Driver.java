package jariwala.karan;

import java.util.*;

public class Driver {
	private static final int WIDTH = 7, HEIGHT = 6;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean turnSwitcher = false;

		System.out.println("   1   2   3   4   5   6   7");
		drawBoard();
		System.out.print("Enter a column number [2]: ");
		int chooseCol = in.nextInt();
		if (!turnSwitcher) {
			System.out.println("Player 1...");
			turnSwitcher = true;
		} else {
			System.out.println("Player 2...");
			turnSwitcher = false;
		}

		in.close();
	}

	public static void drawBoard() {
		char board[][] = new char[HEIGHT][WIDTH];
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				board[i][j] = ' ';
				System.out.print(" | " + board[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println();
	}
}
