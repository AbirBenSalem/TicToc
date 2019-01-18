<<<<<<< HEAD
//package tictactoe;

import static org.junit.Assert.*;

=======
import static org.junit.Assert.*;
>>>>>>> 68dadb30bbcb7a5ae812e7e33f1d7892a4133041
import org.junit.Test;

public class TicTocConsoleTest {
 static String[] table =new String[9];
<<<<<<< HEAD
	
 	@Test
	public void testBoardRowWin() {
=======

 @Test
 public void testBoardRowWin() {
>>>>>>> 68dadb30bbcb7a5ae812e7e33f1d7892a4133041
     table[0]="X";	
     table[1]="X";
     table[2]="X";     
     String expected ="X";
<<<<<<< HEAD
     String result=TicTocConsole.checkWinner(table);
     assertTrue(expected.equals(result));     
	}
	
 	@Test
	public void testBoardRowDraw() {
=======
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardRowDraw() {
>>>>>>> 68dadb30bbcb7a5ae812e7e33f1d7892a4133041
     table[3]="X";	
     table[4]="X";
     table[5]="O";     
     String expected ="draw";
<<<<<<< HEAD
     String result=TicTocConsole.checkWinner(table);
     assertTrue(expected.equals(result));     
	}
	
 	@Test
	public void testBoardColumnWin() {
=======
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardColumnWin() {
>>>>>>> 68dadb30bbcb7a5ae812e7e33f1d7892a4133041
     table[0]="O";	
     table[3]="O";
     table[6]="O";     
     String expected ="O";
<<<<<<< HEAD
     String result=TicTocConsole.checkWinner(table);
     assertTrue(expected.equals(result));     
	}

 	@Test
	public void testBoardColumnDraw() {
=======
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardColumnDraw() {
>>>>>>> 68dadb30bbcb7a5ae812e7e33f1d7892a4133041
     table[0]="O";	
     table[3]="O";
     table[6]="X";     
     String expected ="draw";
<<<<<<< HEAD
     String result=TicTocConsole.checkWinner(table);
     assertTrue(expected.equals(result));     
	}
 	
 	@Test
	public void testBoardDiagonalWin() {
=======
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardDiagonalWin() {
>>>>>>> 68dadb30bbcb7a5ae812e7e33f1d7892a4133041
     table[0]="X";	
     table[4]="X";
     table[8]="X";     
     String expected ="X";
<<<<<<< HEAD
     String result=TicTocConsole.checkWinner(table);
     assertTrue(expected.equals(result));     
	}
 	
 	@Test
	public void testBoardDiagonalDraw() {
=======
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardDiagonalDraw() {
>>>>>>> 68dadb30bbcb7a5ae812e7e33f1d7892a4133041
     table[2]="O";	
     table[4]="X";
     table[6]="O";     
     String expected ="draw";
<<<<<<< HEAD
     String result=TicTocConsole.checkWinner(table);
     assertTrue(expected.equals(result));     
	}
 	
 	@Test
 	public void testNonEmptyBoard(){
 		String[] expectedBoardVal=new String[9];
 		String[] actualBoardVal=new String[9];
 		assertArrayEquals(expectedBoardVal, actualBoardVal);
 	}
}

=======
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
  public void testNonEmptyBoard(){
 		String[] expectedBoardVal=new String[9];
 		String[] actualBoardVal=new String[0];
 		assertArrayEquals(expectedBoardVal, actualBoardVal);
 }
}
>>>>>>> 68dadb30bbcb7a5ae812e7e33f1d7892a4133041
