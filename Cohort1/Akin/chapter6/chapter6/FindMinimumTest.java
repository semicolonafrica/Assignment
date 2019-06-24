package chapter6;

import java.util.Scanner;

public class FindMinimumTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three number: ");
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		
		System.out.printf("The lowest between the %d,%d and %d: %d",first,second,third,FindMinimum.calcMin(first, second, third));
		
		input.close();

	}

}
