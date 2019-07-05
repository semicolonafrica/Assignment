package chapter6.exercise6_30;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
	
	public static int generateNumber() {
		SecureRandom randomInteger = new SecureRandom();
		int range = 1 + randomInteger.nextInt(10);
		return range;
		
	}
					
	public static void guessNumber() {
		int value = generateNumber();
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter numbers between 1 - 1000");
		
		int guess;
		int trial = 1;
		
		while(trial != 0) {
			
		do {
			guess = input.nextInt();
			
			if (guess > value) {
				System.out.println("Too high! Try again");
			}
			if (guess < value) {
				System.out.println("Too low! Try agian");
			}
				
		    }   while(guess != value);
			
			System.out.println("Congratulation you guess right");
			
			System.out.println("enter 1 to play again or 0 to end the");
			trial = input.nextInt();
	}
		 
	}
}




