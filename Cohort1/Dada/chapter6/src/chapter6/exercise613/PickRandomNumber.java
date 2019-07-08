package chapter6.exercise613;

import java.security.SecureRandom;
public class PickRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom rand = new SecureRandom();
		
		int randomNumber = 2+2 * rand.nextInt(5);
		
//		System.out.println(randomNumber);
		
		int randomNumber2 = 3 +2 * rand.nextInt(5);
		
//		System.out.println(randomNumber2);
		
		int randomNumber3 = 6 +4 * rand.nextInt(6);
		
		System.out.println(randomNumber3);
		
		

	}

}
