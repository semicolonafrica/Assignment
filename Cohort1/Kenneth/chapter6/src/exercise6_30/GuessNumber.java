/**
 * 
 */
package exercise6_30;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class GuessNumber {
	
	static SecureRandom randomNumber = new SecureRandom();
	
	static int guessNumber = 1 + randomNumber.nextInt(1000);
	
	public static void getNumber() {
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter number or -1 to quit: ");
		int number = insert.nextInt();
		
		int counter = 1;
		while(number != -1) {
			
			 checkNumber(number, counter);
			
			System.out.print("Enter number or -1 to quit: ");
			number = insert.nextInt();
			
			counter++;
			
		}
		
		
	}
	
	
	
	public static void checkNumber(int number, int counter) {
		//getNumber();
		
		if(number == guessNumber ) {
			
			if(counter < 10) {
			System.out.println("Either you know the secret\n" + 
					"or you got lucky");
			}
			
			if(counter == 10) {
				System.out.println("Aha! You know the secret");
			}
			
			if(counter > 10) {
				System.out.println("You should be able to do better!");
			}
			System.out.println("Congratulations!" + "\n");
		}
		
		else if(number < guessNumber ) {	
			System.out.println("Too Low...Please Try Again" + "\n");
		}
		
		else if(number > guessNumber){
			//System.out.println("Aha! You know the secret");
			System.out.println("Too high...Please Try Again" + "\n");
		}
	}

}
