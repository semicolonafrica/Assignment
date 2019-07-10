package exercise6_30;

import java.security.SecureRandom;

import java.util.Scanner;

public class GuessTheNumber {
		
	public static void getNumber(int value) {
		
		SecureRandom randomNumbers = new SecureRandom();
			int	number = 1 + randomNumbers.nextInt(1000);
		
		Scanner in = new Scanner(System.in);				
			while(value != -1) {
		System.out.println("Guess a value:");
		value = in.nextInt();
		 if(number < value) {
			 System.out.println("Too high, try again.");
			 }
		 else {
			 if(number > value) {
		 		 System.out.println("Too low, try again.");
			 }
		 else {
			 if(number == value) {
				 System.out.println(number);
				 System.out.println("Congratulations, you guessed the number!");
				 number = 1 + randomNumbers.nextInt(1000);
			 }	
		 	}
		 }
		}
	}

public static void main(String[] args) {
		
		int value = 0;	
			
			 getNumber(value);
	}
	
}
