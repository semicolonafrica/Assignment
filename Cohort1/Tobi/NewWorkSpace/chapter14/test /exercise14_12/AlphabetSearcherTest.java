package exercise14_12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlphabetSearcherTest {

	AlphabetSearcher myLetters;
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		myLetters = new AlphabetSearcher();
		
		myLetters.setSentence("aA Bbb CcCc DdddD EeeEee YyyYyy");
		 
	}

	@Test
	void aplhatBetSearcherInitializedTest() {
		
		assertNotNull(myLetters);
		
	}
	
	@Test 
	void validateStringInputTest() {
		
		myLetters.setSentence("This is  a little boy");
		
		
	}
	

	@Test
	void countUpperCaseLettersTest() {
		
		myLetters.setSentence("iI aAm awWeEsSoOmMeE Ii AaMm AaWwEeSsOoMmEe");
	
		
		assertEquals(3, myLetters.countUpperCaseLetter('a'));
		
		assertEquals(2, myLetters.countUpperCaseLetter('i'));
		
		assertEquals(3, myLetters.countUpperCaseLetter('m'));
		
		assertEquals(4, myLetters.countUpperCaseLetter('e'));
		
		
	}
	
	@Test
	void countLowerCaseLettersTest() {
		
		myLetters.setSentence("iI aAm awWeEsSoOmMeE Ii AaMm AaWwEeSsOoMmEe");
	
		
		assertEquals(4, myLetters.countLowerCaseLetter('a'));
		
		assertEquals(2, myLetters.countLowerCaseLetter('i'));
		
		assertEquals(4, myLetters.countLowerCaseLetter('m'));
		
		assertEquals(4, myLetters.countLowerCaseLetter('e'));
	
		
		
	}
	
	@Test
	void countAlphabetOccurrenceTest() {
		
		myLetters.setSentence("iI aAm awWeEsSoOmMeE Ii AaMm AaWwEeSsOoMmEe");
		
		assertEquals(4, myLetters.countLetterOccurence('i'));
		
		assertEquals(7, myLetters.countLetterOccurence('a'));
		
		assertEquals(7, myLetters.countLetterOccurence('m'));
		
		assertEquals(8, myLetters.countLetterOccurence('e'));
		
		assertEquals(4, myLetters.countLetterOccurence('s'));
		
		assertEquals(4, myLetters.countLetterOccurence('o'));
		
		assertEquals(4, myLetters.countLetterOccurence('w'));
		
		
		
	}
	
	@Test
	void letterArrayCountTest() {
		
		myLetters.setSentence("aaaAAA BBBbbb");
		
		myLetters.storeLetterOccurrence();
		
		assertEquals(6, myLetters.getLetterOccurrence()[myLetters.getCharIndex(myLetters.getSentence().charAt(0))]);

		myLetters.print();
	}

}
