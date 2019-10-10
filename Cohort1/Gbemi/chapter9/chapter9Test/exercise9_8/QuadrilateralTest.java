package exercise9_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuadrilateralTest {
	Quadrilateral quad;
	Point newPoint1;
	Point newPoint2;
	Point newPoint3;
	Point newPoint4;
	//Trapezoid trap;
	//Parallelogram parallel;
	
	Square sqr;
	Point pointSqr1;
	Point pointSqr2;
	Point pointSqr3;
	Point pointSqr4;
	//Trapezoid trap;
	Rectangle rec;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		 //quad =  new Quadrilateral();
		//trap = new Trapezoid();
		//parallel = new Parallelogram();
		sqr = new Square(pointSqr1,pointSqr2,pointSqr3,pointSqr4);
		rec = new Rectangle(newPoint1,newPoint2,newPoint3,newPoint4);
		
		newPoint1 = new Point(1,1);
		rec.setPoint1(newPoint1);
		
		newPoint2 = new Point(3,1);
		rec.setPoint2(newPoint2);
		
		newPoint3 = new Point(3,2);
		rec.setPoint3(newPoint3);
		
		newPoint4 = new Point(1,2);
		rec.setPoint4(newPoint4);
		rec.setBreath(rec.calDistance2());
		rec.setLength(rec.calDistance1());
		
		
		
		pointSqr1 = new Point(2,2);
		sqr.setPoint1(pointSqr1);
		
		pointSqr2 = new Point(7,2);
		sqr.setPoint2(pointSqr2);
		
		pointSqr3 = new Point(7,7);
		sqr.setPoint3(pointSqr3);
		
		pointSqr4 = new Point(2,7);
		sqr.setPoint4(pointSqr4);
		sqr.setLength(sqr.calDistance2());
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testingPointOfRectangle() {
		//assertNotNull(quad);
		//assertNotNull(trap);
		//assertNotNull(parallel);
		
		assertNotNull(rec);
		assertNotNull(newPoint1);
		assertEquals(rec.getPoint1().getX(),1);
		assertEquals(rec.getPoint1().getY(),1);
		
		assertNotNull(newPoint2);
		assertEquals(rec.getPoint2().getX(),3);
		assertEquals(rec.getPoint2().getY(),1);
		
		
		assertNotNull(newPoint3);
		assertEquals(rec.getPoint3().getX(),3);
		assertEquals(rec.getPoint3().getY(),2);
		
		
		assertNotNull(newPoint4);
		assertEquals(rec.getPoint4().getX(),1);
		assertEquals(rec.getPoint4().getY(),2);
		
		assertEquals(rec.calDistance2(),1);
		assertEquals(rec.calDistance1(),2);
		
		
		assertEquals(rec.calArea(),2);
		

	}
	@Test
	void squareClassTest() {
		assertNotNull(sqr);
		
		assertNotNull(pointSqr1);
		assertEquals(sqr.getPoint1().getX(),2);
		assertEquals(sqr.getPoint1().getY(),2);
		
		
		assertNotNull(pointSqr2);
		assertEquals(sqr.getPoint2().getX(),7);
		assertEquals(sqr.getPoint2().getY(),2);
		
		assertNotNull(pointSqr3);
		assertEquals(sqr.getPoint3().getX(),7);
		assertEquals(sqr.getPoint3().getY(),7);
		
		assertNotNull(pointSqr4);
		assertEquals(sqr.getPoint4().getX(),2);
		assertEquals(sqr.getPoint4().getY(),7);
		
		
		assertEquals(sqr.calArea(),25);
		
		
	}

}
