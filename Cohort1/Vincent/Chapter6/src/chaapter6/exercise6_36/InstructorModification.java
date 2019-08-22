package chaapter6.exercise6_36;

import java.security.SecureRandom;
import java.util.Scanner;

public class InstructorModification {
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
			System.out.println("No, please try again");
		
			
			while(userAnswer != correct) {
			
//				System.out.println("No, please try again later");
			
			userAnswer = input.nextInt();
//				
					System.out.println("Wrong try, please try again later");
//		
					userAnswer = input.nextInt();
					System.out.println("dont give keep trying");
					if(userAnswer == correct) {
						System.out.println("excellent");
//				
				
			
			}
				
			}
			
		
		
	
	
	}
}
