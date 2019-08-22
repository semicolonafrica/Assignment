package chapter2.exercise2_16;

import java.util.Scanner;

public class CompareInt {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("enter number");
		number1 = input.nextInt();
		System.out.println("enter number");
		number2 = input.nextInt();
		
		if(number1 > number2 || number2 > number1)
			System.out.println("A number larger");
		if(number1 == number2 || number2 == number1)
			System.out.println("Both numbers are equal");
		
		
	}

}
