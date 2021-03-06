

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ABIR
 */
public class TicTocConsole {
        static Scanner sc;
	static String[] table;
	static String turn;
     public static void main(String[] args) {
		sc = new Scanner(System.in);
		table = new String[9];
		turn = "X";
		String winner = null;
		EmptyTable();

		drawTable();
		System.out.println("Enter a number to place X : ");

		while (winner == null) {
			int numInput;
			try {
				numInput = sc.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("Sorry:/ ");
                                        System.out.println("please Enter a new number:");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Sorry:/ ");
                                System.out.println("please Enter a new number:");
				continue;
			}
			if (table[numInput-1].equals(String.valueOf(numInput))) {
				table[numInput-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				drawTable();
				//winner = theWinner();
				winner = theWinner(table); //Passing table Param for JUnit test case
			} else {
				System.out.println("Sorry:/ ");
                                System.out.println("please Enter a new number:");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("");
		} else {
			System.out.println("Congratulations! " + winner + "'s have won!");
		}
	}
     //Added table Param for JUnit test case 
     //static String theWinner() {  
	static String theWinner(String[] table) {
		for (int a = 0; a < 8; a++) {
			String line = null;
			switch (a) {
			case 0:
				line = table[0] + table[1] + table[2];
				break;
			case 1:
				line = table[3] + table[4] + table[5];
				break;
			case 2:
				line = table[6] + table[7] + table[8];
				break;
			case 3:
				line = table[0] + table[3] + table[6];
				break;
			case 4:
				line = table[1] + table[4] + table[7];
				break;
			case 5:
				line = table[2] + table[5] + table[8];
				break;
			case 6:
				line = table[0] + table[4] + table[8];
				break;
			case 7:
				line = table[2] + table[4] + table[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(table).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}

//An alternate method for testing
	static String checkWinner(String[] board) {
		for (int a = 0; a < 8; a++) {
			String line = null;
			//System.out.println(board[0] + board[1] + board[2]);
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "draw";
		}

		System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
		return null;
	}
     
     
     static void drawTable() {
		System.out.println("---|----|---");
		System.out.println("| " + table[0] + " | " + table[1] + " | " + table[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + table[3] + " | " + table[4] + " | " + table[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + table[6] + " | " + table[7] + " | " + table[8] + " |");
		System.out.println("---|---|----");
	}

	static void EmptyTable() {
		for (int a = 0; a < 9; a++) {
			table[a] = String.valueOf(a+1);
		}
	}
     
}
