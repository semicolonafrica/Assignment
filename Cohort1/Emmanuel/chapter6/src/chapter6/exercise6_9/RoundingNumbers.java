/**
 * 
 */
package chapter6.exercise6_9;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class RoundingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter =1;
		 Scanner input = new Scanner(System.in);
		 
		 int number = input.nextInt();
		 SecureRandom random = new SecureRandom();
		int test = random.nextInt(10);
		System.out.println(test);
		 
		 while(counter <= number) {
			 System.out.println("Enter x: ");
			 System.out.println();
			 double x = input.nextDouble();
			 
			 System.out.println("Original value of x is: " + x);
			 double y = Math.floor(x + 0.5);
			 System.out.println("Rounded value of x is: " + y);
			 
			 counter++;
		 }

	}

}
