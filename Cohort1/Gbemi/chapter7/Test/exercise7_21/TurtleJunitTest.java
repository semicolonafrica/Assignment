package exercise7_21;

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
class TurtleJunitTest {
	Turtle myTurtle;
	Pen myTurtlePen;
	SketchPad drawingPad;
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
		myTurtle = new Turtle();
		myTurtlePen = new Pen();
		myTurtle.setTurtlePen(myTurtlePen);
		
		drawingPad = new SketchPad();
		int[][] drawingPadFloor = new int[20][20];
		
		drawingPad.setFloor(drawingPadFloor);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void turtleInitializedTest() {
		assertEquals(myTurtle.getDirection(),0);
		assertNotNull(myTurtle.getTurtlePen());
		assertEquals(myTurtlePen, myTurtle.getTurtlePen());
		assertEquals(PenPosition.UP,myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0,drawingPad.getFloor()[myTurtle.getCurrentRow()][myTurtle.getCurrentColumn()]);
		
	}
	@Test
	void sketchPadIntializedTest() {
		assertNotNull(drawingPad);
		assertNotNull(drawingPad.getFloor());
		
	}
	
	@Test
	void moveForwardTwelveStepsTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveForward(12, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentColumn());
		for(int i = 0; i < 12; i++) {
			
			assertEquals(1, drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
		}
	}
	
	
	@Test
	void moveForwardSevenStepsTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveForward(7, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(6, myTurtle.getCurrentColumn());
		for(int i = 0; i < 7; i++) {
			assertEquals(1, drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
		}
	}
	
	@Test
	void moveForwardTwentyStepsTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveForward(20, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(19, myTurtle.getCurrentColumn());
		for(int i = 0; i < 20; i++) {
			assertEquals(1, drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
		}
	}
	
	@Test
	void moveForwardZeroStepTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP,myTurtle.getTurtlePen().getCurrentPosition());
		assertThrows(IllegalArgumentException.class, ()-> myTurtle.moveForward(0, drawingPad));
		assertEquals(PenPosition.UP,myTurtle.getTurtlePen().getCurrentPosition());
		
	
	}
	
	
	@Test
	void moveForwardTwentyOneStepTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP,myTurtle.getTurtlePen().getCurrentPosition());
		
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(21, drawingPad));
		
	}
	
	
	@Test
	void moveForwardNegativeStepTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP,myTurtle.getTurtlePen().getCurrentPosition());
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(-1, drawingPad));
	
	}
	
	
	@Test
	void moveForwardWithNullSketchpadTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		assertThrows(IllegalArgumentException.class, ()-> myTurtle.moveForward(7, null));
	}
	
	
	@Test
	void turnRightWhenOrientationIsColumnTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		myTurtle.turnRight();
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());
	}
	
	
//	@Test
//	void turnRightWhenOrientationIsRowTest() {
//		assertEquals(0, myTurtle.getCurrentRow());
//		assertEquals(0, myTurtle.getCurrentColumn());
//		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
//		myTurtle.setCurrentOrientation(TurtleOrientation.ROW_DOWN);
//		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());
//		myTurtle.turnRight();
//		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
//	}
	
	
	

	@Test
	void moveForwardTurnRightAndMoveForwardTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT,myTurtle.getCurrentOrientation());
		
		myTurtle.moveForward(12, drawingPad);
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT,myTurtle.getCurrentOrientation());
		for(int i = 0;i<12;i++ ) {
			assertEquals(1,drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
			
		}
		
		myTurtle.turnRight(); 
			assertEquals(0, myTurtle.getCurrentRow());
			assertEquals(11, myTurtle.getCurrentColumn());
			assertEquals(TurtleOrientation.ROW_DOWN,myTurtle.getCurrentOrientation());
			
			
			myTurtle.moveForward(12,drawingPad); 
			assertEquals(11, myTurtle.getCurrentRow());
			assertEquals(11, myTurtle.getCurrentColumn());
			assertEquals(TurtleOrientation.ROW_DOWN,myTurtle.getCurrentOrientation());
			
			for(int i = 0;i<12;i++ ) {
				assertEquals(1,drawingPad.getFloor()[i][myTurtle.getCurrentColumn()]);
				
			}
	}
	
	
	@Test
	void draw12By12SquareTest() {
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		myTurtle.moveForward(12, drawingPad);
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
		}
		
		myTurtle.turnRight();
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());
		
		myTurtle.moveForward(12, drawingPad);
		assertEquals(11, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.getFloor()[i][myTurtle.getCurrentColumn()]);
		}
		
		myTurtle.turnRight();
		assertEquals(11, myTurtle.getCurrentRow());
		assertEquals(11, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_LEFT, myTurtle.getCurrentOrientation());
		
		myTurtle.moveForward(12, drawingPad);
		assertEquals(11, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_LEFT, myTurtle.getCurrentOrientation());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
		}
		
		myTurtle.turnRight();
		assertEquals(11, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.ROW_UP, myTurtle.getCurrentOrientation());
		
		myTurtle.moveForward(12, drawingPad);
		assertEquals(0, myTurtle.getCurrentRow());
		assertEquals(0, myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.ROW_UP, myTurtle.getCurrentOrientation());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.getFloor()[i][myTurtle.getCurrentColumn()]);
		}
		
		for(int i = 0; i < drawingPad.getFloor().length; i++) {
			for(int j = 0; j < drawingPad.getFloor().length; j++) {
				if(drawingPad.getFloor()[i][j] == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	


}

