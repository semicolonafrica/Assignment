package chapter6.exercise636;

import java.security.SecureRandom;
import java.util.Scanner;
//Computer-Assisted Instruction: Reducing Student Fatigue)
public class ComputerAssistedInstruction2 {
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	
	static int a=0;
	static int b=0;
	
	//method that multiply
	public static int multiply() {
		a = 1 + random.nextInt(9);
		b = 1 + random.nextInt(9);
		//System.out.println("what is the answer of" + a+ " times "+ b);
		int result = a * b;
		return result;
				
	}
	
	public static void incorrectRemarks() {
		int incorrect = 1 + random.nextInt(4);
		
		switch(incorrect) {
		case 1:
			System.out.println("No. Please try again.");
		
		case 2:
			System.out.println("Wrong. Try once more.");
			
		case 3:
			System.out.println("Don't give up.");
			
		case 4:
			System.out.println("No. Keep trying.");
		}
	}
	
	public static void correctRemarks() {
		int correct = 1 + random.nextInt(4);
		
		switch(correct) {
		case 1:
			System.out.println("Very good!");
			break;
		
		case 2:
			System.out.println("Excellent!");
			break;
			
		case 3:
			System.out.println("Nice Work!");
			break;
			
		case 4:
			System.out.println("Keep up the good work!");
			break;
		}
	}
	public static void displayRemark() {
		int result = multiply();
		int response = 0;
		while(result !=response) {
			System.out.println("what is the answer of " + a+ " times "+ b);
			response = input.nextInt();
			if(result != response) {
				incorrectRemarks();
			}
		}
		correctRemarks();
		// call method
		displayRemark();
	}
	public static void main(String[] args) {
		displayRemark();
		

	}

}
