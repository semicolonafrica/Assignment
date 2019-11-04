package exercise6_35;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {
	static Scanner insert = new Scanner(System.in);
	static SecureRandom random = new SecureRandom();
	static int num1 = 1 + random.nextInt(10);
	static int num2 = 1 + random.nextInt(10);
	static int num12 = 10 + random.nextInt(100);
	static int num22 = 10 + random.nextInt(100);
	static int num13 = 100 + random.nextInt(1000);
	static int num23 = 100 + random.nextInt(1000);
	
	public static double multiplyOneDigit(int answer) {
		double result = 0;
		switch(answer) {
		case 1:
			result = num1 * num2;
			
			break;
		case 2:
			result = (double) num1 / num2;
			
			break;
		case 3:
			result = num1 + num2;
			
			break;
		case 4:
			result = num1 - num2;
			
			break;
		}
		
		return result;
	}
	
	public static double multiplyTwoDigit(int answer) {
		double result = 0;
		switch(answer) {
		case 1:
			result = num1 * num2;
			
			break;
		case 2:
			result = (double) num1 / num2;
			
			break;
		case 3:
			result = num1 + num2;
			
			break;
		case 4:
			result = num1 - num2;
			
			break;
		}
		
		return result;
	}
	
	public static double multiplyThreeDigit(int answer) {
		double result = 0;
		switch(answer) {
		case 1:
			result = num1 * num2;
			
			break;
		case 2:
			result = (double) num1 / num2;
			
			break;
		case 3:
			result = num1 + num2;
			
			break;
		case 4:
			result = num1 - num2;
			
			break;
		}
		
		return result;
	}
	
	public static void question() {	
		System.out.println("Enter 1 for easy or 2 for difficult level or 3 for more difficult level");
		int response = insert.nextInt();
		int answer =0;
		if(response == 1) {
			//if()
		System.out.println("How much is " + num1 +" times " + num2);
		answer = insert.nextInt();
		compareAnswerAndMultiple(answer,multiplyOneDigit(),num1,num2);
		}
		else if(response == 2) {
			System.out.println("How much is " + num12 +" times " + num22);
			answer = insert.nextInt();
			compareAnswerAndTwoMultiple(answer,multiplyTwoDigit(),num12,num22);
		}
		else if(response == 3) {
			System.out.println("How much is " + num13 +" times " + num23);
			answer = insert.nextInt();
			compareAnswerAndThreeMultiple(answer,multiplyThreeDigit(),num13,num23);
		}
		insert.close();
		
		
	}
	

	
	public static void newQuestion() {
		int num1 = 1 + random.nextInt(10);
		int num2 = 1 + random.nextInt(10);
		int multiply = num1 * num2;
		Scanner insert = new Scanner(System.in);
		System.out.println("How much is " + num1 +" times " + num2);
		int answer = insert.nextInt();
		compareAnswerAndMultiple(answer,multiply,num1,num2);
		
		insert.close();
	
	}
	
	public static void newQuestion2() {
		int num12 = 10 + random.nextInt(100);
		int num22 = 10 + random.nextInt(100);
		int multiply = num12 * num22;
		Scanner insert = new Scanner(System.in);
		System.out.println("How much is " + num12 +" times " + num22);
		int answer = insert.nextInt();
		compareAnswerAndTwoMultiple(answer,multiply,num12,num22);
		
		insert.close();
	
	}
	
	public static void newQuestion3() {
		int num13 = 100 + random.nextInt(1000);
		int num23 = 100 + random.nextInt(1000);
		int multiply = num13 * num23;
		Scanner insert = new Scanner(System.in);
		System.out.println("How much is " + num13 +" times " + num23);
		int answer = insert.nextInt();
		compareAnswerAndTwoMultiple(answer,multiply,num13,num23);
		
		insert.close();
	
	}
	
	public static boolean correctRemark() {
		int number = 1 + random.nextInt(4);
		//int count1 =0;
		switch(number) {
		case 1:
			System.out.println("Very Good");
			
			break;
		case 2:
			System.out.println("Excellent");
		
			break;
		case 3:
			System.out.println("Nice work");
			
			break;
		case 4:
			System.out.println("Keep up the good work");
			
			break;
			
		}
		
		return true;	
	
	}

	public static void incorrectRemark() {
		int number = 1 + random.nextInt(4);
		
		switch(number) {
		case 1:
			System.out.println("No. Please try again.");
			break;
		case 2:
			System.out.println("Wrong.Try once more");
			break;
		case 3:
			System.out.println("Don't give up");
			break;
		case 4:
			System.out.println("No. Keep trying");
			break;

		}
		
	}
	
	public static void compareAnswerAndMultiple(int answer, double multiply,int num1,int num2) {
		
	
		if(answer == multiply) {
			
			correctRemark();
			newQuestion();
		}else {
		while(multiply != answer) {	
			incorrectRemark();
			System.out.println("How much is " + num1 +" times " + num2);
			answer = insert.nextInt();
			}
		if(answer == multiply) {
			correctRemark();
			newQuestion();
			
			}
		}
		
		
	}
	
public static void compareAnswerAndTwoMultiple(int answer, int multiply,int num12,int num22) {
		
		
		if(answer == multiply) {
			correctRemark();
			newQuestion2();
		}else {
		while(multiply != answer) {	
			incorrectRemark();
			System.out.println("How much is " + num12 +" times " + num22);
			answer = insert.nextInt();
			}
		if(answer == multiply) {
			correctRemark();
			newQuestion2();
			
			}
		}
		
		
	}

public static void compareAnswerAndThreeMultiple(int answer, int multiply,int num13,int num23) {
	
	
	if(answer == multiply) {
		correctRemark();
		newQuestion3();
	}else {
	while(multiply != answer) {	
		incorrectRemark();
		System.out.println("How much is " + num13 +" times " + num23);
		answer = insert.nextInt();
		}
	if(answer == multiply) {
		correctRemark();
		newQuestion3();
		
		}
	}
	
	
}


}
