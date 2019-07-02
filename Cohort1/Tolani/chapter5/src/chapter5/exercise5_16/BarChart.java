/**
 * 
 */
package chapter5.exercise5_16;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class BarChart {
	
	public void drawBar(){
		   int num1, num2, num3, num4, num5;
		   
			   Scanner input = new Scanner(System.in);
		       System.out.println("Enter number between 1 - 30, enetr 6 to exit: ");
		       num1 = input.nextInt();
		       num2 = input.nextInt();
		       num3 = input.nextInt();
		       num4 = input.nextInt();
		       num5 = input.nextInt();
		                          	
		         
		         for(int counter = 1; counter <= num1; counter++) 
		         {
		            System.out.print("*");
		         }
		         System.out.println();
		         for(int counter = 1; counter <= num2; counter++)
		         {
		            System.out.print("*");
		         }
		         System.out.println();
		         for(int counter = 1; counter <= num3; counter++) 
		         {
		            System.out.print("*");
		         }
		         System.out.println();
		         for(int counter = 1; counter <= num4; counter++)
		         {
		            System.out.print("*");
		         }
		         System.out.println();
		         for(int counter = 1; counter <= num5; counter++) 
		         {
		            System.out.print("*");
		         }

}

}
	