package chapter6_exercises;

import java.security.SecureRandom;
import java.util.Scanner;

//Application that helps elementary School student learn multiplication
//Exercise 6.35 & 6.36
//Program written by Oyemade Temitope
//24th of June 2019

public class ComputerAssistedInstruction {
	
	final static SecureRandom random = new SecureRandom();
	public static int generateQuestions(int answer){
		
		
		int number1 = 1+ random.nextInt(10);
		int number2 = 1+ random.nextInt(10);
		
		System.out.printf("What is %d times %d%n", number1 , number2);
		answer = number1 * number2 ;
		
		return answer;
		
	}
	
	public static void askQuestion() {
		
		System.out.println("Answer quiz or -1 to end\n");
		Scanner input = new Scanner(System.in);
		int answer = 0;
		int correctAnswer;
		
		while(answer != -1) {
		answer = 0;
		 correctAnswer = generateQuestions(answer);
		answer = input.nextInt();
		
		if(answer == correctAnswer)
			System.out.println(generateCommentforCorrectAnswers());
		
		else {
			
			while(answer != correctAnswer) {
				if(answer == -1)
					break;
				
				System.out.println(generateCommentforNegativeAnswers());
				answer = input.nextInt();
					
				if(answer == correctAnswer)
					System.out.println(generateCommentforCorrectAnswers());
			}
			
		}
		
		}
		input.close();
		
		
		
	}
	
	
	public static String generateCommentforCorrectAnswers() {
		
		int number = random.nextInt(4);
		String remark = " ";
		String r1 = "Very Good!";
		String r2 = "Excellent!";
		String r3 = "Nice Work!";
		String r4 = "Keep up the good work";
		
		switch(number) {
		case 0:
			remark = r1;
			break;
		case 1:
			remark = r2;
			break;
		case 2:
			remark = r3;
			break;
		case 3:
			remark = r4;
			break;
		
		}
		
		return remark;
		
	}
	
	
	public static String generateCommentforNegativeAnswers() {
		int number = random.nextInt(4);
		String remark = " ";
		String r1 = "No! Please try again";
		String r2 = "Wrong, Try once more";
		String r3 = "Dont give up!";
		String r4 = "No! keep trying";
		
		switch(number) {
		case 0:
			remark = r1;
			break;
		case 1:
			remark = r2;
			break;
		case 2:
			remark = r3;
			break;
		case 3:
			remark = r4;
			break;
		
		}
		
		return remark;
		
	}
	
	//Main method
	public static void main(String[] args) {
		
		askQuestion();
	}
	

}
