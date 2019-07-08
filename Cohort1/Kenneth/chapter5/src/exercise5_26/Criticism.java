/**
 * 
 */
package exercise5_26;

/**
 * @author ken_granero
 *
 */
public class Criticism {
	
	public void modifyTest() {

		int count; // control variable also used after loop terminates
		
		for (count = 1; count <= 10; count++) // loop 10 times
			
		{
			System.out.printf("%d ", count);
		if (count == 4) {
			count = 10; // terminates loop if count is 4
		}
		
		}
		System.out.printf("%nBroke out of loop at count = %d%n", 5);
		 
	}

}// end class BreakTest
