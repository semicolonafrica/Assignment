package chapter6.exercise630;

import java.security.SecureRandom;
import java.util.Scanner;
public class GuessNumber {
	
	public static int generateNumber() {
	SecureRandom randomInt = new SecureRandom();
	
	int range = 1 + randomInt.nextInt(10);
	
	return range;
	
	}
	
	
	public static void guessNumber() {
		Scanner input = new Scanner(System.in);
		int value = generateNumber();
		int trial = 1;
		
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
			
		
		} while (guess != value);
		System.out.println("Congratulations. You guessed the number!");
		
		System.out.println("Enter 1 to play again: ");
		trial = input.nextInt();
		
		}  
		
	}
	
}
