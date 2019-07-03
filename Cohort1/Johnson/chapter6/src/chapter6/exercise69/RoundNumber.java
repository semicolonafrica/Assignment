package chapter6.exercise69;

import java.util.Scanner;
public class RoundNumber {
	public static void roundNum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number you want to round-up: ");
		double number = input.nextDouble();
		//double y = Math.floor(number + 0.5);
		int y = (int)(Math.floor(number + 0.5));
		System.out.println("The original number is: " + number);
		System.out.println("The rounded value is: " + y);
	}
	public static void main(String[] args) {
		roundNum();
	}
}
