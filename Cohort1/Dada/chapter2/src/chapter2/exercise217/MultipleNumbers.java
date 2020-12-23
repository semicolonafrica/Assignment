package chapter2.exercise217;

import java.util.Scanner;
public class MultipleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int number3;
		int sum;
		int product;
		int average;
		
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		
		sum = number1 + number2 + number3;
		
		product = number1 * number2 * number3;
		
		average = (number1 + number2 + number3) / 3;
		
		System.out.printf("Sum is %d ", sum);
		System.out.printf("Product is %d ", product);
		System.out.printf("Average is %d ", average);
		
		if(number1 > number2)
			System.out.printf("%d%n", args)
		
		
		
		
		

	}

}
