/**
 * 
 */
package exercise6_26;

/**
 * @author ken_granero
 *
 */
public class ReverseNumber {
	
	public static int reverseDigits(int number) {
		
		int rev = 0;
		
		while(number != 0) {
			
			rev = rev * 10;
			
			rev = rev + number % 10;
			
			number /= 10;
		}
		return rev;
	}

}
