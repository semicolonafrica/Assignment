package chapter6Exercises;

import java.security.SecureRandom;

public class Numbers {
	
	public static void getEvenNumbers() {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		for(int counter = 1; counter <=5; counter ++) {
			int even =2 + 2 * randomNumbers.nextInt(counter);
				System.out.printf("%d, ", even);
		}
		System.out.println();
		
		for(int counter = 1; counter <=5; counter++) {
			int odd = 3 + 2 * randomNumbers.nextInt(counter); 
				System.out.printf("%d, ", odd);
		}
		System.out.println();
		for(int counter = 1; counter <=5; counter++) {
			int numbers = 6 + 4 * randomNumbers.nextInt(counter); 
				System.out.printf("%d, ", numbers);
		}
	}	
}
