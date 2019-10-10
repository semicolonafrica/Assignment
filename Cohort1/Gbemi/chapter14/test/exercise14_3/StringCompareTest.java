/**
 * 
 */
package exercise14_3;
import exercise14_4.StringRegionMatch;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author User
 *
 */
class StringCompareTest {
	StringCompare myString;
	StringRegionMatch newString;

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
		
		myString = new StringCompare();
		newString = new StringRegionMatch();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testString() throws Exception{
	
		
		StringCompare  newStr = new StringCompare();
		newStr.compare();
		System.out.println(newStr.str1);
		System.out.println(newStr.str2);
	}
	@Test
	void testRegionMatch() throws Exception{
		
		newString.compareRegion();
	}
	

}
