package exercise6_13;

import java.security.SecureRandom;
public class RandomBNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom rand = new SecureRandom();
		
		int eng =  2 + 2 *rand.nextInt(5);
		System.out.println("The random digit generated is: "+eng);
		
		int toy = 3 + 2 * rand.nextInt(5);
		System.out.println("The random digit generated is: "+toy);
		
		int gab = 6 + 4 * rand.nextInt(5);
		System.out.println("The random digit generated is: "+gab);
	}

}
