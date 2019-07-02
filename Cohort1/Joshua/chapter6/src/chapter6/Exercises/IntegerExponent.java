/**
 * 
 */
package chapter6.Exercises;

/**Exercise 6.14
 * @author Group 1 ( Me and Emmanuel)
 *
 */
import java.util.Scanner;
public class IntegerExponent {
	Scanner input = new Scanner(System.in);

	int x;
	int y;
	int total = 1;
	public void integerPower() {
		System.out.println("Enter Number to raise to power:");
		x = input.nextInt();
		System.out.println("Enter  power");
		y = input.nextInt();
	for(int i = 1; i <= y; i++) {
		total *= x;
		
	}
	System.out.println("total is " + total);
	}
}
