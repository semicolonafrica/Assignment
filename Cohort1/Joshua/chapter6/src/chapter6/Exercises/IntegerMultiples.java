/**
 * 
 */
package chapter6.Exercises;

import java.util.Scanner;

/** Exercise 6.16(Assignment)
 * @author user
 *
 */
public class IntegerMultiples {
	Scanner input = new Scanner(System.in);
	
	
	
	
	public void isMultiple() {
		
		System.out.println("Enter x: ");
		int x = input.nextInt();
		System.out.println("Enter y: ");
		int y = input.nextInt();
		
		if( x % y == 0 ) {
			System.out.printf("true");
			//return true;
		}
		else {
			//return false;
			System.out.printf("false");
		}
	}

}
