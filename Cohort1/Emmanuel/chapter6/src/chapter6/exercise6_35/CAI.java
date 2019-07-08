/**
 * 
 */
package chapter6.exercise6_35;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
	public class CAI {
		
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
				
				System.out.print("Very good.");
				
			} else {
			
				
				while(rann != user) {
					System.out.print("No.please, try again!");
					user = input.nextInt();
					if(rann == user) {
						System.out.print("Very good!");
						System.out.println();
						break;
					}
				}
				
			}
			}
			
			
		}

		public static void genQue(int num1, int num2) {
			//int getans = 0;
			System.out.print("How much is " + num1 + " multiply by " + num2);
			//getans = num1 * num2;
			//return getans;
		}

}
