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
public class ComputerAssistedInstruction {
	public static SecureRandom randomNumber = new SecureRandom(); 
	public static int store;
	public static int number;
	
	static int x = 1+ randomNumber.nextInt(10);
	static int y =1 + randomNumber.nextInt(10);
	
	public static void multiplication(int x, int y) {
		int num1 = 0;
		int num2 = 0;
		int answer = 0;
		Scanner input = new Scanner(System.in);
		
	
		
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
				//generateQuestions(x,y);
			}
			
		}
		
	}
	
	public static int generateQuestions(int x,int y) {
		
		multiplication(x, y);
		
		int raaa = 1 + randomNumber.nextInt(5);
		
		String quest = "";
		int ans = 0;
		
		switch(raaa) {
			case 1:
				quest =  ("What is the multiplication of " + x +" and "+ y);
				ans = x * y;
			case 2:
				quest = ("What is the multiplication of " + x +" and "+ y);
				ans = x * y;
			case 3:
				quest =  ("What is the multiplication of " + x +" and "+ y);
				ans = x * y;
			case 4:
				quest = ("What is the multiplication of " + x +" and "+ y);
				ans = x * y;
			case 5:
				quest = ("What is the multiplication of " + x +" and "+ y);
				ans = x * y;
				
		}
		return ans;
	}


}
