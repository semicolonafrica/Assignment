/**

 * Exercise 6.12
 * group 1 ( me and Ayo)
 */
package chapter6.Exercises;

import java.security.SecureRandom;

/**
 * @author user
 *
 */
public class RandomIntegers {

	/**
	 * @param args
	 */
	public int random1() {
		
		SecureRandom random1 = new SecureRandom();
		int n = 1 + random1.nextInt(2);
		return n;
	}

	
	
public int random2() {
		
		SecureRandom random2 = new SecureRandom();
		int n = 1 + random2.nextInt(100);
		return n;
	}

public int random3() {
	
	SecureRandom random3 = new SecureRandom();
	int n =   random3.nextInt(10);
	return n;
}

public int random4() {
	
	SecureRandom random4 = new SecureRandom();
	int n = 1000 + random4.nextInt(1112);
	return n;
}


public int random5() {
	
	SecureRandom random5 = new SecureRandom();
	int n = -1 + random5.nextInt(1);
	return n;
}


public int random6() {
	
	SecureRandom random6 = new SecureRandom();
	int n = -3 + random6.nextInt(11);
	return n;
}
}// end of class
