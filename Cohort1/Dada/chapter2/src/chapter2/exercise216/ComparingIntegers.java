package chapter2.exercise216;

import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
//		int largerNumber;
//		int lesserNumber;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		if (number1 == number2)
			System.out.printf("%d and %d These numbers are equal", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d is larger", number1);
		
		if (number1 < number2)
			System.out.printf("%d is larger", number2);
		
		input.close();

	}

}
