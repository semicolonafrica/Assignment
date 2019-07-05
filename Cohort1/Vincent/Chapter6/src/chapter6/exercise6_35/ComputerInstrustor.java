package chapter6.exercise6_35;

import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerInstrustor {
	
	
	
	public static void  multiply() { 
		 SecureRandom randomNumbers = new SecureRandom();
			
	 
		int random1 = 1 + randomNumbers.nextInt(10);
		int random2 = 1 + randomNumbers.nextInt(10);
		
		
	}
	
		public static void generateQuestion(int random1, int random2 ) {
		
		 Scanner input = new Scanner(System.in);
		int correct = 0;
		
		System.out.println("how much is six times 7");
		int userAnswer = input.nextInt();
		
		correct = random1 * random2;
		if(userAnswer == correct) {
			System.out.println("very good");
		}
		else
			
			while(userAnswer != correct) {
				System.out.println("No, please try again later");
				
				userAnswer = input.nextInt();
				if(userAnswer == correct) {
					System.out.println("very Good");
				
				}
				
			}
			
		
		
	
	
	}
	
	
}

