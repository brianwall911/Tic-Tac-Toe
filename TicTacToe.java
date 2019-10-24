import java.util.Scanner;
public class TicTacToe{
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("On each turn enter a row and column number from 1 to 3%n");
		Board b = new Board();
		System.out.println(b);
		boolean winner = false;
		char player = ' ';
		for(int i = 0; i<9; i++) {
			if (i%2 == 0) {
				System.out.printf("It is player X's turn%n");
				player = 'X';
			}
			else {
				System.out.printf("It is player O's turn%n");
				player = 'O';
			}
			System.out.printf("Enter a row:");
			int row = input.nextInt();
			System.out.printf("Enter a column:");
			int col = input.nextInt();
			while(!b.isValidMove(row, col)|| !b.isEmpty(row, col) ){
				if(!b.isValidMove(row, col)) System.out.printf("%nInvalid move!%n");
				else System.out.printf("%nSquare is already filled%n");
				System.out.printf("Enter a row:");
				row = input.nextInt();
				System.out.printf("Enter a column:");
				col = input.nextInt();
			}
			b.makeMove(player, row, col);
			System.out.println(b);
			if(b.gameWon()) {
				break;
			}
		}
		if(b.gameWon()) {
			System.out.printf("Player " + player + " has won!");
		}
		else {
			System.out.printf("Tie Game!");
		}
		}
	
}