package exercise14_17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LetterTest {
Letter myLetter;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		myLetter = new Letter();
	}

	@AfterEach
	void tearDown() throws Exception {
		String[] gbemi;
		
	}

	@Test
	void testmyFiveLetter() {
		assertNotNull(myLetter);
		myLetter.setFiveLetters("bathe");
		myLetter.GenerateThreeletter();
		//System.out.println(myletter.)
		
//		String[] token = myLetter.GenerateThreeletter();
//		
//		for(int i=0; i<token.length; i++)
//		assertEquals(token[i],myLetter.GenerateThreeletter()[i]);
		for(int z=0;z<myLetter.myThreeletters.length;z++) {
			if(myLetter.myThreeletters[z]== myLetter.threeLetters) {
				System.out.print(myLetter.threeLetters+"this is test");
			}
		}
		
	}

}
