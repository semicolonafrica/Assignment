package chapter16;

import static org.junit.jupiter.api.Assertions.*;
import java.util.StringTokenizer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TelephoneNumberTokenizerTest {

	TelephoneNumberTokenizer telephoneNumberTokenizer;
	String telephoneNumber = "(555) 555-5555";
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		telephoneNumberTokenizer = new TelephoneNumberTokenizer();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void getAreaCodeTest() {
		
		
		telephoneNumberTokenizer.setTelephoneNumber(telephoneNumber);
		String areaCode = telephoneNumberTokenizer.getAreaCode();
		assertEquals("555",areaCode);
		
	}
	
	@Test
	void getOtherNumbersTest() {
		
		
		telephoneNumberTokenizer.setTelephoneNumber(telephoneNumber);
		String[] middleNumbers = telephoneNumberTokenizer.getOtherNumbers();
		String areaCode = telephoneNumberTokenizer.getAreaCode();
		assertEquals("555",middleNumbers[0]);
		assertEquals("5555", middleNumbers[1]);		
		
	}
	
	@Test
	void getNumbersTest() {
		
		
		telephoneNumberTokenizer.setTelephoneNumber("(070) 900-1234");
		//String[] areaCode = telephoneNumberTokenizer.getAreaCode();
		String areaCode = telephoneNumberTokenizer.getAreaCode();
		
		assertEquals("070", areaCode);
		String[] middleNumbers = telephoneNumberTokenizer.getOtherNumbers();
		assertEquals("900",middleNumbers[0]);
		assertEquals("1234", middleNumbers[1]);
		StringBuilder rawTelephoneNumbers = new StringBuilder(areaCode);
		
		rawTelephoneNumbers.append(middleNumbers[0]);
		rawTelephoneNumbers.append(middleNumbers[1]);
		
		assertEquals("0709001234", rawTelephoneNumbers.toString());
		
		
	}

}
