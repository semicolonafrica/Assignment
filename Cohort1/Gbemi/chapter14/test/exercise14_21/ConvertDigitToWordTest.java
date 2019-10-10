package exercise14_21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConvertDigitToWordTest {
ConvertDigitsToWord myConverter;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		myConverter = new ConvertDigitsToWord();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMyinputThreeValuesTest() {
		assertNotNull(myConverter);
		myConverter.setNumber("169.46");
//		System.out.println(myConverter.getWord(myConverter.getNumber()));
		
		assertEquals("ONE HUNDRED SIXTY NINE 46/100",
				myConverter.getWord(myConverter.getNumber()));
		//assertEquals(myConverter.getToken(),"[428,66]");
	}
	@Test
	void testMyinputTwoValuesTest() {
		assertNotNull(myConverter);
		myConverter.setNumber("69.46");
		
		assertEquals("SIXTY NINE 46/100", 
				myConverter.getWord(myConverter.getNumber()));
		//assertEquals(myConverter.getToken(),"[428,66]");
	}
	@Test
	void testMyinputOneValuesTest() {
		assertNotNull(myConverter);
		myConverter.setNumber("17.46");
		
		assertEquals("SEVENTEEN 46/100", 
				myConverter.getWord(myConverter.getNumber()));
		//assertEquals(myConverter.getToken(),"[428,66]");
	}
	
	

}
