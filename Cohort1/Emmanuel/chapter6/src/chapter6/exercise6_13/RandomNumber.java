/**
 * 
 */
package chapter6.exercise6_13;

import java.security.SecureRandom;

/**
 * @author Emmanuel Akinbode
 *
 */
public class RandomNumber {
	
	static SecureRandom random = new SecureRandom();
	
	public static int printEvenNum() {
		int num = 2 + 2 * random.nextInt(5);
		return num;
	}
	public static int printOddNum() {
		int num = 3 + 2 * random.nextInt(5);
		return num;
	}
	public static int printRangeFourNum() {
		int num = 6 + 4 * random.nextInt(5);
		return num;
	}

}
