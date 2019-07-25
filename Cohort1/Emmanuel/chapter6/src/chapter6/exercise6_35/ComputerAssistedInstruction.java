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
	//public static int store;
	//public static int number;
	
//	static int x = 1+ randomNumber.nextInt(10);
//	static int y =1 + randomNumber.nextInt(10);
	
	public static void multiplication() {
		
		 
		
		int answer = 0;
		Scanner input = new Scanner(System.in);
		
	
		for(int i = 1; i <=10; i++) {
			
			int x = 1+ randomNumber.nextInt(9);
			 int y =1 + randomNumber.nextInt(9);
		 
			
		 
		 generateQuestions(x,y);
		 int store = x * y;
		answer = input.nextInt();
		 if(answer == store) {
				System.out.printf("\"Congratulatiom\"");
			
			}else
		      while (answer != store ) {
					System.out.printf("\"No. Please try again.\"");
					answer = input.nextInt();
					if(answer == store) {
						System.out.printf("\"Congratulatiom\"");
				
			}
			
		}
		
	}
	}
	
	public static void generateQuestions(int num1,int num2) {
		
		System.out.print("What is the multiplication of " + num1 +" and "+ num2);
		
//		multiplication(x, y);
//		
//		int raaa = 1 + randomNumber.nextInt(5);
//		
//		String quest = "";
//		int ans = 0;
//		
//		switch(raaa) {
//			case 1:
//				quest =  ("What is the multiplication of " + x +" and "+ y);
//				ans = x * y;
//			case 2:
//				quest = ("What is the multiplication of " + x +" and "+ y);
//				ans = x * y;
//			case 3:
//				quest =  ("What is the multiplication of " + x +" and "+ y);
//				ans = x * y;
//			case 4:
//				quest = ("What is the multiplication of " + x +" and "+ y);
//				ans = x * y;
//			case 5:
//				quest = ("What is the multiplication of " + x +" and "+ y);
//				ans = x * y;
//				
//		}
		//return ans;
	}


}
