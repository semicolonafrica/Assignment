/**
 * 
 */
package chapter6.exercise6_30;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class NumberGuess {
	
	static SecureRandom randomNumber = new SecureRandom();
	private enum GuessNo {Win, High, Low, Cont};
	
	public static void displayGuessedNumber() {
		int random;
		Scanner input = new Scanner(System.in);
		random = 1 + randomNumber.nextInt(1000); 
		
		System.out.println("Guess a number between 1 and 1000");
		
		int num = 0;
		
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
			
		}
		// System.out.println(num);
		
	}

}
