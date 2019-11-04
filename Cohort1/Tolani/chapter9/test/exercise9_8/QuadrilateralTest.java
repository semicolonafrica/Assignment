/**
 * 
 */
package exercise9_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author user
 *
 */
class QuadrilateralTest {
	
	Quadrilateral quadrilateral;
	
	Parallelogram parallelogram;
	
	Trapeziod trapeziod;
	
	Rectangle rectangle;
	
	Square square;
	
	Point pointA;
	
	Point pointB;
	
	Point pointC;
	
	Point pointD;

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
		quadrilateral = new Quadrilateral();

		
		pointA = new Point(2,3);
		pointB = new Point(4,5);
		pointC = new Point(1,2);
		pointD = new Point(2,4);
		quadrilateral.setPointA(pointA);
		quadrilateral.setPointB(pointB);
		quadrilateral.setPointC(pointC);
		quadrilateral.setPointD(pointD);
	
		parallelogram = new Parallelogram(pointA,pointB,pointC,pointD);
		rectangle = new Rectangle(pointA,pointB,pointC,pointD);
		square = new Square(pointA, pointB, pointC, pointD);
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void distanceBetweenTwoPointtest() {
		assertNotNull(quadrilateral.distanceBetweenTwoPoint(pointA,pointB));	
		assertNotNull(quadrilateral.distanceBetweenTwoPoint(pointC, pointD));
		
	}
	
	@Test
	void areaTest() {
		assertNotNull(quadrilateral.distanceBetweenTwoPoint(pointA,pointB));	
		assertNotNull(quadrilateral.distanceBetweenTwoPoint(pointC, pointD));
		quadrilateral.calculateArea();
		
	}
	
	@Test
	void areaOfAParallelogramTest() {
		parallelogram.calculateArea();
		rectangle.calculateArea();
		
	}
	
	@Test
	void caculateSquareAreaTest() {
		assertFalse(square.equalXcordinates(pointA,pointB));
		assertFalse(square.equalXcordinates(pointC,pointD));
		assertEquals(square.distanceBetweenTwoPoint(pointA,pointB),0);
		pointA.setCordinateX(7);
		pointA.setCordinateY(10);
		pointB.setCordinateX(7);
		pointB.setCordinateY(12);
		pointC.setCordinateX(9);
		pointC.setCordinateY(14);
		pointD.setCordinateX(9);
		pointD.setCordinateY(18);
		assertTrue(square.equalXcordinates(pointA,pointB));
		assertTrue(square.equalXcordinates(pointC,pointD));
		assertNotNull(square.distanceBetweenTwoPoint(pointA,pointB));
		assertNotNull(square.distanceBetweenTwoPoint(pointC,pointD));
		square.calculateArea();
		
	}
	
	
}
