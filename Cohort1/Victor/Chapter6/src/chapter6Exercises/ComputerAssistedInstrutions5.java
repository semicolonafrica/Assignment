package chapter6Exercises;

import java.security.SecureRandom;
import java.util.Scanner;
	
	public class ComputerAssistedInstrutions5 {	
		
		static Scanner input = new Scanner(System.in);
		static SecureRandom randomNumber = new SecureRandom();
		static int number1;
		static int number2;
		static int correctAnswer;
		static int wrongAnswer;	
		static int level;	
		static int problem;	
		
//		(Computer-Assisted Instruction: Varying the Types of Problems) Modify the program of
//		Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
//		addition problems only, 2 means subtraction problems only, 3 means multiplication problems only,
//		4 means division problems only and 5 means a random mixture of all these types.
		
	// method that generates question and prompts the user to enter answer
	public static void chooseArithmeticProblem(){
		int userAnswer;
		int question = 0;
		double scoreCounter = 0;
		byte numberOfQuestions =10; 
		
		System.out.println("ENTER DIFFICULTY LEVEL\n"
				+ "1 for Level1\n2 for Level2");
		level = input.nextInt();
		
		System.out.println("ENTER ARITHMETIC PROBLEM\n"
				+ "1 Addition\n2 Subtraction\n3 Multiplication\n4 Division\n5 Random");
		problem = input.nextInt();
		
		for( int counter =1; counter <=numberOfQuestions; counter ++) {
			
			if (level ==1) {
				
				switch(problem) {
				case 1:
					question = addition1();
					break;
				case 2:
					question = subtraction1();
					break;
				case 3:
					question = multiplication1();
					break;
				case 4:
					question = division1();
					break;
				}
			}
			if (level ==2) {
				switch(problem) {
				case 1:
					question = addition2();
					break;
				case 2:
					question = subtraction2();
					break;
				case 3:
					question = multiplication2();
					break;
				case 4:
					question = division2();
					break;
				}
			}
//			System.out.println("How much is "+ number1 + " times " + number2);
			userAnswer = input.nextInt();
			
			if (userAnswer ==question) {
				displayCorrectRemarks();
				scoreCounter ++;
			}
			else 
				displayWrongRemarks();
			System.out.println();	
		}
		
		double percentage = (scoreCounter/numberOfQuestions)*100;
		int percent= (int) percentage;
			
		if (percentage<75) {
			System.out.println("You scored "+percent+ "%\n"+ "Please ask your teacher for extra help.");
		}
		else {
			System.out.println("You scored "+percent+ "%\n"+ "Congratulations, you are ready to go to the next level!");
		}
		input.close();
		
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
			
	public static int addition1(){
		
		number1 = 1 + randomNumber.nextInt(10);
		number2 = 1 + randomNumber.nextInt(10);
			
		int sum = number1+number2; // multiply the two random numbers
				
		System.out.println("How much is "+ number1 + " plus " + number2);
		return sum;
	}
	public static int addition2(){
		
		number1 = 1 + randomNumber.nextInt(100);
		number2 = 1 + randomNumber.nextInt(100);
			
		int sum = number1+number2; // multiply the two random numbers
				
		System.out.println("How much is "+ number1 + " plus " + number2);
		return sum;
	}
	public static int subtraction1(){
		
		number1 = 1 + randomNumber.nextInt(10);
		number2 = 1 + randomNumber.nextInt(10);
			
		int subtract = number1-number2; // multiply the two random numbers
				
		System.out.println("How much is "+ number1 + " minus " + number2);
		return subtract;
	}
	public static int subtraction2(){
		
		number1 = 1 + randomNumber.nextInt(100);
		number2 = 1 + randomNumber.nextInt(100);
			
		int subtract = number1-number2; // multiply the two random numbers
				
		System.out.println("How much is "+ number1 + " minus " + number2);
		return subtract;
	}
	public static int multiplication1() {
		
		number1 = 1 + randomNumber.nextInt(10);
		number2 = 1 + randomNumber.nextInt(10);
			
		int multiple = number1*number2; // multiply the two random numbers
				
		System.out.println("How much is "+ number1 + " times " + number2);
		return multiple;
	}
	public static int multiplication2() {
		
		number1 = 1 + randomNumber.nextInt(100);
		number2 = 1 + randomNumber.nextInt(100);
			
		int multiple = number1*number2; // multiply the two random numbers
				
		System.out.println("How much is "+ number1 + " times " + number2);
		return multiple;
	}
	public static int division1(){
		
		number1 = 1 + randomNumber.nextInt(10);
		number2 = 1 + randomNumber.nextInt(10);
			
		int divide = number1/number2; // multiply the two random numbers
				
		System.out.println("How much is "+ number1 + " divide by " + number2);
		return divide;
	}
	public static int division2(){
		
		number1 = 1 + randomNumber.nextInt(100);
		number2 = 1 + randomNumber.nextInt(100);
			
		int divide = number1/number2; // multiply the two random numbers
				
		System.out.println("How much is "+ number1 + " divide by " + number2);
		return divide;
	}

}
