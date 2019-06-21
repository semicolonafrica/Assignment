package exercise6._23;

import java.util.Scanner;

public class MinimumNumberTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first digit: ");
		double first = input.nextDouble();
		
		System.out.printf("%nEnter second digit: ");
		double second = input.nextDouble();
		
		System.out.printf("%nEnter third digit: ");
		double third = input.nextDouble();
		
		System.out.printf("%nThe smallest of %.1f, %.1f, and %.1f is: %.2f", first, second, third, 
				MinimumNumber.minimum3(first, second, third));

	}

}
