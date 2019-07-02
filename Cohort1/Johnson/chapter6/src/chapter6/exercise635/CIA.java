/* Author: ADEBAYO Johnson
 Date: 29/06/2019 
 Location of exercise:  Exercise 6, Question 6.35
 Purpose: For Computer Assisted Instruction (CAI)
*/

package chapter6.exercise635;

import java.util.Scanner;
import java.security.SecureRandom;
public class CIA {
	static private int number3 = 0;
	static private int answer = 0;
	static private int number1;
	static private int number2;
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
		System.out.print("How much is " + number1 + " times " + number2 + " = ");
		//System.out.print( number1 + " X " + number2 + " = ");
		answer = input.nextInt();
		checkAnswer();
		}
	}
	public static void checkAnswer(){
		if(answer == number3) {
			System.out.println("Very good");
			receiveAnswer();
		}
		else {
			System.out.println("No. Please try again.");	
		}
	}
}
