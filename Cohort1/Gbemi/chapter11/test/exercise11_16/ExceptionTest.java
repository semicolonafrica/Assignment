package exercise11_16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExceptionTest {
	ExceptionA superException;
	ExceptionB subException;
	ExceptionC newException;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		superException = new ExceptionA();
		subException = new ExceptionB();
		newException = new ExceptionC();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void catchException() {
		try {
			System.out.println("testing my Exception");
			//throwing exception of ExceptionC
			throw subException;
		}
		catch(ExceptionA e) {
			//catching exception with the super class ExceptionA
			System.err.println(e);
	}
	}
}
