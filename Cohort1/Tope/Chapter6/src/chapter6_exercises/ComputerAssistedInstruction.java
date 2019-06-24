package chapter6_exercises;

import java.security.SecureRandom;
import java.util.Scanner;

//Application that helps elementary School student learn multiplication
//Exercise 6.35
//Program written by Oyemade Temitope
//24th of June 2019

public class ComputerAssistedInstruction {
	
	public static int generateQuestions(int answer){
		
		SecureRandom random = new SecureRandom();
		int number1 = 1+ random.nextInt(10);
		int number2 = 1+ random.nextInt(10);
		
		System.out.printf("What is %d times %d%n", number1 , number2);
		answer = number1 * number2 ;
		
		return answer;
		
	}
	
	public static void askQuestion() {
		
		System.out.println("Answer quiz or -1 to end");
		Scanner input = new Scanner(System.in);
		int answer = 0;
		int correctAnswer;
		
		while(answer != -1) {
		answer = 0;
		 correctAnswer = generateQuestions(answer);
		answer = input.nextInt();
		
		if(answer == correctAnswer)
			System.out.println("Very Good!");
		
		else {
			
			while(answer != correctAnswer) {
				if(answer == -1)
					break;
				
				System.out.println("No. Please try again.");
				answer = input.nextInt();
					
				if(answer == correctAnswer)
					System.out.println("Very Good!");
			}
			
		}
		
		}
		input.close();
		
		
		
	}
	
	public static void main(String[] args) {
		
		askQuestion();
	}
	

}
