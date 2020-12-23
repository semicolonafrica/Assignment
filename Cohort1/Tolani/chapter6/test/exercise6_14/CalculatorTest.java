package exercise6_14;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		System.out.println("Enter base number: ");
		int base = insert.nextInt();
		System.out.println("Enter exponent number: ");
		int exponent = insert.nextInt();
		
		Calculator power = new Calculator();
		System.out.println("The exponential is : "  + power.calculateNthPower(base,exponent));
		
//		System.out.println("Enter base number: ");
//		double basee = insert.nextDouble();
//		System.out.println("Enter exponent number: ");
//		double exponents = insert.nextDouble();
//
//		System.out.println("The exponential is : "  + power.calculateNthPower(basee,exponents));
		insert.close();
	}

}
