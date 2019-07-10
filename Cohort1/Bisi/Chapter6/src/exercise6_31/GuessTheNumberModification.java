package exercise6_31;

import java.security.SecureRandom;

import java.util.Scanner;

public class GuessTheNumberModification {

	public static void getNumber(int number) {
		
	Scanner in = new Scanner(System.in);
	SecureRandom randomNumbers = new SecureRandom();
		int value = 1 + randomNumbers.nextInt(1000);
	
			int counter = 1;
		while(counter <= 10) {	
			System.out.println("Guess the number:");
				 number = in.nextInt();
	 				counter++;				
		
		if(number > value) {
			 System.out.println("Too high, try again.");
			 System.out.println("You should be able too better!");
			 }
		 else if(number < value) {
		 		 System.out.println("Too low, try again.");
		 		 System.out.println("You should be able too better!");
			 }
		 else if(number == value) {
			 System.out.println(value);
			System.out.println("Congratulations, you guessed the number!");
			System.out.println("Aha! You know the secret!");
			 value = 1 + randomNumbers.nextInt(1000);
			}
		}			
	}
	
public static void main(String[] args) {
		
	int number = 0;
		
		getNumber(number);
	}
}
