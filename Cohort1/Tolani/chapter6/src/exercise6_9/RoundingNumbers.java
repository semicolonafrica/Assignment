/**
 * 
 */
package exercise6_9;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class RoundingNumbers {
	
	public static void printNumbers() {
		
		Scanner insert = new Scanner(System.in);
		double x = 0;
		System.out.print("Enter value of x or -1 to end: ");
		x = insert.nextDouble();
		
		double y ;
		
		while(x != -1) {
			
			System.out.println("The original number is : " + x);
			y = Math.floor(x + 0.5);
			System.out.println("The rounded number is : " + y);
			
			System.out.println("Enter value x or -1 to end: ");
			x = insert.nextDouble();
			
		}
		insert.close();
	}

}
