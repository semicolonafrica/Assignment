package TestDrivenTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalTest {

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		assertEquals(5, cal.add(2, 3));
		
	}

	@Test
	void testDivide() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		assertEquals(3, cal.divide(6, 2));
	}

}
