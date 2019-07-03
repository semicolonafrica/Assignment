/**
 * 
 */
package chapter4.exercise4_36;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class TriangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Triangle sides = new Triangle();
		
		System.out.println("Enter three sides: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		System.out.print(sides.checkSides(num1, num2, num3));

	}

}
