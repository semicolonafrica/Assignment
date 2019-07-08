/**
 * 
 */
package exercise5_12;

/**
 * @author ken_granero
 *
 */

public class Odd {
	
	public int calculateOdd() {
		
		int total = 0;
		
		for(int counter = 1; counter <= 15; counter+=2) {
			System.out.println(counter);
			total = total + counter;
			
		}
		System.out.println();
		return total;
		
	}

}
