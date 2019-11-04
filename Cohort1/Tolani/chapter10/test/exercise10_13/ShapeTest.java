package exercise10_13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeTest {
	
	Circle circle;
	
	Square square;
	
	Triangle triangle;
	
	Sphere sphere;
	
	Cube cube;
	
	Tetrahedron tetrahedron;
	
	double edge;
	
	double radius;
	
	double length;
	
	double height;
	
	double breadth;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		radius = 5;
		
		length = 7;
		
		breadth = 7;
		
		height = 14;
		
		edge = 8;
		
		circle = new Circle(radius);
		
		square = new Square(length,breadth);
		
		triangle = new Triangle(breadth,height);
		
		sphere = new Sphere(radius);
		
		cube = new Cube(edge);
		
		tetrahedron = new Tetrahedron(edge);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void InitializedVariableForCircletest() {
		assertEquals(circle.getRadius(),radius);
	}
	
	@Test
	void InitializedVariableForSquaretest() {
		assertEquals(square.getLength(),length);
		
		assertEquals(square.getBreadth(),breadth);

	}
	
	@Test
	void methodCircleAreaTest() {
		assertNotNull(circle.getArea());
	}
	
	@Test
	void methodSquareAreaTest() {
		assertNotNull(square.getArea());
	}
	
	@Test
	void checkIfLengthIsNotEqualToBreadthTest() {
		assertThrows(IllegalArgumentException.class,()-> square.setLength(8));	
	}
	
	@Test
	void checkIfBreadthIsNotEqualToLengthTest() {
		assertThrows(IllegalArgumentException.class,()-> square.setBreadth(8));	
	}
	
	@Test
	void InitializedVariableForTriangletest() {
		
		assertEquals(triangle.getBreadth(),breadth);
		
		assertEquals(triangle.getHeight(),height);

	}

	@Test
	void methodTriangleAreaTest() {
		assertNotNull(triangle.getArea());
	}

	@Test
	void InitializedVariableForSpheretest() {
		assertEquals(sphere.getRadius(),radius);
	}
	
	@Test
	void methodSphereAreaTest() {
		assertNotNull(sphere.getArea());
	}
	
	@Test
	void methodSphereVolumeTest() {
		assertNotNull(sphere.getVolume());
	}
	
	@Test
	void InitializedVariableForCubetest() {
		assertEquals(cube.getEdge(),edge);
	}
	
	@Test
	void methodCubeAreaTest() {
		assertNotNull(cube.getArea());
	}
	
	@Test
	void methodCubeVolumeTest() {
		assertNotNull(cube.getVolume());
	}
	
	@Test
	void InitializedVariableForTetrahedronTest() {
		assertEquals(tetrahedron.getEdge(),edge);
	}
	
	@Test
	void methodTetrahedronAreaTest() {
		assertNotNull(tetrahedron.getArea());
	}
	
	@Test
	void methodTetrahedronVolumeest() {
		assertNotNull(tetrahedron.getVolume());
	}
}
