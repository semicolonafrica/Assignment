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
			double percentCorrect = 0.0;
			//double percentWrong = 0;
			int sentinel = 1;
			int difficult = 1;
			int number1 = 1;
			int number2 = 1;
			while(sentinel == 1) {
				Student getStatus = Student.reset;
				System.out.print("Enter the difficulty level\n1 for easy\n2 for hard.");
				difficult = input.nextInt();
				System.out.print("Enter\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5 - Random Operation.");
				int userOperator = input.nextInt();
			for(int i = 1; i <= 10; i++) {
				
				if(difficult == 1) {
					number1 = random.nextInt(10);
					number2 = random.nextInt(10);
				} else if(difficult == 2) {
					number1 =10 + random.nextInt(40);
					number2 =10 + random.nextInt(40);	
				}
				
				
				
			int multiply = 1; 
						
					if(userOperator == 1) {
						multiply = getAddition(number1,number2);
					} else if(userOperator == 2) {
						multiply = getSubtraction(number1, number2);
					} else if(userOperator == 3) {
						multiply = getDivision(number1, number2);
					} else if(userOperator == 4) {
						multiply = getMultiplication(number1, number2);
					} else if(userOperator == 5) {
						multiply = getRandom(number1, number2);
					}
			
			System.out.println();
			
			int usermultiply = input.nextInt();
			
			
			
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
			
			if(percentCorrect >= 0.75 && percentCorrect <= 1.0) {
				getStatus = Student.correct;
				System.out.print(".Congratulations, you are ready to go to the next level.");
			} else if(percentCorrect >= 0 && percentCorrect < 0.75) {
				getStatus = Student.wrong;
				System.out.print("Please ask your teacher for help");
			}
			System.out.print("\nEnter 1 for a new \nstudent to try or -1 to end");
			sentinel = input.nextInt();
			}
		}
		
		public static int getMultiplication(int first, int second) {
			int gen = random.nextInt(6);
			int question = 1;
			//System.out.print("Enter the operator: ");
			//int operator = random.nextInt(5);
			switch(gen) {
				case 0:
					question = first * second;
					System.out.print("How much is" + first + "plus"+ second + "?");
					break;
				case 1:
					question = first * second;
					System.out.print("What is " + first + " times" + second + "?");
					break;
				case 2:
					question = first * second;
					System.out.print(first + "multiplied by "  + second +"?");
					break;
				case 3:
					question = first * second;
					System.out.print("What is"+ first +" multiplied by" + second +"?");
					break;
				case 4:
					question = first * second;
					System.out.print(first + " times " + second);
					break;
				case 5:
					question = first * second;
					System.out.print(first + " multipled by " + second);
					break;
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
		public static int getAddition(int first, int second) {
			
			int arith = random.nextInt(5);
			int doarith = 0;
			
			switch(arith) {
				case 0:
					doarith = first + second;
					System.out.print("How much is" + first + "addition"+ second + "?");
					break;
				case 1:
					doarith = first + second;
					System.out.print("How much is" + first + "plus"+ second + "?");
					break;
				case 2:
					doarith = first + second;
					System.out.print("What is" + first + " + "+ second + "?");
					break;
				case 3:
					doarith = first + second;
					System.out.print("What is " + first + " plus " + second + "?");
					break;
				case 4:
					doarith = first + second;
					System.out.print(" add " + first + " and " + second);
					break;
			}
			return doarith;
		}
		public static int getDivision(int first, int second) {
			
			int arith = random.nextInt(5);
			int doarith = 0;
			
			switch(arith) {
				case 0:
					doarith = first / second;
					System.out.print("How much is" + first + " / "+ second + "?");
					break;
				case 1:
					doarith = first / second;
					System.out.print("How much is" + first + " divided "+ second + "?");
					break;
				case 2:
					doarith = first / second;
					System.out.print("how many" + first + " divides "+ second + "?");
					break;
				case 3:
					doarith = first / second;
					System.out.print(" " + first + " divide by " + second + "?");
					break;
				case 4:
					doarith = first / second;
					System.out.print(first + " divided " + second);
					break;
			}
			return doarith;
			}
		
		public static int getSubtraction(int first, int second) {
			
			int arith = random.nextInt(5);
			int doarith = 0;
			
			switch(arith) {
				case 0:
					doarith = first - second;
					System.out.print("How much is" + first + " - "+ second + "?");
					break;
				case 1:
					doarith = first - second;
					System.out.print("How much is" + first + " minus "+ second + "?");
					break;
				case 2:
					doarith = first - second;
					
					System.out.print("What is" + first + " minus "+ second);
					break;
				case 3:
					doarith = first - second;
					System.out.print(" Give me answer to" + first + " minus " + second + "?");
					break;
				case 4:
					doarith = first - second;
					System.out.print(first + " - " + second);
					break;
			}
			return doarith;
			}
		
		public static int getRandom(int first, int second) {
			
			int arith = random.nextInt(5);
			int doarith = 0;
			
			switch(arith) {
				case 0:
					doarith = first / second;
					System.out.print("How much is" + first + " / "+ second + "?");
					break;
				case 1:
					doarith = first * second;
					System.out.print("How much is" + first + " multiplied "+ second + "?");
					break;
				case 2:
					doarith = first + second;
					System.out.print("how many" + first + " + "+ second + "?");
					break;
				case 3:
					doarith = first % second;
					System.out.print(" " + first + " modulus " + second + "?");
					break;
				case 4:
					doarith = first - second;
					System.out.print(first + " minus " + second);
					break;
			}
			return doarith;
			}
	
}
