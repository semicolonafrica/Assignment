package exercise6_36;

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigue {

	static SecureRandom random = new SecureRandom();
	
	static Scanner input = new Scanner(System.in);
	
	static int a = 0;	static int b = 0;
	
	public static int multiply() {
		a = 1 + random.nextInt(9);	b = 1 + random.nextInt(9);
		int result = a * b;
		return result;
	}
	
	public static void rightRemark() {
		int right = 1 + random.nextInt(4);
		
		switch(right) {
		case 1: System.out.println("Very good!");
		break;
		case 2: System.out.println("Excellent!");
		break;
		case 3: System.out.println("Nice work!");
		break;
		case 4: System.out.println("Keep up the good work!");
		break;
		default: System.out.println("None");
		}
	}
	
	public static void wrongRemark() {
		int wrong = 1 + random.nextInt(4);
		
		switch(wrong) {
		case 1: System.out.println("No, try again!");
		break;
		case 2: System.out.println("Wrong, try once more!");
		break;
		case 3: System.out.println("Don't give-up!");
		break;
		case 4: System.out.println("No, keep trying!");
		break;
		default: System.out.println("None");
		}
	}
	
	public static void displayRemark() {
		int response = 0;	int result = multiply();
		
		 while(result != response){
			 System.out.println("What is the answer of " + a + " times " + b + " ?");
			 response = input.nextInt();
			 if(result != response) {
				 	wrongRemark();				 
			 }
		 }
		 	rightRemark();
		 // call method displayRemark to change question
		 displayRemark();
	}
	
	public static void main(String [] arg) {
	displayRemark();
	}
}

