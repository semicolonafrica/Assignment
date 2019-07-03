/**
 * 
 */
package chapter6.exercise6_36;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
	public class CAIModified {
		
		public static SecureRandom randomNumbers = new SecureRandom();
		public static Scanner input = new Scanner(System.in);
		public static void multiply() {
		
			for(int i = 1; i <= 10; i++) {
			int rand1 = 1 + randomNumbers.nextInt(9);
			int rand2 = 1 + randomNumbers.nextInt(9);
			
			
			genQue(rand1,rand2);
			int rann = rand1 * rand2;
			
			int user = input.nextInt();
			
			if(rann == user) {
				
				System.out.print(getCorrect());
				
			} else {
			
				
				while(rann != user) {
					System.out.print(getWrong());
					user = input.nextInt();
					if(rann == user) {
						System.out.print(getCorrect());
						System.out.println();
						break;
					}
				}
				
			}
			}
			
			
		}

		public static void genQue(int num1, int num2) {

			System.out.print("How much is " + num1 + " multiply by " + num2);

		}

		public static String getCorrect() {
			
			int generateCorrect =1 + randomNumbers.nextInt(4);
			String correct = "";
			switch(generateCorrect) {
				case 1:
					correct = "Very good";
					break;
				case 2:
					correct = "Excellent";
					break;
				case 3:
					correct = "Keep up the good work";
					break;
				case 4:
					correct = "Nice work";
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
}
