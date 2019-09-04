/**
 * 
 */
package chapter9Example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.regex.*;

/**
 * @author user
 *
 */
class StringTest {

	@Test
	void test() {
		Pattern myPattern = Pattern.compile("[A-Za-z]*");
		Matcher myMatcher = myPattern.matcher("John");
		boolean isMatched = myMatcher.matches();
		assertTrue(isMatched);
	}

}
