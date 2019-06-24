package chapter6Exercises;

import java.util.Scanner;

public class ReversingDigits {
	
//	(Reversing Digits) Write a method that takes an integer value and returns the number with
//	its digits reversed. For example, given the number 7631, the method should return 1367. Incorporate
//	the method into an application that reads a value from the user and displays the result.

		public static void reverseDigit() {
		Scanner input = new Scanner(System.in);
		int number =1;
		
		while(number !=0) {
		System.out.println("Input number to reverse");
		number= input.nextInt();
		
		if (number == 0) {
			System.out.println("End of session!");
			break;
		}
		System.out.println("The reverse of " + number + " is: " + ReversingDigits.reverseDigit(number));
		System.out.println();
	}
		input.close();
		
//		}
	}
	
	public static int  reverseDigit(int number) {
		int reverse = 0;
		while (number !=-0) {
			
			reverse = reverse * 10;
			reverse = reverse + number%10;
			
			number/=10;
		}
		return reverse;
		
	}

}
