/* Author: ADEBAYO Johnson
 Date: 29/06/2019 
 Location of exercise:  Exercise 6, Question 6.36
 Purpose: For Computer Assisted Instruction (CAI)
*/

package chapter6.exercise636;

import java.util.Scanner;
import java.security.SecureRandom;
public class CIAModified {
	static private int number3 = 0;
	static private int answer = 0;
	static private int number1;
	static private int number2;
	static private int number4;
	static private int number5;
	static Scanner input = new Scanner(System.in);
	private static final SecureRandom random = new SecureRandom();
	public static void main(String[] args) {
		receiveAnswer();
	}
	public static void generateQuestion() {
		number1 = 1 + random.nextInt(12);
		number2 = 1 + random.nextInt(12);	
	}
	public static void receiveAnswer() {
		generateQuestion();
		number3 = number1 * number2;
		for(int counter =1; answer !=number3; counter++) {
		//System.out.print("How much is " + number1 + " times " + number2 + " = ");
		System.out.print( number1 + " X " + number2 + " = ");
		answer = input.nextInt();
		checkAnswer();
		}
	}
	public static void checkAnswer(){
		if(answer == number3) {
			number4 = 1 + random.nextInt(4);
			System.out.print( (number4 == 1 ? "Very good" : "") );
			System.out.print( (number4 == 2 ? "Excellent" : "") );
			System.out.print( (number4 == 3 ? "Nice work!" : "") );
			System.out.print( (number4 == 4 ? "Keep up the good work!" : "") );
			System.out.println("\n");
			receiveAnswer();
		}
		else {
			number5 = 1 + random.nextInt(4);
			System.out.print( (number5 == 1 ? "No. Please try again." : "") );
			System.out.print( (number5 == 2 ? "Wrong. Try once more." : "") );
			System.out.print( (number5 == 3 ? "Don't give up!" : "") );
			System.out.print( (number5 == 4 ? "No. Keep trying." : "") );
			System.out.println("\n");	
		}
	}
}

