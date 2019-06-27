package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LEMON
 *
 */
public class Exponentiation {

	public int integerPower() {
		// TODO Auto-generated method stub

		Scanner ops = new Scanner(System.in);
		
//		for(int j=1; j>0; j++) {

		System.out.println("Enter baseValue: ");
		int value = ops.nextInt();

		System.out.println("Enter Exponential Value: ");
		int exponent = ops.nextInt();

		int value1 =1;
		for(int i=1; i<=exponent; i++) {

			value1 = value1 *value;
		}
		return value1;
	}
	public static void main(String[] args) {
		Exponentiation lem = new Exponentiation();

		System.out.println(lem.integerPower());
	}
}