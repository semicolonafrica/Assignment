package exercise14_7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PigLatinLanguageTest {

	PigLatin latinTranslator;
	
	@BeforeEach
	void setUp() throws Exception {
		latinTranslator = new PigLatin();
	}

	@Test
	void pigLatinInitializedTest() {
		
		assertNotNull(latinTranslator);
	}
	
	@Test
	void tokenizeStringTest() {
		
		String[] token = {"Computer", "races", "human"};
		
		latinTranslator.tokenizeWords("Computer races human");
		
		assertNotNull(latinTranslator.getTokens());
		
		for(int i = 0; i < latinTranslator.getTokens().length; i++) {
			
			assertEquals(token[i], latinTranslator.getTokens()[i]);
		}
	}
	
	@Test
	void validateSentenceTest() {
		
		assertThrows(IllegalArgumentException.class, 
				()-> latinTranslator.tokenizeWords("computer these!! theses"));
	}
	
	@Test
	void convertWordToLatinTest() {
		
		latinTranslator.tokenizeWords("Computer races human");
		
		String pigLatin = PigLatin.printLatinWord(latinTranslator.getTokens()[0]);
		
		assertEquals("omputerCay", pigLatin);
		
	}
	
	@Test
	void translateWordsToPigLatinTest() {
		
		latinTranslator.tokenizeWords("Computer races human");
		
		
		String pigLatin = PigLatin.printLatinWord(latinTranslator.getTokens()[0]);
		
		assertEquals("omputerCay", pigLatin);
		
		pigLatin = PigLatin.printLatinWord(latinTranslator.getTokens()[1]);
		
		assertEquals("acesray", pigLatin);	
		
		pigLatin = PigLatin.printLatinWord(latinTranslator.getTokens()[2]);
		
		assertEquals("umanhay", pigLatin);
		
	}
	
	@Test
	void translateUserInputTest() {
		
		Scanner input = new Scanner(System.in);
		
		
		try {
			
		System.out.println("Please enter a sentence seperated by spaces");
		String sentence = input.nextLine();
		
		latinTranslator.tokenizeWords(sentence);
		
		for(int i = 0; i < latinTranslator.getTokens().length; i++) {
			
			PigLatin.printLatinWord(latinTranslator.getTokens()[i]);
			
		}
		
		}
		catch(IllegalArgumentException | InputMismatchException e) {
			
			System.out.println("Invalid input!");
		}
	}
	
	

}
