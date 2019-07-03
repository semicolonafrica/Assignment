package chapter6;

import java.util.Scanner;

public class GreatestCommonDivisorTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the two numbers: ");
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		
		System.out.printf("The greatest common divisor %nbetween %d and %d is %d",firstNumber,secondNumber,GreatestCommonDivisor.gcd(firstNumber,secondNumber));
		input.close();
	}

}
