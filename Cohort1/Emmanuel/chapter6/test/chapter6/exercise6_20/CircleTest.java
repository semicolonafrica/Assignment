/**
 * 
 */
package chapter6.exercise6_20;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class CircleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double r = input.nextDouble();
		
		System.out.println("Area of circle with radius " + r + " is "
				+ Circle.circleArea(r));

	}

}
