package chapter6_exercises;
//Exercise 6.30
//Program to play the game guess the number
//Program written by Oyemade Temitope
//22nd of June 2019

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
	
	private enum Status{Too_High, Try_Again, Too_Low, Congratulations_You_Guessed_The_Number};
	
	static SecureRandom random = new SecureRandom();
	public static int determineNumber() {
		
		
		int number = 1 +random.nextInt(1000);
		
		return number;
	}
	
	public void playGuessNumber() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess a number between 1 - 1000");
		int guessedNumber = input.nextInt();
		Status myStatus;
		int continueGame = 1;
		int counter = 1;
		
		int number = determineNumber();
		
		while(continueGame != 0) {
			
			if(guessedNumber == number) {
				myStatus = Status.values()[3];
				System.out.printf("%s%n%s%n",myStatus , "Press 1 to continue or 0 to End game");
				continueGame = input.nextInt(2);
				System.out.println("Enter Number");
				number = determineNumber();
			}
			
			else {
				
				myStatus = Status.values()[(random.nextInt(3))];
				System.out.println(myStatus);
				 guessedNumber = input.nextInt();
				 if(counter == 12) {
					 System.out.print("Game Over \nThank you");
				 break;}
			}
			
			counter++;
		}
		
		
		input.close();
		
	}
	
	

}
