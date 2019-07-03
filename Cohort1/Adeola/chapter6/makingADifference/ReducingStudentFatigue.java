package makingADifference;

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigue {
	
	static SecureRandom random = new SecureRandom();
	static Scanner input = new Scanner(System.in);
	
	static int a =0;
	static int b =0;
	
	//method that multiplies
	public static int multiply() {
		a = 1 + random.nextInt(9);
		b = 1 + random.nextInt(9);
		int result = a*b;
		return result;
	}
	//method remark for wrong answers
	public static void wrongRemark() {
		int wrong = 1 + random.nextInt(4);

		switch(wrong) {
		case 1:
			System.out.println("no, please try again");
			break;
		case 2:
			System.out.println("wrong, try once more");
			break;
		case 3:
			System.out.println("don't give up");
			break;
		case 4:
			System.out.println("no, keep trying");
			break;
		}
	}
	
	public static void rightRemark() {
		int right = 1 + random.nextInt(4);

		switch(right) {
		case 1:
			System.out.println("very good");
			break;
		case 2:
			System.out.println("excellent");
			break;
		case 3:
			System.out.println("nice work!!");
			break;
		case 4:
			System.out.println("keep up the good work");
			break;
		}
	}
	
	//method that displays remark
	public static void displayRemark() {
		int result = multiply();
//		System.out.println("");
		int response = 0;
		while(result != response) {
			System.out.println("what is the answer of " + a+ " times "+ b);
			response = input.nextInt();
			if(result != response) {
				wrongRemark();
			}
		}
		rightRemark();
		//call method 
		displayRemark();
	}

	public static void main(String[] args) {
		displayRemark();
	}

}
