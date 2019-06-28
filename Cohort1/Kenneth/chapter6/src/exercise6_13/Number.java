/**
 * 
 */
package exercise6_13;

import java.security.SecureRandom;

/**
 * @author ken_granero
 *
 */
public class Number {
	
	static SecureRandom number = new SecureRandom();
	
	public static int printNumber1() {
			
		int face = 2 + 2 * number.nextInt(5);
		
		return face;
	}
	public static int printNumber2() {
		int face2 = 3 + 2 * number.nextInt(5);
		
		return face2;
	
	}
	public static int printNumber3() {
		int face3 = 6 + 4 * number.nextInt(5);
		
		return face3;
	}
		

}
