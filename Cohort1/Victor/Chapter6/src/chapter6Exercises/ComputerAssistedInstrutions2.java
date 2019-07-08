package chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;

	public class ComputerAssistedInstrutions2 {
	
		static Scanner input = new Scanner(System.in);
		static SecureRandom randomNumber = new SecureRandom();
		static int number1;
		static int number2;
		static int correctAnswer;
		static int wrongAnswer;
		
	// method that generates question and prompts the user to enter answer	
		public static void generateQuestion2() {
			int userAnswer = 0;
			int question;
		
			question = multiply();//first pick of number
				
			while (userAnswer != question) {
				System.out.println("How much is "+ number1 + " times " + number2);
				userAnswer = input.nextInt();
				if (userAnswer !=question) {
					displayWrongRemarks();
				}
				else 
					displayCorrectRemarks();
				System.out.println();
			}
			generateQuestion2();
			input.close();
			}
	// method that picks the random number does the multiplication
	public static int multiply() {
		
		number1 = 1 + randomNumber.nextInt(10);
		number2 = 1 + randomNumber.nextInt(10);
		
		int multiple = number1*number2; // multiply the two random numbers
		return multiple;
	}
	public static void displayCorrectRemarks() {
		
		correctAnswer = 1 + randomNumber.nextInt(4);
		
		switch (correctAnswer) {
		
		case 1:
			System.out.println( "Very good!");
			break;
		case 2:
			System.out.println( "Excellent");
			break;
		case 3:
			System.out.println("Nice work");
			break;
		case 4:
			System.out.println("Keep up the good work!");
			break;
		}
	}
	public static void displayWrongRemarks() {
		
		wrongAnswer = 1 + randomNumber.nextInt(4);
		
		switch (wrongAnswer) {
		
		case 1:
			System.out.println( "No. Please try again.");
			break;
		case 2:
			System.out.println( "Wrong. Try once more.");
			break;
		case 3:
			System.out.println("Don’t give up");
			break;
		case 4:
			System.out.println("No. Keep trying.");
			break;
		}
	}
}
