package chapter6Exercises;

import java.util.Scanner;

public class ReversingDigits {
	
//	(Reversing Digits) Write a method that takes an integer value and returns the number with
//	its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
//	the method into an application that reads a value from the user and displays the result.
//	6.27 (Greatest Common Divisor) The greatest common divisor (GCD) of two integers is the largest
	
	
	public static void reverseDigit() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input Nuumber");
		int number= input.nextInt();
		
		ReversingDigits.reverseDigit(number);
		
		input.close();
	}
	
	public static void reverseDigit(int number) {
		
		int digit1= number%10;
		int divisor = number/10;
		int digit2 = divisor%10;
		int divisor2 = divisor/10;
		int digit3 = divisor2%10;
		int digit4= divisor2/10;
		System.out.printf("%d%d%d%d",digit1,digit2, digit3, digit4);
		
	}

}
