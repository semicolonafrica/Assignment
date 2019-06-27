package exercise6_31;

import java.security.SecureRandom;

import java.util.Scanner;

public class GuessTheNumberModification {

	public static void getNumber(int number) {
		
	Scanner in = new Scanner(System.in);
		
	int counter = 1;
		while(counter <= 10) {	
			System.out.println("Guess the number:");
				 number = in.nextInt();
	 				counter++;
			
		SecureRandom randomNumbers = new SecureRandom();
		int value = 0;	
		 value = 1 + randomNumbers.nextInt(1000);
			System.out.println(value);
		
		if(number > value) {
			 System.out.println("Too high, try again.");
			 System.out.println("You should be able too better!");
			 }
		 else if(number < value) {
		 		 System.out.println("Too low, try again.");
		 		 System.out.println("You should be able too better!");
			 }
		 else if(number == value) {
			System.out.println("Congratulations, you guessed the number!");
			System.out.println("Aha! You know the secret!");
			}
		}			
	}
	
	public static void main(String[] args) {
		
	int value = 1;
		
		getNumber(value);
	}
}
