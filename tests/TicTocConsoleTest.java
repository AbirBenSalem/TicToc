import static org.junit.Assert.*;
import org.junit.Test;

public class TicTocConsoleTest {
 static String[] table =new String[9];

 @Test
 public void testBoardRowWin() {
     table[0]="X";	
     table[1]="X";
     table[2]="X";     
     String expected ="X";
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardRowDraw() {
     table[3]="X";	
     table[4]="X";
     table[5]="O";     
     String expected ="draw";
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardColumnWin() {
     table[0]="O";	
     table[3]="O";
     table[6]="O";     
     String expected ="O";
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardColumnDraw() {
     table[0]="O";	
     table[3]="O";
     table[6]="X";     
     String expected ="draw";
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardDiagonalWin() {
     table[0]="X";	
     table[4]="X";
     table[8]="X";     
     String expected ="X";
     String result=TicTocConsole.theWinner(table);
     assertTrue(expected.equals(result));     
}

 @Test
 public void testBoardDiagonalDraw() {
     table[2]="O";	
     table[4]="X";
     table[6]="O";     
     String expected ="draw";
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
