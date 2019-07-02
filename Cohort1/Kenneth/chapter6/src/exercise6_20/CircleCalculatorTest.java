/**
 * 
 */
package exercise6_20;

import java.util.Scanner;

/**
 * @author ken_granero
 *
 */
public class CircleCalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = insert.nextDouble();
		
		System.out.println("The area od the circle is " +CircleCalculator.calculateRadius(radius));
		
		insert.close();

	}

}
