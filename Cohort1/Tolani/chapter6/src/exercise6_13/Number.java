package exercise6_13;

import java.security.SecureRandom;

public class Number {
	static SecureRandom random = new SecureRandom();
	
	public static int increasingByTwo() {
		int n = 2 + 2 * random.nextInt(5);
		return n;
	}
	public static int increasingByThree() {
		int n = 3 + 2 * random.nextInt(5);
		return n;
	}
	
	public static int increasingBySix() {
		int n = 6 + 4 * random.nextInt(5);
		return n;
	}
	
}
