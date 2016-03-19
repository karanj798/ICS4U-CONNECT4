
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
	
	public char updateBoardC (int counterC){
		if (counterC == 1){
			if (!playerSwitch){
				board [6][2] = '1'; // 1 because player 1
				playerSwitch = true;
			}
			else {
				board [6][2] = '2';
				playerSwitch = false;
			}
			return board [6][2];
		}
		else if (counterC == 2){
			if (!playerSwitch){
				board [5][2] = '1';
				playerSwitch = true;
			}
			else {
				board [5][2] = '2'; 
				playerSwitch = false;
			}
			return board [5][2];
		}
		else if (counterC == 3){
			if (!playerSwitch){
				board [4][2] = '1';
				playerSwitch = true;
			}
			else {
				board [4][2] = '2'; 
				playerSwitch = false;
			}
			return board [4][2];
		}
		else if (counterC == 4){
			if (!playerSwitch){
				board [3][2] = '1';
				playerSwitch = true;
			}
			else {
				board [3][2] = '2'; 
				playerSwitch = false;
			}
			return board [3][2];
		}
		else if (counterC == 5){
			if (!playerSwitch){
				board [2][2] = '1';
				playerSwitch = true;
			}
			else {
				board [2][2] = '2'; 
				playerSwitch = false;
			}
			return board [2][2];
		}
		else if (counterC == 6){
			if (!playerSwitch){
				board [1][2] = '1';
				playerSwitch = true;
			}
			else {
				board [1][2] = '2'; 
				playerSwitch = false;
			}
			return board [1][2];
		}
		else if (counterC == 7){
			if (!playerSwitch){
				board [0][2] = '1';
				playerSwitch = true;
			}
			else {
				board [0][2] = '2'; 
				playerSwitch = false;
			}
			return board [0][2];
		}
		return 0;
	}
	
	public char updateBoardD (int counterD){
		if (counterD == 1){
			if (!playerSwitch){
				board [6][3] = '1'; // 1 because player 1
				playerSwitch = true;
			}
			else {
				board [6][3] = '2';
				playerSwitch = false;
			}
			return board [6][3];
		}
		else if (counterD == 2){
			if (!playerSwitch){
				board [5][3] = '1';
				playerSwitch = true;
			}
			else {
				board [5][3] = '2'; 
				playerSwitch = false;
			}
			return board [5][3];
		}
		else if (counterD == 3){
			if (!playerSwitch){
				board [4][3] = '1';
				playerSwitch = true;
			}
			else {
				board [4][3] = '2'; 
				playerSwitch = false;
			}
			return board [4][3];
		}
		else if (counterD == 4){
			if (!playerSwitch){
				board [3][3] = '1';
				playerSwitch = true;
			}
			else {
				board [3][3] = '2'; 
				playerSwitch = false;
			}
			return board [3][3];
		}
		else if (counterD == 5){
			if (!playerSwitch){
				board [2][3] = '1';
				playerSwitch = true;
			}
			else {
				board [2][3] = '2'; 
				playerSwitch = false;
			}
			return board [2][3];
		}
		else if (counterD == 6){
			if (!playerSwitch){
				board [1][3] = '1';
				playerSwitch = true;
			}
			else {
				board [1][3] = '2'; 
				playerSwitch = false;
			}
			return board [1][3];
		}
		else if (counterD == 7){
			if (!playerSwitch){
				board [0][3] = '1';
				playerSwitch = true;
			}
			else {
				board [0][3] = '2'; 
				playerSwitch = false;
			}
			return board [0][3];
		}
		return 0;

	}
	
	public char updateBoardE (int counterE){
		if (counterE == 1){
			if (!playerSwitch){
				board [6][4] = '1'; // 1 because player 1
				playerSwitch = true;
			}
			else {
				board [6][4] = '2';
				playerSwitch = false;
			}
			return board [6][4];
		}
		else if (counterE == 2){
			if (!playerSwitch){
				board [5][4] = '1';
				playerSwitch = true;
			}
			else {
				board [5][4] = '2'; 
				playerSwitch = false;
			}
			return board [5][4];
		}
		else if (counterE == 3){
			if (!playerSwitch){
				board [4][4] = '1';
				playerSwitch = true;
			}
			else {
				board [4][4] = '2'; 
				playerSwitch = false;
			}
			return board [4][4];
		}
		else if (counterE == 4){
			if (!playerSwitch){
				board [3][4] = '1';
				playerSwitch = true;
			}
			else {
				board [3][4] = '2'; 
				playerSwitch = false;
			}
			return board [3][4];
		}
		else if (counterE == 5){
			if (!playerSwitch){
				board [2][4] = '1';
				playerSwitch = true;
			}
			else {
				board [2][4] = '2'; 
				playerSwitch = false;
			}
			return board [2][4];
		}
		else if (counterE == 6){
			if (!playerSwitch){
				board [1][4] = '1';
				playerSwitch = true;
			}
			else {
				board [1][4] = '2'; 
				playerSwitch = false;
			}
			return board [1][4];
		}
		else if (counterE == 7){
			if (!playerSwitch){
				board [0][4] = '1';
				playerSwitch = true;
			}
			else {
				board [0][4] = '2'; 
				playerSwitch = false;
			}
			return board [0][4];
		}
		return 0;

	}
	
	public char updateBoardF (int counterF){
		if (counterF == 1){
			if (!playerSwitch){
				board [6][5] = '1'; // 1 because player 1
				playerSwitch = true;
			}
			else {
				board [6][5] = '2';
				playerSwitch = false;
			}
			return board [6][5];
		}
		else if (counterF == 2){
			if (!playerSwitch){
				board [5][5] = '1';
				playerSwitch = true;
			}
			else {
				board [5][5] = '2'; 
				playerSwitch = false;
			}
			return board [5][5];
		}
		else if (counterF == 3){
			if (!playerSwitch){
				board [4][5] = '1';
				playerSwitch = true;
			}
			else {
				board [4][5] = '2'; 
				playerSwitch = false;
			}
			return board [4][5];
		}
		else if (counterF == 4){
			if (!playerSwitch){
				board [3][5] = '1';
				playerSwitch = true;
			}
			else {
				board [3][5] = '2'; 
				playerSwitch = false;
			}
			return board [3][5];
		}
		else if (counterF == 5){
			if (!playerSwitch){
				board [2][5] = '1';
				playerSwitch = true;
			}
			else {
				board [2][5] = '2'; 
				playerSwitch = false;
			}
			return board [2][5];
		}
		else if (counterF == 6){
			if (!playerSwitch){
				board [1][5] = '1';
				playerSwitch = true;
			}
			else {
				board [1][5] = '2'; 
				playerSwitch = false;
			}
			return board [1][5];
		}
		else if (counterF == 7){
			if (!playerSwitch){
				board [0][5] = '1';
				playerSwitch = true;
			}
			else {
				board [0][5] = '2'; 
				playerSwitch = false;
			}
			return board [0][5];
		}
		return 0;

	}
	
	public char updateBoardG (int counterG){
		if (counterG == 1){
			if (!playerSwitch){
				board [6][6] = '1'; // 1 because player 1
				playerSwitch = true;
			}
			else {
				board [6][6] = '2';
				playerSwitch = false;
			}
			return board [6][6];
		}
		else if (counterG == 2){
			if (!playerSwitch){
				board [5][6] = '1';
				playerSwitch = true;
			}
			else {
				board [5][6] = '2'; 
				playerSwitch = false;
			}
			return board [5][6];
		}
		else if (counterG == 3){
			if (!playerSwitch){
				board [4][6] = '1';
				playerSwitch = true;
			}
			else {
				board [4][6] = '2'; 
				playerSwitch = false;
			}
			return board [4][6];
		}
		else if (counterG == 4){
			if (!playerSwitch){
				board [3][6] = '1';
				playerSwitch = true;
			}
			else {
				board [3][6] = '2'; 
				playerSwitch = false;
			}
			return board [3][6];
		}
		else if (counterG == 5){
			if (!playerSwitch){
				board [2][6] = '1';
				playerSwitch = true;
			}
			else {
				board [2][6] = '2'; 
				playerSwitch = false;
			}
			return board [2][6];
		}
		else if (counterG == 6){
			if (!playerSwitch){
				board [1][6] = '1';
				playerSwitch = true;
			}
			else {
				board [1][6] = '2'; 
				playerSwitch = false;
			}
			return board [1][6];
		}
		else if (counterG == 7){
			if (!playerSwitch){
				board [0][6] = '1';
				playerSwitch = true;
			}
			else {
				board [0][6] = '2'; 
				playerSwitch = false;
			}
			return board [0][6];
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
	{
			board [6][0] = '1'; // 1 because player 1
			
		if (counterA == 2){
			board[5][0] = '2'; // 2 because player 2
		}
		else if (counterA == 3){
			board [4][0] = '1';
		}
		else if (counterA == 4){
			board [3][0] = '2';
		}
		else if (counterA == 5){
			board [2][0] = '1';
		}
		else if (counterA == 6){
			board [1][0] = '2';
		}
		else if (counterA == 7){
			board [0][0] = '1';
		}
	}
}
