package exercise14_9;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercise14_10.StringCase;

class ReverseWordTest {
	ReverseWord word;
	StringCase myCase;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		word = new ReverseWord();
		myCase = new StringCase();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReverseWord() {
		
		assertNotNull(word);
		word.setMyWord("nimat is a wonderful lady");
		assertEquals(word.getMyWord(),"nimat is a wonderful lady");
		word.tokenMyWord();
		
	}
	@Test
	void testStringCase() {
		myCase.setFirstInput("love");
		myCase.upperCase();
		myCase.lowerCase();
		assertNotNull(myCase);
		
		
	}

}
