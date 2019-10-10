package exercise14_7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PigLatinTest {
	PigLatin latinWord;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		latinWord = new PigLatin();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMySplitWord() {
		latinWord.setSen("my lovely bride");
		assertNotNull(latinWord);
		
		latinWord.splitWord(latinWord.getSen());
		
		assertEquals("my", latinWord.token[0]);
		assertEquals("lovely",latinWord.token[1]);
		assertEquals("bride",latinWord.token[2]);
		
	}
	@Test
	void testMyLatinWord() {
		latinWord.setSen("my lovely bride");
		latinWord.splitWord(latinWord.getSen());
		assertEquals("ymay",latinWord.formLatinWord(latinWord.token[0]) );
		//assertEquals("ovelylay",latinWord.formLatinWord(latinWord.token[1]) );
		
	}

}
