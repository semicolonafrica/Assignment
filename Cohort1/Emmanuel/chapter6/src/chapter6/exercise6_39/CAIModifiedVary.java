/**
 * 
 */
package chapter6.exercise6_39;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
	public class CAIModifiedVary {
		private enum Student { CORRECT, WRONG, RESET };
		
		public static SecureRandom randomNumbers = new SecureRandom();
		public static Scanner input = new Scanner(System.in);
		
		public static void multiply() {
			int count = 0;
			int flag = 1;
			int access = 0;
			
			System.out.println("Enter difficulty level.\n1. For Easy\n2. Hard. ");
			System.out.println("Enter choice question.\n1. For Addition\n2. Subtraction\n3. Multiplication"
					+ "\n4. Division\n5. Random mixture ");
			int difficult = input.nextInt();
			int vary = input.nextInt();
			
			int rand1 = 1;
			int rand2 = 1;
			while(flag == 1) {
			Student myStat = Student.RESET;
						
			for(int i = 1; i <= 10; i++) {

				if(difficult == 1) {
					rand1 = 1 + randomNumbers.nextInt(9);
					rand2 = 1 + randomNumbers.nextInt(9);
				} else if(difficult == 2){
					rand1 = 10 + randomNumbers.nextInt(30);
					rand2 = 10 + randomNumbers.nextInt(30);
				}

			
			
//			genQuestion(rand1,rand2);
//			rann = rand1 * rand2;
			
			if(vary==1) {
				access = getAddition(rand1, rand2);
			}else if(vary == 2) {
				access = getSubtraction(rand1, rand2);
			}else if(vary == 3) {
				access = getMultiplication(rand1, rand2);
			}else if(vary == 4) {
				access = getDivision(rand1, rand2);
			}else if(vary == 5) {
				access = getVarying(rand1, rand2);
			}
			
			int user = input.nextInt();
			
			if(access == user) {
				
				System.out.print(getCorrect(count));
				count++;
			} else {
				
				while(access != user) {
					System.out.print(getWrong());
					user = input.nextInt();
					if(access == user) {
						System.out.print(getCorrect(count));
						System.out.println();
						
					}
				}
				
			}
			
			
			}
			double percent  = (double)count / 10;
			if(percent >= 0.75){
				myStat = Student.CORRECT;
				System.out.println("Congratulations, you are ready to go to the next level.");
			}
			else if(percent < 0.75) {
				myStat = Student.WRONG;
				System.out.println("Please, ask your teacher for extra help.");
			}
			System.out.println("Enter 1 to continue, and select question level and type: ");
			flag = input.nextInt();
			 difficult = input.nextInt();
			 vary = input.nextInt();
			}
			}
			

		public static void genQuestion(int num1, int num2) {

			System.out.println("How much is " + num1 + " multiply by " + num2 + " = ");

		}

		public static String getCorrect(int count) {
			count = 0;
			int generateCorrect =1 + randomNumbers.nextInt(4);
			String correct = "";
			switch(generateCorrect) {
				case 1:
					correct = "Very good\n";
					count++;
					break;
				case 2:
					correct = "Excellent\n";
					count++;
					break;
				case 3:
					correct = "Keep up the good work\n";
					count++;
					break;
				case 4:
					correct = "Nice work\n";
					count++;
			}
			return correct;
		}
		
		public static String getWrong() {
			
			int generateWrong =1 + randomNumbers.nextInt(4);
			String wrong = "";
			switch(generateWrong) {
				case 1:
					wrong = "No. Please try again\n";
					break;
				case 2:
					wrong = "Wrong, once more\n";
					break;
				case 3:
					wrong = "Don't give up\n";
					break;
				case 4:
					wrong = "No. keep trying.\n";
			}
			return wrong;
		}
		public static int getAddition(int num1, int num2) {
			int result = 0;

			System.out.print("How much is " + num1 + " plus " + num2 + " = ");
			result = num1 + num2;
			return result;

			}
		public static int getSubtraction(int num1, int num2) {
			int result = 0;

			System.out.print("How much is " + num1 + " minus " + num2 + " = ");
			result = num1 - num2;
			return result;

			}
	
		public static int getMultiplication(int num1, int num2) {
			int result = 0;
	
			System.out.print("How much is " + num1 + " multiply by  " + num2 + " = ");
			result = num1*num2;
			return result;
	
			}
		public static int getDivision(int num1, int num2) {
			int result = 0;
			
			System.out.print("How much is " + num1 + " divided by  " + num2 + " = ");
			result = num1/num2;
			return result;
			
	
			}
		public static int getVarying(int num1, int num2) {
			
			int result = 0;
			int random = 1 + randomNumbers.nextInt(4);
			switch(random){
				case 1:
					System.out.print("How much is " + num1 + " plus " + num2 + " = ");
					result = num1 + num2;	
					break;
		
				case 2:
					System.out.print("How much is " + num1 + " minus " + num2 + " = ");
					result = num1 - num2;	
					break;
				
				case 3:
					System.out.print("How much is " + num1 + " multiply by " + num2 + " = ");
					result = num1 * num2;	
					break;
		
				case 4:
					System.out.print("How much is " + num1 + " divide by " + num2 + " = ");
					result = num1 / num2;	
					break;
					
					
			}
			return result;
		}
		
			
	
			
			
}
