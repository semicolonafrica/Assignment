/**
 * 
 */
package chapter5.exercise5_16;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Astericks {

	/**
	 * @param args
	 */
	public void asterik() {
		
	}
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter number between 1 - 30: ");
		
		 int number = 1;
		for(int counter = 1; counter <= 5; counter++) {
			number = input.nextInt();
			
			for(int i = 1; i <=number; i++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
