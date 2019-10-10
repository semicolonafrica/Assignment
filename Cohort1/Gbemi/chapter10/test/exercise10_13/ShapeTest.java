package exercise10_13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeTest {
   
      Square twoDia;
    TwoDimensional squareShape;
    Cube myCube;
    
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		twoDia = new Square();
		myCube = new Cube();
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSquare(){
		assertNotNull(twoDia);
		assertEquals(twoDia.getLength(),0);
		twoDia.setLength(4.0);
		assertEquals(twoDia.getLength(),4.0);
		assertEquals(twoDia.calArea(),16.0);
		System.out.println("this is a Two Dimensional Shape of Square");
		System.out.println(twoDia.toString());
	}
	
	@Test
	void testCube() {
		assertNotNull(myCube);
		assertEquals(myCube.getEdge(),0);
		assertEquals(myCube.getSide(),0);
		myCube.setSide(4.0);
		myCube.setEdge(14.0);
		assertEquals(myCube.getEdge(),14.0);
		assertEquals(myCube.calArea(),96.0);
		assertEquals(myCube.calVolume(),50);
		System.out.println(myCube.toString());
	}
	
	

}
