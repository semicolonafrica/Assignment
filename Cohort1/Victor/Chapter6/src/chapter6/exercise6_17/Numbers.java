package chapter6.exercise6_17;

import java.util.Scanner;

public class Numbers {
	
	public static int isEven() {
		
		Scanner input = new Scanner(System.in);
		int number = 1;
		int counter = 1;
		while (number !=0) {
		System.out.println("Enter number");
		number = input.nextInt();
		
		Numbers.isEven(number);
		counter++;
		}
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
