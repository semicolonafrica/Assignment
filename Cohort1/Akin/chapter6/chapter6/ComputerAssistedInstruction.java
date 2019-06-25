package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
	
	private enum Student { correct, wrong, reset  };

	public static SecureRandom random = new SecureRandom();
	public static Scanner input =  new Scanner(System.in);
		public static void multiplication() {
		
			//Student getStatus = Student.reset;
			int countCorrect = 0;
			//int countWrong = 0;
			double percentCorrect = 0;
			//double percentWrong = 0;
			int sentinel = 1;
			while(sentinel == 1) {
				Student getStatus = Student.reset;
				
			for(int i = 1; i <= 10; i++) {
			int number1 = random.nextInt(10);
			int number2 = random.nextInt(10);
			
			System.out.print(message(number1,number2));
			System.out.println();
			
			int usermultiply = input.nextInt();
			int multiply = number1 * number2;
			
			if(usermultiply == multiply) {
				System.out.println();
				System.out.print(displaycorrect());
				System.out.println();
				countCorrect++;
			} else {
				while(usermultiply != multiply) {
					System.out.println();
					System.out.print(displayWrong());
					//countWrong++;
					System.out.println();
					usermultiply = input.nextInt();
					if(usermultiply == multiply) {
						System.out.println();
						System.out.print(displaycorrect());
						System.out.println();
						
					}
				}
			}
			}
			percentCorrect = countCorrect / 10;
			
			if(percentCorrect < 0.75) {
				getStatus = Student.wrong;
				System.out.print("Please ask your teacher for help.");
			} else if(percentCorrect > 0.75) {
				getStatus = Student.correct;
				System.out.print("Congratulations, you are ready to go to the next level.");
			}
			System.out.print("\nEnter 1 for a new \nstudent to try or -1 to end");
			sentinel = input.nextInt();
			}
		}
		
		public static String message(int first, int second) {
			int gen = random.nextInt(6);
			String question = "";
			switch(gen) {
				case 0:
					question = "How much is" + first + "multiplied by"+ second + "?";
					break;
				case 1:
					question = "What is " + first + " times" + second + "?";
					break;
				case 2:
					question = first + "multiplied by "  + second +"?";
					break;
				case 3:
					question = "What is"+ first +" multiplied by" + second +"?";
					break;
				case 4:
					question = first + " times " + second;
					break;
				case 5:
					question = first + " multipled by " + second;
					
			}
			return question;
		}
		public static String displaycorrect() {
			
			int rand = 1 + random.nextInt(4);
			String display = "";
			switch(rand) {
				case 1:
					display = "Very good!";
					break;
				case 2:
					display = "Excellent!";
					break;
				case 3:
					display = "Nice work!";
					break;
				case 4:
					display = "Keep up the good work!";
					break;
			}
			return display;
		}
		
		public static String displayWrong() {
			
			int rand = 1 + random.nextInt(4);
			String display = "";
			switch(rand) {
				case 1:
					display = "No. Please try again!";
					break;
				case 2:
					display = "Wrong. Try once more.";
					break;
				case 3:
					display = "Don't give up.";
					break;
				case 4:
					display = "No. Keep trying.";
					break;
			}
			return display;
		}
	
}
