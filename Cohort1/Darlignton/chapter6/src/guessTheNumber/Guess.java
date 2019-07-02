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
	int guessCounter = 1;
	while(firstGuess!= hiddenNumber){
		if(firstGuess != hiddenNumber && firstGuess > hiddenNumber) {
			System.out.print("Incorrect, too high try again: ");
			firstGuess = input.nextInt();
		}
		else if(firstGuess != hiddenNumber && firstGuess < hiddenNumber) {
				System.out.print("Incorrect, too low try again: ");
				firstGuess = input.nextInt();
			}
		guessCounter++;
	}
	
	System.out.println(guessCounter);
	
	System.out.println("Congratulations");
	if(guessCounter <= 9) {
		System.out.println("Either you know the secret or you got lucky.");
	}
	else if (guessCounter == 10) {
		System.out.println("Aha! you know the secret.");
	}
	else {
		System.out.println("You should be able to do better! Why should it\n" + 
				"take no more than 10 guesses?");
	}
	
	}



	
	public static void main(String args[]) {
		Guess.guessTheNumber();
	}
}

