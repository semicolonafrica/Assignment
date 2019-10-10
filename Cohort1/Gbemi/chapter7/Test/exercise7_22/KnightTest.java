/**
 * 
 */
package exercise7_22;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author User
 *
 */
class KnightTest {
	Knight myKnight;
	ChessBoard myBoard;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		myKnight = new Knight();
		myBoard = new ChessBoard();
		
	
		int[][]chess = new int [8][8];
		myBoard.setBoard(chess);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void knightInitializeTest() {
		assertNotNull(myKnight.getHorizontal());
		assertNotNull(myKnight.getVertical());
		assertNotNull(myBoard.getBoard());
		assertEquals(myKnight.getCurrentColumn(),0);
		assertEquals(myKnight.getCurrentRow(),0);
		assertEquals(0,myBoard.getBoard()[myKnight.getCurrentColumn()][myKnight.getCurrentRow()]);
	}
	
	@Test
	void chessBoardInitializedTest (){
		assertNotNull(myBoard);
		assertNotNull(myBoard.getBoard());
	}
	
	@Test
	void knightCurrentPositionTest() {
	     
	     assertEquals(myKnight.getCurrentRow(),0);
	     assertEquals(myKnight.getCurrentColumn(),0);
		
	}
	@Test
	void moveNumberSevenTest() {
	     myKnight.knightMove(7,myBoard);
	     assertEquals(myKnight.getCurrentRow(),1);
	     assertEquals(myKnight.getCurrentColumn(),2);
		
	}
	
	@Test
	void moveNumberSixTest() {
	     myKnight.knightMove(6,myBoard);
	     assertEquals(myKnight.getCurrentRow(),2);
	     assertEquals(myKnight.getCurrentColumn(),1);
		
	}
	
	@Test
	void moveNumberFiveTest() {
	     myKnight.knightMove(5,myBoard);
	     assertEquals(myKnight.getCurrentRow(),2);
	     assertEquals(myKnight.getCurrentColumn(),-1);
		
	}
	@Test
	void moveNumberFourTest() {
	     myKnight.knightMove(4,myBoard);
	     assertEquals(myKnight.getCurrentRow(),1);
	     assertEquals(myKnight.getCurrentColumn(),-2);
		
	}
	
	@Test
	void moveNumberThreeTest() {
	     myKnight.knightMove(3,myBoard);
	     assertEquals(myKnight.getCurrentRow(),-1);
	     assertEquals(myKnight.getCurrentColumn(),-2);
		
	}
	
	@Test
	void moveNumberTwoTest() {
	     myKnight.knightMove(2,myBoard);
	     assertEquals(myKnight.getCurrentRow(),-2);
	     assertEquals(myKnight.getCurrentColumn(),-1);
		
	}
	
	@Test
	void moveNumberOneTest() {
	     myKnight.knightMove(1,myBoard);
	     assertEquals(myKnight.getCurrentRow(),-2);
	     assertEquals(myKnight.getCurrentColumn(),1);
		
	}
	
	@Test
	void moveNumberZeroTest() {
	     myKnight.knightMove(0,myBoard);
	     assertEquals(myKnight.getCurrentRow(),-1);
	     assertEquals(myKnight.getCurrentColumn(),2);
		
	}
	@Test
	void moveNumberTenOutOfBoardTest() {
	    
	     assertEquals(myKnight.getCurrentRow(),0);
	     assertEquals(myKnight.getCurrentColumn(),0);
	     assertThrows(IllegalArgumentException.class, ()->  myKnight.knightMove(10,myBoard));
		
	}
	
	@Test
	void moveNumberLessThanZeroOutOfBoardTest() {
	    
	     assertEquals(myKnight.getCurrentRow(),0);
	     assertEquals(myKnight.getCurrentColumn(),0);
	     assertThrows(IllegalArgumentException.class, ()->  myKnight.knightMove(-10,myBoard));
		
	}
	

	
	@Test 
	void move64TimesTest() {
		
		assertNotNull(myBoard);
		assertNotNull(myKnight);
		
		
		assertEquals(0 , myKnight.getCurrentColumn());
		assertEquals(0 , myKnight.getCurrentRow());
		
		myKnight.knightMove(7, myBoard);
		
		assertEquals(2 , myKnight.getCurrentColumn());
		assertEquals(1 , myKnight.getCurrentRow());
		
		assertEquals(1, myBoard.getBoard()[myKnight.getCurrentRow()][myKnight.getCurrentColumn()]);
		
			
		myKnight.knightMove(6, myBoard);
		
		assertEquals(3 , myKnight.getCurrentColumn());
		assertEquals(3 , myKnight.getCurrentRow());
		assertEquals(1, myBoard.getBoard()[myKnight.getCurrentRow()][myKnight.getCurrentColumn()]);
		
		
		myKnight.knightMove(6, myBoard);
		
		assertEquals(4 , myKnight.getCurrentColumn());
		assertEquals(5 , myKnight.getCurrentRow());
		
		assertEquals(1, myBoard.getBoard()[myKnight.getCurrentRow()][myKnight.getCurrentColumn()]);
		
		
		for(int row=0; row < myBoard.getBoard().length;row++) {
			
		
			for(int col=0; col< myBoard.getBoard()[row].length;col++) {
				
				if(myBoard.getBoard()[row][col]==1) {
					System.out.print("k");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
		
	}

	 

}
