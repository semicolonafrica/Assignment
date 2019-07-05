package chapter5.exercise531;
import java.util.Scanner;
public class GlobalWarming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int correctAnswer = 0;
		int wrongAnswer = 0;
		int quiz = 1;
		
			switch(quiz) {
			case 1:
				System.out.print("What factor is the second highest contributor to radiation in USA?");
				System.out.println();
				System.out.printf("%s\t%n%s\t%n%s\t%n%s\t%n", "(1) Burning", "(2) Transportation", "(3) Heat", "(4) Natural disaster");
				
				System.out.println("Type corresponding number to your answer.");
				int temp_answer = input.nextInt();
				if(temp_answer == 2) {
					correctAnswer += 1;
				}
				else {
					wrongAnswer += 1;
				} 
			
			case 2:
				System.out.print("How many year in total has been reported by NASA as hottest in history?");
				System.out.println();
				System.out.printf("%s\t%n%s\t%n%s\t%n%s\t%n", "(1) four", "(2) fourteen", "(3) six", "(4) sixteen");
				
				System.out.println("Type corresponding number to your answer.");
				int temp_ans = input.nextInt();
				if(temp_ans == 3) {
					correctAnswer += 1;
				}
				else {
					wrongAnswer += 1;
				}
				
			case 3:
				System.out.print("How many year in total has been reported by NASA as hottest in history?");
				System.out.println();
				System.out.printf("%s\t%n%s\t%n%s\t%n%s\t%n", "(1) four", "(2) fourteen", "(3) six", "(4) sixteen");
				
				System.out.println("Type corresponding number to your answer.");
				int temp_answ = input.nextInt();
				if(temp_answ == 3) {
					correctAnswer += 1;
				}
				else {
					wrongAnswer += 1;
				}
				
			case 4:
				System.out.print("How many year in total has been reported by NASA as hottest in history?");
				System.out.println();
				System.out.printf("%s\t%n%s\t%n%s\t%n%s\t%n", "(1) four", "(2) fourteen", "(3) six", "(4) sixteen");
				
				System.out.println("Type corresponding number to your answer.");
				int temp_an = input.nextInt();
				if(temp_an == 3) {
					correctAnswer += 1;
				}
				else {
					wrongAnswer += 1;
				}
				
			case 5:
				System.out.print("How many year in total has been reported by NASA as hottest in history?");
				System.out.println();
				System.out.printf("%s\t%n%s\t%n%s\t%n%s\t%n", "(1) four", "(2) fourteen", "(3) six", "(4) sixteen");
				
				System.out.println("Type corresponding number to your answer.");
				int temp_answers = input.nextInt();
				if(temp_answers == 3) {
					correctAnswer += 1;
				}
				else {
					wrongAnswer += 1;
				}
		}
	
		if(correctAnswer == 5) {
			double percent = (5/5)*100;
			System.out.print(percent + "%" + "Excellent!");
		}
		else if(correctAnswer == 4) {
			double percent1 = (4/5)*100;
			System.out.print(percent1 + "%" + "Very good");
		}
		else if(correctAnswer == 3) {
			double percent = (3/5)*100;
			System.out.print(percent + "%" + "Good");
		}
		else if(correctAnswer == 2) {
			double percent = (2/5)*100;
			System.out.print(percent + "%" + "This is antually B A D");
		}
		else {
			System.out.print("Consider another career path. You cannot continue like this, please, Na beg we dey.");
		}
}

	// void getQuiz() {
		// TODO Auto-generated method stub
		
	
}
