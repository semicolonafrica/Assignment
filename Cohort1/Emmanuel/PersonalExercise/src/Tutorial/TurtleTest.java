package Tutorial;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author USER
 *
 */
class TurtleTest {
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
		//int[][] position = drawingPad.getFloor();
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void turtleinitializedTest() {
		System.out.println("Running Turtle innitialization test");
		assertEquals(myTurtle.getDirection(),0);
		assertNotNull(myTurtle.getTurtlePen());
		assertEquals(myTurtlePen, myTurtle.getTurtlePen());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0, drawingPad.getFloor()[myTurtle.getCurrentRow()][myTurtle.getCurrentColumn()]);
		System.out.println(" Done Running Turtle innitialization test");
	}
	
	@Test
	void sketchPadInitializedTest() {
		assertNotNull(drawingPad);
		assertNotNull(drawingPad.getFloor());
	}
	
	@Test
	void moveForwardTwelveStepsTest() {
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveForward(12, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(11,myTurtle.getCurrentColumn());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
		}
	}
	
	@Test
	void moveForwardSevenStepsTest() {
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveForward(7, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(6,myTurtle.getCurrentColumn());
		for(int i = 0; i < 7; i++) {
			assertEquals(1, drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
		}
	}
	
	@Test
	void moveForwardtwentyOneStepsTest() {
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());	
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(21, drawingPad));
	}
	
	@Test
	void moveForwardWithNullSketchPadTest() {
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());	
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(21, null));
	}
	
	@Test
	void moveForwardWithNegativeStepsTest() {
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());	
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(-1, drawingPad));
	}
//	@Test
//	void moveForwardWithZeroStepsTest() {
//		assertEquals(0,myTurtle.getRow());
//		assertEquals(0,myTurtle.getColumn());
//		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());	
//		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(-1, drawingPad));
//	}
	
//	@Test
//	void moveForwardZeroStepsTest() {
//		assertEquals(0,myTurtle.getRow());
//		assertEquals(0,myTurtle.getColumn());
//		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
//		myTurtle.moveForward(0, drawingPad);
//		
//		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
//		assertEquals(0,myTurtle.getRow());
//		assertEquals(0,myTurtle.getColumn());
//		assertEquals(1, drawingPad.getFloor()[myTurtle.getRow()][0]);
//		
//	}
	
	@Test
	void moveForwardTwentyStepsTest() {
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
		assertEquals(PenPosition.UP, myTurtle.getTurtlePen().getCurrentPosition());
		myTurtle.moveForward(20, drawingPad);
		
		assertEquals(PenPosition.DOWN, myTurtle.getTurtlePen().getCurrentPosition());
		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(19,myTurtle.getCurrentColumn());
		for(int i = 0; i < 20; i++) {
			assertEquals(1, drawingPad.getFloor()[myTurtle.getCurrentRow()][i]);
		}
	}
	@Test
	void turnRightWhenOrientationIsColumnTest() {

		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());	
		myTurtle.turnRight();
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());
	}
	
	@Test
	void turnRightWhenOrientationIsRowTest() {

		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
		myTurtle.setCurrentOrientation(TurtleOrientation.ROW_DOWN);
		assertEquals(TurtleOrientation.ROW_DOWN, myTurtle.getCurrentOrientation());	
		myTurtle.turnRight();
		assertEquals(TurtleOrientation.COLUMN_RIGHT, myTurtle.getCurrentOrientation());
	}
	@Test
	void moveForwardTurnRightAndMoveForwardTest() {

		assertEquals(0,myTurtle.getCurrentRow());
		assertEquals(0,myTurtle.getCurrentColumn());
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
		
		
	
	}
	
	

}
