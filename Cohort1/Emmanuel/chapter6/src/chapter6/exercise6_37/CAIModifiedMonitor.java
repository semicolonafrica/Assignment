/**
 * 
 */
package chapter6.exercise6_37;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
	public class CAIModifiedMonitor {
		private enum Student { CORRECT, WRONG, RESET };
		
		public static SecureRandom randomNumbers = new SecureRandom();
		public static Scanner input = new Scanner(System.in);
		public static void multiply() {
			int count = 0;
			int flag = 1;
			while(flag == 1) {
			Student myStat = Student.RESET;
						
			for(int i = 1; i <= 10; i++) {
			int rand1 = 1 + randomNumbers.nextInt(9);
			int rand2 = 1 + randomNumbers.nextInt(9);
			
			
			genQue(rand1,rand2);
			int rann = rand1 * rand2;
			
			int user = input.nextInt();
			
			if(rann == user) {
				
				System.out.print(getCorrect(count));
				count++;
			} else {
				
				while(rann != user) {
					System.out.print(getWrong());
					user = input.nextInt();
					if(rann == user) {
						System.out.print(getCorrect(count));
						System.out.println();
						
					}
				}
				
			}
			
			
			}
			double percent  = (double)count / 10;
			if(percent >= 0.75){
				myStat = Student.CORRECT;
				System.out.print("Congratulations, you are ready to go to the next level.");
			}
			else if(percent < 0.75) {
				myStat = Student.WRONG;
				System.out.print("Please, ask your teacher for extra help.");
			}
			System.out.print("Enter 1 to continue: ");
			flag = input.nextInt();
			}
			}
			

		public static void genQue(int num1, int num2) {

			System.out.print("How much is " + num1 + " multiply by " + num2);

		}

		public static String getCorrect(int count) {
			count = 0;
			int generateCorrect =1 + randomNumbers.nextInt(4);
			String correct = "";
			switch(generateCorrect) {
				case 1:
					correct = "Very good";
					count++;
					break;
				case 2:
					correct = "Excellent";
					count++;
					break;
				case 3:
					correct = "Keep up the good work";
					count++;
					break;
				case 4:
					correct = "Nice work";
					count++;
			}
			return correct;
		}
		
		public static String getWrong() {
			
			int generateWrong =1 + randomNumbers.nextInt(4);
			String wrong = "";
			switch(generateWrong) {
				case 1:
					wrong = "No. Please try again";
					break;
				case 2:
					wrong = "Wrong, once more";
					break;
				case 3:
					wrong = "Don't give up";
					break;
				case 4:
					wrong = "No. keep trying.";
			}
			return wrong;
		}
		public static void getPercent(int count) {
			
			double percent  = (double)count / 10;
			if(percent >= 0.75){
				System.out.print("Congratulations, you are ready to go to the next level.");
			}
			else if(percent < 0.75) {
				System.out.print("Please, ask your teacher for extra help.");
			}
			//return percent;
		}
}
