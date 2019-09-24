/**
 * 
 */
package exercise14_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author tboydev
 *
 */
class TelephoneNumberTokenizerTest {

	TelephoneNumberTokenizer telephoneNumberTokenizer;
	String telephoneNumber = "(555) 555-5555";
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		telephoneNumberTokenizer = new TelephoneNumberTokenizer();
	}

	@Test
	void getAreaCodeTest() {
		
		telephoneNumberTokenizer.setTelephoneNumber(telephoneNumber);
		String areaCode = telephoneNumberTokenizer.getAreaCode();
		
		assertEquals("555", areaCode);
	}
	
	@Test
	void getOtherNumbersTest() {
		
		telephoneNumberTokenizer.setTelephoneNumber(telephoneNumber);
		String[] middleNumber = telephoneNumberTokenizer.getOtherNumbers();
		
		assertEquals("555", middleNumber[0]);
		assertEquals("5555", middleNumber[1]);
		
		
	}
	
	@Test
	void getNumbersTest() {
		
		telephoneNumberTokenizer.setTelephoneNumber("(070) 900-1234");
		String areaCode = telephoneNumberTokenizer.getAreaCode();
		
		assertEquals("070", areaCode);
		
		String[] middleNumber = telephoneNumberTokenizer.getOtherNumbers();
		
		assertEquals("900", middleNumber[0]);
		assertEquals("1234", middleNumber[1]);
		
		StringBuilder rawTelephoneNumber = new StringBuilder(areaCode);
		rawTelephoneNumber.append(middleNumber[0]);
		rawTelephoneNumber.append(middleNumber[1]);
		
		assertEquals("0709001234", rawTelephoneNumber.toString());
		
		
		
	}
	

}
