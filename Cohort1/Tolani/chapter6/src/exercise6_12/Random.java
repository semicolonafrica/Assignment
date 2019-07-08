/**
 * 
 */
package exercise6_12;

import java.security.SecureRandom;

/**
 * @author user
 *
 */
public class Random {
	SecureRandom numbers = new SecureRandom();
	
	public int randomNumbersBetweenOneAndTwo() {
		int n = 1 + numbers.nextInt(2);
		return n;
	}
	
	public int randomNumbersBetweenOneAnd100() {
		int n = 1 + numbers.nextInt(100);
		return n;
	}
	
	public int randomNumbersBetween0And9() {
		int n = numbers.nextInt(9);
		return n;
	}
	
	public int randomNumbersBetween1000And1112() {
		int n = 1000 + numbers.nextInt(112);
		return n;
	}
	
	public int randomNumbersBetweenMinus1And1() {
		int n = -1 + numbers.nextInt(1);
		return n;
	}
	
	public int randomNumbersBetweenMinus3And11() {
		int n = -3 + numbers.nextInt(11);
		return n;
	}
}
