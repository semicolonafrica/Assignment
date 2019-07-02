/**
 * 
 */
package chapter5.examples;

/**
*Fig. 5.14: ContinueTest.java
*continue statement terminate an iteration of a for statement
*
*/
public class ContinueTest {
	
	public static void main(String[] args) {
		int count; // control variable also used after loop terminates
		
		for(count = 1; count<= 10; count++) {
			if(count == 5)
				continue;//skip remaining code in loop body if count is 5
			System.out.printf("%d ", count);
		}
		System.out.printf("%n Broke out of loop at count = %d%n ", count);
	}

}
