
public class Board {
		public static final int SIZE = 3;
		private char board [][];
		
		public Board() {
			board = new char[SIZE][SIZE];
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					board[i][j]=' ';
				}
			}
		}
		public String toString() {
			StringBuilder boardStringB = new StringBuilder("");
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					if(j == 0) {
						boardStringB.append("|");
						boardStringB.append(board[i][j]+" ");
					}
					else if (j == SIZE-1) {
						boardStringB.append(board[i][j]+" ");
						boardStringB.append("|");
						boardStringB.append("\n");
					}
					else {
						boardStringB.append(board[i][j]+" ");
					}
			}
		}
			String boardString = boardStringB.toString();
			return boardString;
		}
		public void makeMove(char c, int row, int col) {
			board[row-1][col-1]=c;
		}
		public boolean isEmpty(int row, int col) {
			if(board[row-1][col-1]==' ') {
				return true;
			}
			else return false;
		}
		public boolean isValidMove(int row, int col) {
			if (row > 0 && row<=SIZE && col > 0 && col <= SIZE) {
				return true;
			}
			else return false;
		}
		public boolean gameWon() {
			if(board[0][0]==board[0][1] && board[0][0]==board[0][2] && board[0][0]!=' ') {
				return true;
			}
			if(board[1][0]==board[1][1] && board[1][0]==board[1][2] && board[1][0]!=' ') {
				return true;
			}
			if(board[2][0]==board[2][1] && board[2][0]==board[2][2] && board[2][0]!=' ') {
				return true;
			}
			if(board[0][0]==board[1][0] && board[0][0]==board[2][0] && board[0][0]!=' ') {
				return true;
			}
			if(board[0][1]==board[1][1] && board[0][1]==board[2][1] && board[0][1]!=' ') {
				return true;
			}
			if(board[0][2]==board[1][2] && board[0][2]==board[2][2] && board[0][2]!=' ') {
				return true;
			}
			if(board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[0][0]!=' ') {
				return true;
			}
			if(board[2][0]==board[1][1] && board[2][0]==board[0][2] && board[2][0]!=' ') {
				return true;
			}
			return false;
		}
}
