package chapter2.exercise2_20;

import java.util.Scanner;

//(Multiples) Write an application that reads two integers, determines whether the first is a
//multiple of the second and prints the result. [Hint: Use the remainder operator.]
public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter number");
		int number1 = input.nextInt();
		System.out.println("enter number");
		int number2 = input.nextInt();
		
		int remainder = number1 % number2;
		
		if(remainder == 0)
			System.out.println("number1 is multiple by the other");
		else
			System.out.println("number1 is not a multiple of the other");
		
	
	}

}
