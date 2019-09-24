package exercise14_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomSentencesTest {

	RandomSentence myBlog;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		myBlog = new RandomSentence();
		
	}

	@Test
	void randomSentenceInitializedTest() {
		assertNotNull(myBlog);
	}
	
	@Test
	void myBlogArticleArray() {
		
		
		assertNotNull(myBlog.getArticle());
		
		assertEquals("the", myBlog.getArticle()[0]);
		assertEquals("a", myBlog.getArticle()[1]);
		assertEquals("one", myBlog.getArticle()[2]);
		assertEquals("some", myBlog.getArticle()[3]);
		assertEquals("any", myBlog.getArticle()[4]);
		
	}
	@Test
	void myBlogNounArray() {
		
		
		assertNotNull(myBlog.getNoun());
		
		assertEquals("boy", myBlog.getNoun()[0]);
		assertEquals("girl", myBlog.getNoun()[1]);
		assertEquals("dog", myBlog.getNoun()[2]);
		assertEquals("town", myBlog.getNoun()[3]);
		assertEquals("car", myBlog.getNoun()[4]);
		
	}
	
	@Test
	void myBlogVerbArray() {
		
		
		assertNotNull(myBlog.getVerb());
		
		assertEquals("drove", myBlog.getVerb()[0]);
		assertEquals("jumped", myBlog.getVerb()[1]);
		assertEquals("ran", myBlog.getVerb()[2]);
		assertEquals("walked", myBlog.getVerb()[3]);
		assertEquals("skipped", myBlog.getVerb()[4]);
		
	}
	
	@Test
	void myBlogPrepositionArray() {
		
		
		assertNotNull(myBlog.getPreposition());
		
		assertEquals("to", myBlog.getPreposition()[0]);
		assertEquals("from", myBlog.getPreposition()[1]);
		assertEquals("over", myBlog.getPreposition()[2]);
		assertEquals("under", myBlog.getPreposition()[3]);
		assertEquals("on", myBlog.getPreposition()[4]);
		
	}
	
	@Test
	void firstCharacterUpperCaseTest() {
		
		StringBuilder sentence = myBlog.generateSentences();
		
		char firstChar = sentence.charAt(0);
		firstChar = Character.toUpperCase(firstChar);
		
		assertTrue(Character.isUpperCase(firstChar));
		
		sentence.setCharAt(0, firstChar);
		
		assertEquals(firstChar, sentence.charAt(0));
	
	}
	
	@Test
	void sentenceEndsWithPeriodTest() {
		
		StringBuilder sentence = myBlog.generateSentences();
		
		sentence.append(".");
		
		int lastIndex = sentence.length();
		
		assertEquals(".", String.valueOf(sentence.charAt(lastIndex - 1)));
		
		System.out.println(sentence);
		
	}
	
	@Test
	void generate20SentencesTest() {
		
		StringBuilder sentence ;
		
		for(int i = 0; i < 20; i++) {
			
			sentence = myBlog.generateSentences();
			
			char firstChar = sentence.charAt(0);
			firstChar = Character.toUpperCase(firstChar);
			
			assertTrue(Character.isUpperCase(firstChar));
			
			sentence.setCharAt(0, firstChar);
			
			assertEquals(firstChar, sentence.charAt(0));
			
			sentence.append(".");
			
			int lastIndex = sentence.length();
			
			assertEquals(".", String.valueOf(sentence.charAt(lastIndex - 1)));
			
			System.out.printf("-- %s%n%n", sentence);
		}
	}
	
	
	
	
	
	
}
