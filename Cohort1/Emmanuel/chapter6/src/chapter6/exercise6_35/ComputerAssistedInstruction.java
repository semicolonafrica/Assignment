/**
 * 
 */
package chapter6.exercise6_35;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author USER
 *
 */
public class ComputerAssistedInstruction {
	static SecureRandom randomNumber = new SecureRandom(); 
	static int store;
	static int number;
	
	public static void multiplication() {
		int num1 = 0;
		int num2 = 0;
		int answer = 0;
		Scanner input = new Scanner(System.in);
		
		int x = 1+ randomNumber.nextInt(9);
		int y =1 + randomNumber.nextInt(9);
		
		 store = x * y;
		 
		 
		 System.out.println("What is the multiplication of " + x +" and "+ y);
		
		while (answer != store ) {
			
			
			 answer = input.nextInt();
			
			if(answer != store) {
				System.out.printf("\"No. Please try again.\"");
				System.out.println();
				
			}
			else if(answer == store) {
				System.out.printf("\"Congratulatiom\"");
			}
			
		}
		
	}


}
