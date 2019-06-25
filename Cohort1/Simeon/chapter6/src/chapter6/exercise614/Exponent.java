package chapter6.exercise614;

import java.util.Scanner;

public class Exponent {

	public static int integerPower() {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter base number: ");
		int base = input.nextInt();
		
		System.out.print("Enter exponent: ");
		int exponent = input.nextInt();
		
		int result = 1;
		
		for (int i = 1; i <= exponent; i++)
			result *= base;
		
		return result;
	}
	
}
