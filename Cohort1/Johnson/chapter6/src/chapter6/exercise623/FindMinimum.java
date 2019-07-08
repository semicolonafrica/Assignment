package chapter6.exercise623;

import java.util.Scanner;
public class FindMinimum {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("The minimum number is: " + minimumNumber());
	}
	
	//static Scanner input = new Scanner(System.in);
	public static double minimumNumber() {
		System.out.println("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double min = Math.min(number1, Math.min(number2, number3));
		return min;
	}
}
