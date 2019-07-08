package chapter6.chapter6_Group;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstructionXXL {

	
	final static SecureRandom rando = new SecureRandom();
	
	public static int generateMultiplicationQuestions(double answer){
		
		
		int number1 = 1 + rando.nextInt(10);
		int number2 = 1 + rando.nextInt(10);
		
		System.out.printf("What is %d times %d%n", number1 , number2);
		answer = number1 * number2 ;
		
		return (int) answer;
		
	}
	
	
	public static void askQuestion() {
		
		Scanner input = new Scanner(System.in);
		double answer = 0;
		double correctAnswer = 0;
		int inCorrectAnswerCounter = 0;
		int answerCounter = 0;
		int option;
		
		System.out.println("Enter\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division\n5 for Random mixture");
		option = input.nextInt(6);
		
		while(answerCounter <=10) {
			
			if(option == 1)
		 correctAnswer = generateAdditionQuestions(answer);
			
			if(option == 2)
				correctAnswer = generateSubtractionQuestions(answer);
			
			if(option ==3)
				correctAnswer = generateMultiplicationQuestions(answer);
			
			if(option == 4)
				correctAnswer = generateDivisionQuestions(answer);
			
			if(option == 5)
				correctAnswer = generateRandomQuestions(answer);
		
			
		 answer = input.nextDouble();
		 answerCounter++;
		
		if(answer == correctAnswer) {
			System.out.println(generateCommentforCorrectAnswers());
		
		}
		
		else {
			
			while(answer != correctAnswer) {
				System.out.println(generateCommentforWrongAnswers());
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
		String remark1 = "Very Good!";
		String remark2 = "Excellent!";
		String remark3 = "Nice Work!";
		String remark4 = "Keep up the good work";
		
		switch(number) {
		case 0:
			remark = remark1;
			break;
		case 1:
			remark = remark2;
			break;
		case 2:
			remark = remark3;
			break;
		case 3:
			remark = remark4;
			break;
		
		}
		
		return remark;
		
	}
	
	
	public static String generateCommentforWrongAnswers() {
		int number = random.nextInt(4);
		String remark = " ";
		String remark1 = "No! Please try again";
		String remark2 = "Wrong, Try once more";
		String remark3 = "Dont give up!";
		String remark4 = "No! keep trying";
		
		switch(number) {
		case 0:
			remark = remark1;
			break;
		case 1:
			remark = remark2;
			break;
		case 2:
			remark = remark3;
			break;
		case 3:
			remark = remark4;
			break;
		
		}
		return remark;
	}
	
	public static int generateAdditionQuestions(double answer) {
		
		int number1 = 12+ random.nextInt(50);
		int number2 = 30+ random.nextInt(40);
		
		System.out.printf("What is %d plus %d%n", number1 , number2);
		answer = number1 + number2 ;
		
		return (int) answer;
	}
	
	public static int generateSubtractionQuestions(double answer) {
		
		int number1 = 30 + random.nextInt(100);
		int number2 = 10 + random.nextInt(69);
		
		System.out.printf("What is %d minus %d%n", number1 , number2);
		answer = number1 - number2 ;
		
		return (int) answer;
	}
	
	public static double generateDivisionQuestions(double answer) {
		
		double number1 =  2 * random.nextInt(15);
		double number2 = 2 * 1 + random.nextInt(3);
		
		System.out.printf("What is %.0f divided by %.0f%n", number1 , number2);
		answer = number1 / number2 ;
		
		return answer;
	}
	
	public static double generateRandomQuestions(double answer) {
		
		double question = 0;
		int questionSelector = 1 + random.nextInt(4);
		
		switch(questionSelector) {
		case 1:
			question = generateAdditionQuestions(answer);
			break;
		case 2:
			question = generateSubtractionQuestions(answer);
			break;
		case 3:
			question = generateMultiplicationQuestions(answer);
			break;
		case 4: 
			question = generateDivisionQuestions(answer);
			break;
		
		}
		
		return question;
			
	}
	

	


}
