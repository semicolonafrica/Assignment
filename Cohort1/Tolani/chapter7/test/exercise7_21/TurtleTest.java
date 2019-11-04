/**
 * 
 */
package exercise7_21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * @author Omotolani
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
		int[][] drawingPadFloor = new int [20][20];
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
		
		assertEquals(myTurtlePen,myTurtle.getTurtlePen());
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
		assertEquals(0,drawingPad.getFloor()[myTurtle.getRow()][myTurtle.getColumn()]);
	}
	
	@Test
	void sketchPadInitializedTest() {
		
		assertNotNull(drawingPad);
		
		assertNotNull(drawingPad.getFloor());
		
		//assertArrayNotEquals(drawingPad.getFloor(),drawingPadFloor);
	}
	
	@Test
	void moveForwardTwelveStepsTest() {
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
		myTurtle.moveForward(12,drawingPad);
		
		assertEquals(PenEnum.DOWN,myTurtle.getTurtlePen().getCurrentPositin());
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(11,myTurtle.getColumn());
		
		for(int i = 0;i< 12;i++) {
			assertEquals(1,drawingPad.getFloor()[myTurtle.getRow()][i]);
		}
	
	  
	}
	
	@Test
	void moveForwardSevenStepsTest() {
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
		myTurtle.moveForward(7,drawingPad);
		
		assertEquals(PenEnum.DOWN,myTurtle.getTurtlePen().getCurrentPositin());
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(6,myTurtle.getColumn());
		
		for(int i =0;i< 7;i++) {
			assertEquals(1,drawingPad.getFloor()[myTurtle.getRow()][i]);
		}
	
	}  
	
	
	@Test
	void moveForwardTwentyStepsTest() {
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
		myTurtle.moveForward(20,drawingPad);
		
		assertEquals(PenEnum.DOWN,myTurtle.getTurtlePen().getCurrentPositin());
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(19,myTurtle.getColumn());
		
		for(int i =0;i< 20;i++) {
			assertEquals(1,drawingPad.getFloor()[myTurtle.getRow()][i]);
		}
	
	}  
	
	@Test
	void moveForwardWithNegativeStepsTest() {
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(-7,drawingPad));
	}  
	
	@Test
	void moveForwardTwentyOneStepsTest() {
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(21,drawingPad));
		
	
	}  
	
	@Test
	void moveForwardZeroStepsTest() {
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(0,drawingPad));
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
	  
	}
	
	@Test
	void sketchPadIsNullTest() {
		
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(PenEnum.UP,myTurtle.getTurtlePen().getCurrentPositin());
		
		assertThrows(IllegalArgumentException.class,()-> myTurtle.moveForward(21,null));
		
	
	}  
	
	@Test
	void turnRightWhenOrientationIsColumnTest() {
		assertEquals(0,myTurtle.getRow());
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(TurtleOrientation.COLUMN_RIGHT,myTurtle.getCurrentOrientation());
		
		myTurtle.turnRight();
		
		assertEquals(TurtleOrientation.ROW_DOWN,myTurtle.getCurrentOrientation());
			
		
	}
	
	@Test
	void turnRightWhenOrientationIsRowTest() {
		
		assertEquals(0,myTurtle.getRow());
		
		
		assertEquals(0,myTurtle.getColumn());
		
		assertEquals(TurtleOrientation.COLUMN_RIGHT,myTurtle.getCurrentOrientation());
		
		myTurtle.setCurrentOrientation(TurtleOrientation.ROW_DOWN);
		
		assertEquals(TurtleOrientation.ROW_DOWN,myTurtle.getCurrentOrientation());
		
		myTurtle.turnRight();
		
		assertEquals(TurtleOrientation.COLUMN_LEFT,myTurtle.getCurrentOrientation());
			
		
	}
	
	@Test
	void moveForwardTurnRinghtAndMoveForward() {
		
		assertEquals(0,myTurtle.getRow());
		assertEquals(0,myTurtle.getColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT,myTurtle.getCurrentOrientation());
		
		myTurtle.moveForward(12,drawingPad);
		assertEquals(0,myTurtle.getRow());
		assertEquals(11,myTurtle.getColumn());
		assertEquals(TurtleOrientation.COLUMN_RIGHT,myTurtle.getCurrentOrientation());
		for(int i = 0;i< 12;i++) {
			assertEquals(1,drawingPad.getFloor()[myTurtle.getRow()][i]);
		}
		
		myTurtle.turnRight();
		assertEquals(0,myTurtle.getRow());
		assertEquals(11,myTurtle.getColumn());
		assertEquals(TurtleOrientation.ROW_DOWN,myTurtle.getCurrentOrientation());
		
		myTurtle.moveForward(12,drawingPad);
		assertEquals(11,myTurtle.getRow());
		assertEquals(11,myTurtle.getColumn());
		assertEquals(TurtleOrientation.ROW_DOWN,myTurtle.getCurrentOrientation());
		for(int i = 0;i< 12;i++) {
			assertEquals(1,drawingPad.getFloor()[i][myTurtle.getColumn()]);
		}
		
		myTurtle.turnRight();
		assertEquals(11,myTurtle.getRow());
		assertEquals(11,myTurtle.getColumn());
		assertEquals(TurtleOrientation.COLUMN_LEFT,myTurtle.getCurrentOrientation());
		
		myTurtle.moveForward(12,drawingPad);
		assertEquals(11,myTurtle.getRow());
		assertEquals(0,myTurtle.getColumn());
		assertEquals(TurtleOrientation.COLUMN_LEFT,myTurtle.getCurrentOrientation());
		for(int i = 0;i< 12;i++) {
			
			assertEquals(1,drawingPad.getFloor()[myTurtle.getRow()][i]);
		}
		
		
		myTurtle.turnRight();
		assertEquals(11,myTurtle.getRow());
		assertEquals(0,myTurtle.getColumn());
		assertEquals(TurtleOrientation.ROW_UP,myTurtle.getCurrentOrientation());
		
		myTurtle.moveForward(12,drawingPad);
		assertEquals(0,myTurtle.getRow());
		assertEquals(0,myTurtle.getColumn());
		assertEquals(TurtleOrientation.ROW_UP,myTurtle.getCurrentOrientation());
		for(int i = 0;i< 12;i++) {
			
			assertEquals(1,drawingPad.getFloor()[i][myTurtle.getColumn()]);
		}
		
		
		for(int i =0;i< drawingPad.getFloor().length;i++) {
			for(int j =0;j<drawingPad.getFloor().length;j++) {
				if(drawingPad.getFloor()[i][j] == 0)
					System.out.print(" ");
				else
					System.out.print("*");
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	
	

	
	

}
