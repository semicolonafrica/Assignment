package exercise14_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterSearchTest {

	CharacterSearch mutate;
	
	@BeforeEach
	void setUp() throws Exception {
		
		mutate = new CharacterSearch(); 
	}

	@Test
	void assertSearchClassNotNull() {
	
		assertNotNull(mutate);
	}
	
	@Test
	void findCharacterFirstOccuerecneTest() {
		
		mutate.setSentence("A LITTLE TEST");
		
		assertEquals(4, mutate.findCharacterOccurence('T'));
		
		assertEquals(1, mutate.getCharacterTotalCount());
		
		
		
	
	}
	
	@Test
	void findCharacterSecondOccuerecneTest() {
		
		mutate.setSentence("A LITTLE TEST");
		
		assertEquals(5, mutate.findCharacterOccurence('T'));
		
		assertEquals(2, mutate.getCharacterTotalCount());
		
	
	}
	
	@Test
	void findAllCharacterOccurenceTest() {
		
		mutate.setSentence("A LITTLE TEST");
		
		
		mutate.findCharacterOccurence('T');
		
		
		assertEquals(4, mutate.getCharacterTotalCount());
	}
	
	@Test
	void findAnotherCharacterOccurenceTest() {
		
		mutate.setSentence("A LITTLE TEST");
		
		
		mutate.findCharacterOccurence('A');
		
		
		assertEquals(1, mutate.getCharacterTotalCount());
	}
	
	@Test
	void findCharacterIOccurenceTest() {
		
		mutate.setSentence("A LITTLE TEST");
		
		
		mutate.findCharacterOccurence('I');
		
		
		assertEquals(1, mutate.getCharacterTotalCount());
	}
	
	@Test
	void findCharacterEOccurrenceTest() {
		
		
		mutate.setSentence("A LITTLE TEST");
		
		
		mutate.findCharacterOccurence('E');
		
		
		assertEquals(2, mutate.getCharacterTotalCount());
	}
	
	@Test
	void findCharacterOccurrenceTest() {
		
		
		mutate.setSentence("i am awesome another day");
		
		
		mutate.findCharacterOccurence('a');
		
		
		assertEquals(4, mutate.getCharacterTotalCount());
	}
	
	@Test
	void capitalLetterOccurenccTest() {
		
		mutate.setSentence("i am Awesome Another day");
		
		assertEquals(2, mutate.findCapitalLetterOccurence('a'));
		
	}
	
	@Test
	void smallLetterOccurrenceTest(){
		
		mutate.setSentence("i ama Awesome Another day");
		
		assertEquals(3, mutate.findLowerLetterOccurence('a'));
	}
	
	@Test
	void letterNotInStringTest() {
	
		mutate.setSentence("i ama Awesome Another day");
		
		assertThrows(IllegalArgumentException.class, ()->mutate.findCharacterOccurence('z'));
		
	}
	
	
	
	
	

}
