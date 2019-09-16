/**
 * 
 */
package chapter10.exercise10_13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author akeens4
 *
 */
class ShapeTest {

	//Highest Super Class
	Shape[] shape;
	
	//Next Super Classes
	TwoDimensionalShape twoDimensionalShape;
	ThreeDimensionalShape threeDimensionalShape;
	
	//Concrete Classes for Two dimensional Shapes
	Circle circle;
	Triangle triangle;
	Square square;
	
	//Concrete Classes for Three dimensional Shapes 
	Cube cube;
	Tetrahedron tetrahedron;
	Sphere sphere;

	
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
		
		twoDimensionalShape = new TwoDimensionalShape(5,7);
		threeDimensionalShape = new ThreeDimensionalShape(7,5,8);
		
		circle = new Circle(5,7);
		triangle = new Triangle(8,9);
		square = new Square(4,8);
		
		cube = new Cube(9,7,6);
		tetrahedron = new Tetrahedron(9,7,5);
		sphere = new Sphere(2,3,14,7);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link chapter10.exercise10_13.Shape#getLength()}.
	 */
	@Test
	void testTwoDimensionalShape() {
		assertNotNull(twoDimensionalShape);
		assertEquals(5,twoDimensionalShape.getLength());
		assertEquals(7, twoDimensionalShape.getBreadth());
		assertEquals(35, twoDimensionalShape.getArea());
	}

	/**
	 * Test method for {@link chapter10.exercise10_13.Shape#setLength(int)}.
	 */
	@Test
	void testThreeDimensionalShape() {
		
		assertNotNull(threeDimensionalShape);
		assertEquals(7,threeDimensionalShape.getLength());
		assertEquals(5, threeDimensionalShape.getBreadth());
		assertEquals(8, threeDimensionalShape.getHeight());
		assertEquals(35, threeDimensionalShape.getArea());
		assertEquals(280,threeDimensionalShape.getVolume());
		
	}
	
	@Test
	void getTheValueOfEachShape() {
		
		square.setLength(6);
		square.setBreadth(6);
		
		circle.setRadius(8);
		cube.setLength(9);
		
		tetrahedron.setLength(30);
		
		shape = new Shape[8];
		
		shape[0] = twoDimensionalShape;
		shape[1] = threeDimensionalShape;
		
		
		shape[2] = square;
		shape[3] = triangle;
		shape[4] = circle;
		
		shape[5] = sphere;
		shape[7] = cube;
		shape[6] = tetrahedron;
		
		assertEquals(shape[0], twoDimensionalShape);
		
		for(Shape currentShape : shape) {
			
			//System.out.println(currentShape);
			
			//determine whether the shape is Two Dimensional Shape or Three Dimensional Shape
			if(currentShape instanceof Circle) {
				
				//downcast Shape to TwoDimensionalShape
				Circle newShape1 = (Circle) currentShape;
				System.out.println(newShape1);
				
			} else if(currentShape instanceof Square) { 
				Square newShape2 = (Square) currentShape;
				System.out.println(newShape2);
				
			}
			else if(currentShape instanceof Triangle) {
				Triangle newShape3 = (Triangle) currentShape;
				System.out.println(newShape3);
			}	
			
			else if(currentShape instanceof Sphere){
				//downcast Shape to TwoDimensionalShape
				Sphere newShape4 = (Sphere) currentShape;
				System.out.println(newShape4);
				
			} else if(currentShape instanceof Tetrahedron) {
				
				Tetrahedron newShape5 = (Tetrahedron) currentShape;
				System.out.println(newShape5);
			} else if(currentShape instanceof Cube) {
				
				Cube newShape6 = (Cube) currentShape;
				System.out.println(newShape6);
			}
			}
			

		}

//		for(int j = 0; j < shape.length; j++) {
//			System.out.printf("Shape %d is a %s%n", 
//					shape[j].getClass().getName());
//		}
	}

