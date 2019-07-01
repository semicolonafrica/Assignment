package chapter6.exercise637;

import java.security.SecureRandom;
import java.util.Scanner;

//(Computer-Assisted Instruction: Monitoring Student Performance)
public class ComputerAssistedInstruction3 {

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
//		int result = multiply();
		int response = 0;
		int counter = 3;
		double pass = 0;
		for(int i = 1; i <= counter; i++){
			int result = multiply();
			System.out.println("what is the answer of " + a+ " times "+ b);
			response = input.nextInt();
			if(result != response) {
				incorrectRemarks();
			}
			else {
				correctRemarks();
				pass = pass + 1;
			}
		}
		
		double percentage = (pass/counter)*100;
		if(percentage <75) {
			System.out.println(percentage +"% Please ask your teacher for extra help");
			displayRemark();
		}
		else {
			System.out.println(percentage +"% \"Congratulations, you are ready to go to the next level!\",");
			displayRemark();
		}
//		correctRemarks();
//		// call method
//		displayRemark();
	}

	public static void main(String[] args) {
		displayRemark();

	}

}
