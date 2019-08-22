package chapter2.exercise2_18;

import java.util.Scanner;

public class LargSmall {

	public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		
		System.out.println("enter number");
		number1 = input.nextInt();
		System.out.println("enter number");
		number2 = input.nextInt();
		System.out.println("enter number");
		number3 = input.nextInt();
		System.out.println("enter number");
		number4 = input.nextInt();
		System.out.println("enter number");
		number5 = input.nextInt();
		int largest = Math.max(number1,Math.max(number2,Math.max(number3, Math.max(number4, number5))));
		int smallest = Math.min(number1,Math.min(number2,Math.min(number3, Math.min(number4, number5))));
	
			System.out.printf("largest number is: %d%nsmallest number is: %d", largest, smallest);
	}

}
