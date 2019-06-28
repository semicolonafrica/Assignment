/**
 * 
 */
package chapter6.exercise6_23;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class MinimumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Eneter num1: ");
		int num1 = input.nextInt();
		
		System.out.println("Eneter num2: ");
		int num2 = input.nextInt();
		
		System.out.println("Eneter num3: ");
		int num3 = input.nextInt();
		
		Minimum.calMinumum(num1, num2, num3);

	}

}
