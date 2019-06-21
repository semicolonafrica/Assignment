/**
 * 
 */
package chapter6;

/**
 * @author gbemi
 *
 */

import java.util.Scanner;

public class Exponentiation {

	
	public static void integerPower() {
		// TODO Auto-generated method stub

		Scanner ops = new Scanner(System.in);

		System.out.println("Enter baseValue: ");
		int value = ops.nextInt();

		System.out.println("Enter Exponential Value: ");
		int exponent = ops.nextInt();

		int value1 =1;
		for(int i=1; i<=exponent; i++) {

			value1 = value1 *value;
		}

		System.out.println( value1);
	}


	public static void main(String[] args) {
		

		integerPower();
	}
}
