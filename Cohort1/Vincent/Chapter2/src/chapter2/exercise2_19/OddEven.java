package chapter2.exercise2_19;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number");
		int number1 = input.nextInt();
		System.out.println("enter number");
		int number2 = input.nextInt();
		
		int modulus = number1 % number2;
		System.out.printf("modulus is: %d", modulus);
		
		System.out.println();
		if(modulus > 0)
			System.out.println("it is odd number");
		if(modulus == 0)
			System.out.println("it is an even number");

	}

}
