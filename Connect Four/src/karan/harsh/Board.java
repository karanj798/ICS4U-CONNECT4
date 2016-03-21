package karan.harsh;

import java.awt.Color;

public class Board {

	private char board[][] = new char[7][7];
	int x, y;
	boolean playerSwitch;
	int turn = 0; 
	Chip chip = new Chip();

	public Board(int x, int y) {

	}

	public void setX(int i) {
		this.x = i;
	}

	public void setY(int j) {
		this.y = j;
	}
	
	public int getX (){
		return x;
	}
	
	public int getY(){
		return y;
	}
	public void makeBoard() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				board[i][j] = 'X';
			}
		}
	}
	
	public void setTurn (){
		turn++;
	}
	
	public int getTurn (){
		return turn;
	}
	
	public void setCondition (boolean x){
		this.playerSwitch = x;
	}
	
	public boolean getCondition (){
		return playerSwitch;
	}

	public void updateBoard(int i, int j) {
		
		if (!getCondition()) {
			
			board[i][j] = 'R';
			chip.setColor(Color.red);
			setTurn();
			setCondition (true);
		} else {
			
			board[i][j] = 'B';
			chip.setColor(Color.blue);
			setTurn();
			setCondition (false);
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
