package chapter9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuadrilateralTest {
	
	Point point1;
	Point point2;
	Point point3;
	Point point4;
	Square sqr;
	Trapezoid trap;
	
	Quadrilateral quad;
	Rectangle rec;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		point1 = new Point(1,2);
		point2 = new Point(6,7);
		point3 = new Point(5,4);
		point4 = new Point(9,2);
		
		quad = new Quadrilateral(point1,point2,point3,point4);
		rec = new Rectangle(point1,point2,point3,point4);
		sqr = new Square(point1,point2,point3,point4);
		trap = new Trapezoid(point1,point2,point3,point4);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		assertNotNull(point1);
		assertNotNull(point2);
		assertNotNull(point3);
		assertNotNull(point4);
		
		assertEquals(point1, quad.getFirst());
		assertEquals(point2, quad.getSecond());
		assertEquals(point3, quad.getThird());
		assertEquals(point4, quad.getFourth());
		
		assertEquals(quad.getFirst(), rec.getFirst());
		assertEquals(quad.getSecond(), rec.getSecond());
		assertEquals(quad.getThird(), rec.getThird());
		assertEquals(quad.getFourth(), rec.getFourth());
		
		
	}
	
	@Test
	void calculateAreaForRectangle() {
		
		assertNotNull(rec.getThird());
		assertEquals(1,quad.getFirst().getX());
		assertEquals(2,quad.getFirst().getY());
		
		
		point1.setX(0);
		point1.setY(0);
		
		point2.setX(6);
		point2.setY(0);
		
		point3.setX(6);
		point3.setY(4);
		
		point4.setX(0);
		point4.setY(4);
		
		System.out.print(rec.toString());
		
		
		
	}
	
	@Test 
	void calculateAreaForSquare() {
		
		point1.setX(11);
		point1.setY(8);
		
		point2.setX(11);
		point2.setY(22);
		
		point3.setX(25);
		point3.setY(22);
		
		point4.setX(25);
		point4.setY(8);
		
		assertEquals(0,sqr.diffX1());
		assertEquals(196,sqr.diffY1());
		
		assertEquals(0,sqr.diffX2());
		assertEquals(196,sqr.diffY2());
		
		assertEquals(quad.getFirst(), rec.getFirst());
		assertEquals(quad.getSecond(), rec.getSecond());
		assertEquals(quad.getThird(), rec.getThird());
		assertEquals(quad.getFourth(), rec.getFourth());
		
		assertEquals(14,sqr.getDistanceAB());
		assertEquals(14,sqr.getDistanceCD());
		
		System.out.print(sqr.toString());
	}
	
	@Test
	void calculateAreaOfaTrapezoid() {
		
		point1.setX(5);
		point1.setY(7);
		
		point2.setX(8);
		point2.setY(2);
		
		point3.setX(3);
		point3.setY(4);
		
		point4.setX(5);
		point4.setY(9);
		
		assertEquals(9,trap.diffX1());
		assertEquals(25,trap.diffY1());
		
		assertEquals(25,trap.diffX2());
		assertEquals(4,trap.diffY2());
		
		assertEquals(4,trap.diffX3());
		assertEquals(25,trap.diffY3());
		
		assertEquals(0,trap.diffX4());
		assertEquals(4,trap.diffY4());
		
		assertEquals(quad.getFirst(), trap.getFirst());
		assertEquals(quad.getSecond(), trap.getSecond());
		assertEquals(quad.getThird(), trap.getThird());
		assertEquals(quad.getFourth(), trap.getFourth());
		
		assertEquals(Math.sqrt(34),trap.getDistanceAB());
		assertEquals(Math.sqrt(4),trap.getDistanceDA());
		
		System.out.print(trap.toString());
	}
}
