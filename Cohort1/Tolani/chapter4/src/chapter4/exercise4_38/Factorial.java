/**
 * 
 */
package chapter4.exercise4_38;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number = input.nextInt();
		
		int counter = 1;
		int x = 1;
		int factorial=1;
				
		while(counter < number) {
			x = (number - counter)*x;
			
			
			counter++;
		}
		
		factorial = number * x;
				
		System.out.print(number + " Factorial is: " + factorial);
		
		input.close();
	}

}
