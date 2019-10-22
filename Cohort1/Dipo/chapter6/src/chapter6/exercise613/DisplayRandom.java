package chapter6.exercise613;

import java.security.SecureRandom;

public class DisplayRandom {

	//public static void main(String[] args) {
	

	//}
	
	public static void getEvenNumber() {
		
		//SecureRandom randomNumbers = new SecureRandom();
		
		 //int x = randomNumbers.nextInt();
		
		for(int counter = 1; counter <= 5; counter++) {
		
		System.out.printf("%d ", (int)(1 + Math.random() * 5) * 2);
		
		}
		System.out.println();
		
		for(int count = 1; count <= 5; count++) {
		
		System.out.printf("%d ", (int)(1 + Math.random() * 5) * 2 + 1);
			
		
		}
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			
		System.out.printf("%d ", (int)( Math.random() * 5) * 4 + 6);
		}
	}
	public static void main(String[] args) {
		
		DisplayRandom.getEvenNumber();
	}
}
