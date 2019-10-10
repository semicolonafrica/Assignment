package exercise10_17;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarbonFootPrintTest {

	Building myBuilding;
	Car myCar;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		myBuilding = new Building();
		myCar = new Car();
		myBuilding.setNaturalGas(500);
		myCar.setTotalGallons(5.0);
		myCar.setTotalMiles(20.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBuildingImplementation() {
		assertNotNull(myBuilding);
		assertEquals(myBuilding.getFactor(),11.7);
		assertEquals(myBuilding.getNaturalGas(),500);
		
		assertEquals(myBuilding.getCarbonFootPrint(),5850);
		System.out.println(myBuilding);
		System.out.println();
	}
	
	@Test
	
	void testCarImplementation() {
		assertNotNull(myCar);
		assertEquals(myCar.getCarbonPercent(),19.4);
		assertEquals(myCar.getTotalGallons(),5.0);
		assertEquals(myCar.getTotalMiles(),20.0);
		
		assertEquals(myCar.getCarbonFootPrint(),77.6);
		System.out.println(myCar);
	}
	@Test
	void testCarbonFootPrintPolymorphically() {
		ArrayList <CarbonFootPrint> carbon = new ArrayList <CarbonFootPrint>();
		carbon.add(myCar);
		carbon.add(myBuilding);
		
		for(CarbonFootPrint useCarbon: carbon) {
			System.out.println(useCarbon.toString());
		}
	}

}
