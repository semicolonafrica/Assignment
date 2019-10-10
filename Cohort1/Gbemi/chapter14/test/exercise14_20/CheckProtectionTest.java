package exercise14_20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckProtectionTest {
CheckProtection myProtection;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		myProtection = new CheckProtection();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testProtection() {
		assertNotNull(myProtection);
		myProtection.setStar("*********");
		myProtection.setValue("1 0 0 0 0 0");
		myProtection.printProtection();
		
	}

}
