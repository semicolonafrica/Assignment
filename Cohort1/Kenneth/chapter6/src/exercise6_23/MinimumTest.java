/**
 * 
 */
package exercise6_23;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class MinimumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner insert = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		double num1 = insert.nextDouble();
		double num2 = insert.nextDouble();
		double num3 = insert.nextDouble();
		
		System.out.println("The minimum is " +Minimum.checkMinimum(num1, num2, num3));
		
		insert.close();

	}

}
