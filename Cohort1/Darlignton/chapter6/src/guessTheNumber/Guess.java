package guessTheNumber;

import java.security.SecureRandom;
import java.util.Scanner;

public class Guess {
public static void guessTheNumber() {
	Scanner input = new Scanner(System.in);
	SecureRandom randomNumber = new SecureRandom();
	
	
	
	int hiddenNumber = 1 + randomNumber.nextInt(10);
	
	System.out.print("Enter your firstGues: ");
	int firstGuess = input.nextInt();
	
	if(firstGuess == hiddenNumber) {
		System.out.println("Congratulations");
	}
	
	for( ; firstGuess!= hiddenNumber;) {
		if(firstGuess != hiddenNumber && firstGuess > hiddenNumber) {
			System.out.print("Incorrect, too high try again: ");
			firstGuess = input.nextInt();
		}
		else if(firstGuess != hiddenNumber && firstGuess < hiddenNumber) {
				System.out.print("Incorrect, too low try again: ");
				firstGuess = input.nextInt();
			}
	}
	System.out.println("Congratulations");
	
	
	
	
	}
	
	public static void main(String args[]) {
		Guess.guessTheNumber();
	}
}

