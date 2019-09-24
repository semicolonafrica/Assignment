package exercise14_9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringReversalTest {

	StringReversal reversal;
	
	@BeforeEach
	void setUp() throws Exception {
		
		reversal = new StringReversal();
	}

	@Test
	void TokenizeStringTest() {
		
		//set tokens
		reversal.tokenizeString("I am a little boy");
		String[] tokenArray = {"I", "am", "a","little","boy"};	
		
		for(int i = 0; i < reversal.getTokens().length; i ++) {
			
			assertEquals(tokenArray[i], reversal.getTokens()[i]);
		}
	}
	
	@Test
	void OutputTokensInReverseOrderTest() {
		
		reversal.tokenizeString("I am a little boy");
		
		System.out.println(reversal.reverseTokens());
		
		
		
		
	}

}
