package exercise14_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneNumberTokenizerTest {
	PhoneNumberTokenizer phoneNumberTokenizer;
	String phoneNumber ="(555) 555-5555";
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		phoneNumberTokenizer = new PhoneNumberTokenizer();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void getOtherNumbertest() {
		
		phoneNumberTokenizer.setPhoneNumber(phoneNumber);
		String[] middleNumbers = phoneNumberTokenizer.getOtherNumbers();
		assertEquals("555",middleNumbers[0]);
		assertEquals("5555",middleNumbers[1]);
		
	}
	
	@Test
	void getNumbertest() {
		phoneNumberTokenizer.setPhoneNumber(phoneNumber);
		
	}

}
