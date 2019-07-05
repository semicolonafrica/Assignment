package chapter6.exercise6_31;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumberModification {
	public static int generateNumber() {
		SecureRandom randomInteger = new SecureRandom();
		int range = 1 + randomInteger.nextInt(1000);
		return range;
		
	}
	public static void guessNumber() {
					
		int value = generateNumber();
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter numbers between 1 - 1000");
		
		int guess;
		int trial = 1;
		int count =0;
		
		while(trial != 0) {
			
		do {
			guess = input.nextInt();
			
			if (guess > value) {
				System.out.println("Too high! Try again");
			}
			if (guess < value) {
				System.out.println("Too low! Try agian");
			}
				count++;
		    }   while(guess != value);
			
			System.out.println("Congratulation you guess right");
		
			
			if (count < 10) {
				System.out.println("Either you know the secret or you are lucky");		
			}
	
			else if (count == 10 ) {
				System.out.println("Aha you know the secret");	
			}
			
			else if (count > 10) {
				System.out.println("You should be able to do better!");
				
				
			}
			System.out.println("enter 1 to play again or 0 to end the");
			trial = input.nextInt();
		}
		 
	}
}
