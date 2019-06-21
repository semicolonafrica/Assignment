package chapter6Exercises;

import java.util.Scanner;

public class EvenOrOddNumber{
	
	public static int isEven() {
		
		Scanner input = new Scanner(System.in);
		int number = 1;
		while (number !=0) {
		System.out.println("Enter number");
		number = input.nextInt();
		
		EvenOrOddNumber.isEven(number);
		}
		input.close();
		return number;
	}
	public static void isEven(int number) {
		
		if(number % 2 ==0) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}