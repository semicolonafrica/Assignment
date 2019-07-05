package chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

	public class ComputerAssistedInstrutions {
	
		static Scanner input = new Scanner(System.in);
		static SecureRandom randomNumber = new SecureRandom();
		static int number1;
		static int number2;
		
	// method that generates question and prompts the user to enter answer
	public static void generateQuestion() {
		int userAnswer = 0;
		int question;
	
		question = multiply();//first pick of number
			
		while (userAnswer != question) {
			System.out.println("How much is "+ number1 + " times " + number2);
			userAnswer = input.nextInt();
			if (userAnswer !=question) {
				System.out.println("No. Please try again");
			}
			else 
				System.out.println("Very good!");
			System.out.println();
		}
		generateQuestion();
		input.close();
		}
	
	// method that picks the random number does the multiplication
	public static int multiply() {
		
		number1 = 1 + randomNumber.nextInt(10);
		number2 = 1 + randomNumber.nextInt(10);
		
		int multiple = number1*number2; // multiply the two random numbers
		return multiple;
	}
	

}
