package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorJunit {
	Calculator cal=new Calculator();
	@Test
	void test() {

		//assertEquals(8,cal.add(4,4));
		assertEquals(1.0,cal.division(1.0, 0.0));
	}

}
