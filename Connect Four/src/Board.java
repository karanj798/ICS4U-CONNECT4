

public class Board {
	
	private char board [] [] = new char [7] [7] ;
	int counterA, counterB, counterC, counterD, counterE, counterF, counterG;
	public Board (int counterA, int counterB, int counterC, int counterD, int counterE, int counterF, int counterG){
		this.counterA = counterA;
	}
	public void makeBoard (){
		for (int i = 0; i < 7; i++){
			for (int j = 0; j < 7; j++){
				board [i][j] = 'X'; // blank array // we update this when button pressed
			}
		}
	}
	// look carefully ok???
	public void updateBoardA (int counterA){
		if (counterA == 1){
			board [6][0] = '1'; // 1 because player 1
		}
		else if (counterA == 2){
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
