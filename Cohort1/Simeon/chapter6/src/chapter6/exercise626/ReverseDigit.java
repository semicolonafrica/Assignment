package chapter6.exercise626;

import java.util.Scanner;

public class ReverseDigit {

	public static void reverse()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 4-digit number: ");
		int digits = input.nextInt();
		
		int digit1 = digits % 10;
		digits /= 10;
		int digit2 = digits % 10;
		digits /= 10;
		int digit3 = digits % 10;
		digits /= 10;
		int digit4 = digits % 10;
		
		
		
		String number = digit1 + "" + digit2 + "" + digit3 + "" + digit4;
		
		int rev = Integer.parseInt(number);
		
		System.out.println("Reverse of digits: " + rev);
		
		
		input.close();
	}
}
