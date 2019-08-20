package chapter8;

import java.util.Scanner;

public class ComplexTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first real number: ");
		double firstReal = input.nextDouble();
		
		System.out.print("Enter first imaginary number: ");
		double firstImaginary = input.nextDouble();
		
		System.out.print("Enter second real number: ");
		double secondReal = input.nextDouble();
		
		System.out.print("Enter second imaginary number: ");
		double secondImaginary = input.nextDouble();
		
		Complex complex = new Complex(firstReal,firstImaginary,secondReal,secondImaginary);
		
		System.out.printf("The complex number result for "
				+ "the sum of real numbers %.2f + %.2f and \nimaginary numbers \n%.2f + %.2f = %s%n", firstReal,secondReal, firstImaginary, secondImaginary,complex.toStringAdd());
		
		System.out.printf("%nThe complex number result for "
				+ "the subtraction of real numbers %.2f - %.2f \nand imaginary numbers \n%.2f - %.2f = %s", firstReal,secondReal, firstImaginary, secondImaginary,complex.toStringSubtract());
	}

}
