package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;
public class GuessTheNumber {
	
	private enum GuessNo { win, high, low, cont };

	public static void guess() {
		
		//SecureRandom randomNumbers = new SecureRandom();
		Scanner input = new Scanner(System.in);
	
	
	int number = 1;
	System.out.print("Guess number between 1 to 1000: \n");
	int count = 0;
	int read;
	int sentinel = 1;
	while(sentinel == 1) {
		GuessNo guessMe = GuessNo.cont;
		read = getRightNumber();
	
	while(guessMe != GuessNo.win) {
				
		number = input.nextInt();
		if(number < read) {
			guessMe = GuessNo.low;
			count++;
			System.out.print("Too low,try again!\n");
			
		} else if(number > read) {
			guessMe = GuessNo.high;
			count++;
			System.out.print("Too high,try again!\n");
			
		} else if(number == read) {
			guessMe = GuessNo.win;
			count++;
			//System.out.print("Congratulations, You guessed the number!");			
		}
		

	}
	if(count < 10) {
		System.out.print("Either you know the secret\n" + 
				"or you got lucky!");
	}else if(count == 10) {
		System.out.print("Aha! You know the secret!");
	} else {
		System.out.print("You should be able to do better!");
	}

	System.out.print("\nEnter 1 to continue or -1 to end");
	sentinel = input.nextInt();


	}
	input.close();
	//return guessMe;

		
	}
	
	public static int getRightNumber() {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		int read = randomNumbers.nextInt(1000);
		
		return read;
		
	}
	
}
