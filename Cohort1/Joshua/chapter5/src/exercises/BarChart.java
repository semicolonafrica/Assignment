/**
 * 
 */
package exercises;

/**Exercise 5.16
 * @author Group 2(Me and Christian)
 *
 */

import java.util.Scanner;
public class BarChart {

	/**
	 * @param args
	 */
	public void displayBarChart() {
		Scanner input = new Scanner(System.in);
		
		int counter = 30;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		
		
		
		
		System.out.println("Enter 5 numbers(from 1 - 30) here: ");
		if(num1 <= 30) {
		num1 = input.nextInt();
		}
		
		if(num2 <= 30) {
		num2 = input.nextInt();
		}
		else {
			System.out.println("Enter valid number");
		}
		
		if(num1 <= 30) {
		num3 = input.nextInt();
		}
		
		if(num1 <= 30) {
		num4 = input.nextInt();
		}
		
		if(num1 <= 30) {
		num5 = input.nextInt();
		}
		
		
			
		
		for(counter = 1; counter <= num1; counter++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		
		for(counter = 1; counter <= num2; counter++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		
		
		for(counter = 1; counter <= num3; counter++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		
		for(counter = 1; counter <= num4; counter++) {
			System.out.print("*");
		}
			System.out.println();
			
			
			
		for(counter = 1; counter <= num5; counter++) {
			System.out.print("*");
		}
		System.out.println();
		
		
	}// end method displayBarChart

}//end class BarChart
