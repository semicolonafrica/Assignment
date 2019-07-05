package chapter6.exercise6_13;

import java.security.SecureRandom;

public class RandomNumbers {
	
	public static void findEvenNumbers() {
		int even = 1;
		int odd = 1;
		int anotherEven = 1;

		
		SecureRandom randomNumbers = new  SecureRandom();
		
		for(int counter = 1; counter <= 5; counter++) {
			
		even = 2 + 2 * randomNumbers.nextInt(counter);
		System.out.printf( "%d%n", even);
		}
		
		System.out.println();
		
		for(int count = 1; count <=5; count++) {
		
		odd = 3 + 2 * randomNumbers.nextInt(count);
		System.out.printf("%d%n", odd);
		
		
		}
		
		System.out.println();
		for(int i = 1; i <= 5; i++) {
			
		anotherEven= 6+ 4* randomNumbers.nextInt(i);
		System.out.printf("%d%n", anotherEven); 
		
		}
}
	

}