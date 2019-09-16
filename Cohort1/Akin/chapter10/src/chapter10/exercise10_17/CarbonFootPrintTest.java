package chapter10.exercise10_17;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarbonFootPrintTest {
	
	CarbonFootprint carbonfootprint;
	Bicycle bicycle;
	Car car;
	Building building;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		bicycle = new Bicycle(1236,"Suzuki","two-sitter",34500,3,20.6,4,3);
		car = new Car("KA-32-E4","Green","rkejd3jk403jej3",900_000,5,12.5,2,8);
		building = new Building("Two-Storey","Light-Blue",5493.23,3,19.8,6,2);
	}

	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBicycle() {
		
		assertNotNull(building);
		assertNotNull(car);
		assertNotNull(bicycle);
		
		assertNotEquals(car,building, "Car and building are not similar");
		assertNotSame(car, building, "The car and building arent referring to the same object.");
		
		assertEquals(1236,bicycle.getProductNumber());
		assertEquals("Suzuki",bicycle.getBicycle_name());
		assertEquals("two-sitter",bicycle.getBicycle_type());
	}
	
	@Test
	void testCar() {
		
		assertNotNull(building);
		assertNotNull(car);
		assertNotNull(bicycle);
		
		assertNotEquals(car,building, "Car and building are not similar");
		assertNotSame(car, building, "The car and building arent referring to the same object.");
		
		assertEquals("KA-32-E4",car.getModel());
		assertEquals("Green",car.getColor());
		assertEquals("rkejd3jk403jej3",car.getSerialNumber());
	}
	
	@Test
	void testBuilding() {
		
		assertNotNull(building);
		assertNotNull(car);
		assertNotNull(bicycle);
		
		assertNotEquals(car,bicycle, "The Car and Bicycle are not similar");
		assertNotSame(car, bicycle, "The Car and Bicycle aren't referring to the same object.");
		
		assertEquals("Two-Storey",building.getBuildingStructure());
		assertEquals("Light-Blue",building.getBuildingColor());
		//assertEquals("rkejd3jk403jej3",car.getSerialNumber());
	}

	@Test
	void outputEachClassCarbonFootPrint() {
		
//		carbonfootprint = new CarbonFootprint[3];
//		carbonfootprint[0] = car;
//		carbonfootprint[1] = building;
//		carbonfootprint[2] = bicycle;
		
		List<CarbonFootprint>  carbonfootprint = new ArrayList<>(3);
		
		carbonfootprint.add(car);
		carbonfootprint.add(building);
		carbonfootprint.add(bicycle);
		
//		assertSame(carbonfootprint[0],car);
//		assertEquals(carbonfootprint[0],car);
//		
//		assertEquals(carbonfootprint[1],building);
//		assertEquals(carbonfootprint[1],building);
//		
//		assertSame(carbonfootprint[2],bicycle);
//		assertEquals(carbonfootprint[2],bicycle);
		
		for(CarbonFootprint footprint : carbonfootprint) {
			System.out.println(footprint);
		}
	}
}
