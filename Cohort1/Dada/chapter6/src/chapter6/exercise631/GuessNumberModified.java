package chapter6.exercise631;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberModified {

	
	public static int generateNumber() {
	SecureRandom randomInt = new SecureRandom();
	
	int range = 1 + randomInt.nextInt(10);
	
	return range;
	
	}
	
	
	public static void guessNumber() {
		Scanner input = new Scanner(System.in);
		int value = generateNumber();
		int trial = 1;
		int counter = 0;
		
		while(trial != 0) {
		
		System.out.println("Guess a number between 1 and 1000");
		
		int guess;
		do {
			System.out.println("Enter guess number: ");
			guess = input.nextInt();
			
			if (guess > value) {
				System.out.println("Too high. Try again");
			}
			if (guess < value) {
				System.out.println("Too low. Try again");
			}
			counter++;
		} while (guess != value);
		
		System.out.println("Congratulations. You guessed the number!");
		
		if(guess < 10) {
			System.out.println("Either you know the secret or you got lucky!");
		}
		else if (guess == 10) {
			System.out.println("Aha! You know the secret!");
		}
		else if (guess > 10) {
			System.out.println("You should be able to do better!");
		
//		System.out.println("Congratulations. You guessed the number!");
		
		}
		System.out.println("Enter 1 to play again: ");
		trial = input.nextInt();
		
		}  
		
	}
	
}

