/**
 * 
 */
package chapter6.exercise6_31;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class NumberGuessModified {
	
	static SecureRandom randomNumber = new SecureRandom();
	private enum GuessNo {Win, High, Low, Cont};
	
	public static void displayGuessedNumber() {
		int random;
		Scanner input = new Scanner(System.in);
		random = 1 + randomNumber.nextInt(1000); 
		
		System.out.println("Guess a number between 1 and 1000");
		
		int num = 0;
		int count = 1;
		
		//num = input.nextInt(); 
		
		while(num != random) {
			
			GuessNo guess = GuessNo.Cont;
			
			num = input.nextInt(); 
			
			if(num > random) {
				guess = GuessNo.High;
				
				System.out.println("Too high. Try again");
				
			}
			else if(num < random) {
				guess = GuessNo.Low;
				
				System.out.println("Too Low. Try again");
			}
			 if(num == random) {
				guess = GuessNo.Win;
				
				 System.out.println("Congratulation, You guessed the number ");
			 }
			
			 count++;
			 
		}
		if(count <= 10) {
			System.out.println("Either you know the secret or you got\r\n" + 
					"lucky!");
		}
		else if(count == 10) {
			System.out.println("Aha! You know the secret!");
		}
		else if(count > 10) {
			System.out.println("You should be able to do better! Why should it take more\r\n" + 
					"than 10 guesses?");
		}
		
	}

}
