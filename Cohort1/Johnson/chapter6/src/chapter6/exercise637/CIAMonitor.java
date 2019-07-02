/* Author: ADEBAYO Johnson
 Date: 29/06/2019 
 Location of exercise:  Exercise 6, Question 6.37
 Purpose: For Computer Assisted Instruction (CAI)
*/

package chapter6.exercise637;

import java.util.Scanner;
import java.security.SecureRandom;
public class CIAMonitor {
	static private int number3;
	static private int answer;
	static private int number1;
	static private int number2;
	static private int number4;
	static private int number5;
	static private int score =0;
	static private double percentageScore = 0.00;
	static Scanner input = new Scanner(System.in);
	private static final SecureRandom random = new SecureRandom();
	
	public static void main(String[] args) {
		receiveAnswer();
	}
	public static void generateNumbers() {
		number1 = 1 + random.nextInt(12);
		number2 = 1 + random.nextInt(12);	
	}
	public static void receiveAnswer() {// Generate question ten times
		for(int counter =1; counter <= 10; counter++) {
			generateNumbers();
			number3 = number1 * number2;
		//System.out.print("How much is " + number1 + " times " + number2 + " = ");
		System.out.print( number1 + " X " + number2 + " = ");
		answer = input.nextInt();
		checkAnswer();
		}
		findPercentageScore();
	}
	public static void checkAnswer(){
		if(answer == number3) {
			number4 = 1 + random.nextInt(4);
			System.out.print( (number4 == 1 ? "Very good" : "") );
			System.out.print( (number4 == 2 ? "Excellent" : "") );
			System.out.print( (number4 == 3 ? "Nice work!" : "") );
			System.out.print( (number4 == 4 ? "Keep up the good work!" : "") );
			score += 1;
			System.out.println("\n");
		}
		else {
			number5 = 1 + random.nextInt(4);
			System.out.print( (number5 == 1 ? "No. Please try again." : "") );
			System.out.print( (number5 == 2 ? "Wrong. Try once more." : "") );
			System.out.print( (number5 == 3 ? "Don't give up!" : "") );
			System.out.print( (number5 == 4 ? "No. Keep trying." : "") );
			score = score;
			System.out.println("\n");	
		}		
	}
	public static void findPercentageScore() {
		System.out.println("Your score is: " + score + "/" + "10");
		percentageScore = ((double)score/10)*100;
		System.out.println("Percentage score is: " + percentageScore + "%");
		System.out.println( (percentageScore >= 75.0 ? 
				"Congratulations, you are ready to go to the next level!" : 
				"Please ask your teacher for extra help.") );	
	}
}


