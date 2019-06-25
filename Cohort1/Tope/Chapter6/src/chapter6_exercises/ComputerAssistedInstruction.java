package chapter6_exercises;

import java.security.SecureRandom;
import java.util.Scanner;

//Application that helps elementary School student learn multiplication
//Exercise 6.35, 6.36, 6.37 & 6.38
//Program written by Oyemade Temitope
//24th of June 2019

public class ComputerAssistedInstruction {
	
	final static SecureRandom random = new SecureRandom();
	
	public static int generateQuestionsForLevelOne(int answer){
		
		
		int number1 = 1+ random.nextInt(10);
		int number2 = 1+ random.nextInt(10);
		
		System.out.printf("What is %d times %d%n", number1 , number2);
		answer = number1 * number2 ;
		
		return answer;
		
	}
	
	public static int generateQuestionsForLevelTwo(int answer) {
		int number1 = 6+ random.nextInt(10);
		int number2 = 6+ random.nextInt(10);
		
		System.out.printf("What is %d times %d%n", number1 , number2);
		answer = number1 * number2 ;
		
		return answer;
	}
	
	public static void askQuestion() {
		
		Scanner input = new Scanner(System.in);
		int answer = 0;
		int correctAnswer = 0;
		int inCorrectAnswerCounter = 0;
		int answerCounter = 0;
		int level;
		
		System.out.println("Enter difficulty Level (1 or 2)");
		level = input.nextInt(3);
		
		while(answerCounter <=10) {
			
			if(level == 1)
		 correctAnswer = generateQuestionsForLevelOne(answer);
			
			if(level == 2)
				correctAnswer = generateQuestionsForLevelTwo(answer);
			
		 answer = input.nextInt();
		 answerCounter++;
		
		if(answer == correctAnswer) {
			System.out.println(generateCommentforCorrectAnswers());
		
		}
		
		else {
			
			while(answer != correctAnswer) {
				System.out.println(generateCommentforNegativeAnswers());
				answer = input.nextInt();
				answerCounter++;
				inCorrectAnswerCounter++;
				if(answerCounter == 10)
					break;
				
				
				if(answer == correctAnswer) {
					System.out.println(generateCommentforCorrectAnswers());
				}
			}
			
		}
		
		
		if(answerCounter == 10) {
				double average = inCorrectAnswerCounter * 0.75;
			
			if(average > 3.5)
				System.out.println("Please ask your teacher for extra help.");
					
			if(average < 3.5)
			System.out.println("Congratulations, you are ready to go to the next level!");
			
			break;
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
	

	

}
