package chapter6_exercises;
//Program to modify guess the number 
//Exercise 6.31
//Program written by Oyemade Temitope
//22nd of June 2019

import java.security.SecureRandom;
import java.util.Scanner;
public class ModifyGuessNumber {
	
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
				
				if(counter<= 10)
					System.out.println("Aha! You know the Secret");
				
				System.out.printf("%s%n%s%n",myStatus , "Press 1 to continue or 0 to End game");
				continueGame = input.nextInt(2);
				
				if(continueGame == 0)
					break;
				
				System.out.println("Enter Number");
				number = determineNumber();
			}
			
			else {
				
				myStatus = Status.values()[(random.nextInt(3))];
				System.out.println(myStatus);
				 guessedNumber = input.nextInt();
				 
				 if(counter == 9) 
					 System.out.print("Either you know the secret or you got Lucky\n");
					if(counter == 13)
						System.out.println("You should be able to do better");
				 
				 
				 
				 
			}
			
			counter++;
		}
		
		
		input.close();
		
	}
	

}
