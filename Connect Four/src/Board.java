

public class Board {
	
	private char board [] [] = new char [7] [7] ;
	int counterA, counterB, counterC, counterD, counterE, counterF, counterG;
	boolean playerSwitch;
	public Board (int counterA, int counterB, int counterC, int counterD, int counterE, int counterF, int counterG, boolean playerSwitch){
		this.counterA = counterA;
		this.counterB = counterB;
		this.counterC = counterC;
		this.counterD = counterD;
		this.counterE = counterE;
		this.counterF = counterF;
		this.counterG = counterG;
		this.playerSwitch = playerSwitch;
	}
	public void makeBoard (){
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 7; j++){
				board [i][j] = 'X'; // blank array // we update this when button pressed
			}
		}
	}
	public char updateBoardA (int counterA){
		if (counterA == 1){
			if (!playerSwitch){
				board [6][0] = '1'; // 1 because player 1
				playerSwitch = true;
			}
			else {
				board [6][0] = '2';
				playerSwitch = false;
			}
			return board [6][0];
		}
		else if (counterA == 2){
			if (!playerSwitch){
				board [5][0] = '1';
				playerSwitch = true;
			}
			else {
				board [5][0] = '2'; 
				playerSwitch = false;
			}
			return board [5][0];
		}
		else if (counterA == 3){
			if (!playerSwitch){
				board [4][0] = '1';
				playerSwitch = true;
			}
			else {
				board [4][0] = '2'; 
				playerSwitch = false;
			}
			return board [4][0];
		}
		else if (counterA == 4){
			if (!playerSwitch){
				board [3][0] = '1';
				playerSwitch = true;
			}
			else {
				board [3][0] = '2'; 
				playerSwitch = false;
			}
			return board [3][0];
		}
		else if (counterA == 5){
			if (!playerSwitch){
				board [2][0] = '1';
				playerSwitch = true;
			}
			else {
				board [2][0] = '2'; 
				playerSwitch = false;
			}
			return board [2][0];
		}
		else if (counterA == 6){
			if (!playerSwitch){
				board [1][0] = '1';
				playerSwitch = true;
			}
			else {
				board [1][0] = '2'; 
				playerSwitch = false;
			}
			return board [1][0];
		}
		else if (counterA == 7){
			if (!playerSwitch){
				board [0][0] = '1';
				playerSwitch = true;
			}
			else {
				board [0][0] = '2'; 
				playerSwitch = false;
			}
			return board [0][0];
		}
		return 0;

	}
	
	public char updateBoardB (int counterB){
		if (counterB == 1){
			if (!playerSwitch){
				board [6][1] = '1'; // 1 because player 1
				playerSwitch = true;
			}
			else {
				board [6][1] = '2';
				playerSwitch = false;
			}
			return board [6][1];
		}
		else if (counterB == 2){
			if (!playerSwitch){
				board [5][1] = '1';
				playerSwitch = true;
			}
			else {
				board [5][1] = '2'; 
				playerSwitch = false;
			}
			return board [5][1];
		}
		else if (counterB == 3){
			if (!playerSwitch){
				board [4][1] = '1';
				playerSwitch = true;
			}
			else {
				board [4][1] = '2'; 
				playerSwitch = false;
			}
			return board [4][1];
		}
		else if (counterB == 4){
			if (!playerSwitch){
				board [3][1] = '1';
				playerSwitch = true;
			}
			else {
				board [3][1] = '2'; 
				playerSwitch = false;
			}
			return board [3][1];
		}
		else if (counterB == 5){
			if (!playerSwitch){
				board [2][1] = '1';
				playerSwitch = true;
			}
			else {
				board [2][1] = '2'; 
				playerSwitch = false;
			}
			return board [2][1];
		}
		else if (counterB == 6){
			if (!playerSwitch){
				board [1][1] = '1';
				playerSwitch = true;
			}
			else {
				board [1][1] = '2'; 
				playerSwitch = false;
			}
			return board [1][1];
		}
		else if (counterB == 7){
			if (!playerSwitch){
				board [0][1] = '1';
				playerSwitch = true;
			}
			else {
				board [0][1] = '2'; 
				playerSwitch = false;
			}
			return board [0][1];
		}
		return 0;

	}
	
	public void printBoard (){
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 7; j++){
				System.out.print(board [i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
}
