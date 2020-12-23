package exercise6_23;

import java.util.Scanner;

public class MinimumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter third number: ");
		int num3 = input.nextInt();
		
		System.out.println(Minimum.findMinimum3(num1, num2, num3));
		
		input.close();
	}

}
