package exercise14_13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordPrintingTest {

	
	WordPrinting newWord;
	
	@BeforeEach
	void setUp() throws Exception {
		
		newWord = new WordPrinting("Bola is a beautiful and very big and chubby boy");
	}

	@Test
	void classUnderTestIniitialized() {
	
		assertNotNull(newWord);
		
	}
	
	@Test
	void validSentenceTest() {
		
		assertEquals("Bola is a beautiful and very big and chubby boy", newWord.getSentence());
	}
	
	@Test
	void tokenizeSentenceTest() {
		
		newWord.tokenizeSentence();
		
		assertEquals(newWord.getWords()[0], "Bola");
		assertEquals(newWord.getWords()[1], "is");
		assertEquals(newWord.getWords()[2], "a");
		assertEquals(newWord.getWords()[3], "beautiful");
		assertEquals(newWord.getWords()[4], "and");
		assertEquals(newWord.getWords()[5], "very");
		assertEquals(newWord.getWords()[6], "big");
		assertEquals(newWord.getWords()[7], "and");
		assertEquals(newWord.getWords()[8], "chubby");
		assertEquals(newWord.getWords()[9], "boy");
		
	}
	
	@Test 
	void printOnlySentencesStartingWithBTest() {
		
		newWord.tokenizeSentence();
		
		assertEquals("Bola", newWord.getWords()[0]);
		assertEquals("is", newWord.getWords()[1]);
		assertEquals("a", newWord.getWords()[2]);
		assertEquals("beautiful", newWord.getWords()[3]);
		assertEquals("and",newWord.getWords()[4] );
		assertEquals("very", newWord.getWords()[5]);
		assertEquals("big", newWord.getWords()[6]);
		assertEquals("and", newWord.getWords()[7]);
		assertEquals("chubby", newWord.getWords()[8]);
		assertEquals("boy", newWord.getWords()[9]);
		
		
		String[] words = newWord.returnWordsStartingWithCharacter('b');
		
		assertEquals("Bola", words[0]);
		assertEquals("beautiful", words[1]);
		assertEquals("big", words[2]);
		assertEquals("boy", words[3]);
		
		
	}

}
