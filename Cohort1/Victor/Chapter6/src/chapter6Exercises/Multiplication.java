package chapter6Exercises;

import java.util.Scanner;

public class Multiplication {
	
	public static void isMultiples() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer");
		int firstInteger = input.nextInt();
		
		System.out.println("Enter second integer");
		int secondInteger = input.nextInt();
		
		Multiplication.isMultiple(firstInteger, secondInteger);
		input.close();
		
	}
	
	public static void isMultiple(int firstInteger, int secondInteger) {
		
		if(secondInteger % firstInteger==0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}	
	}
}

