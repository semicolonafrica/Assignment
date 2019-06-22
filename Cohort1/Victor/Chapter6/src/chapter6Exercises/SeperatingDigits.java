package chapter6Exercises;

import java.util.Scanner;

public class SeperatingDigits {
	
	public static void getDigits() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number between the range of 1 and 99,999");
		int number = input.nextInt();
		
		SeperatingDigits.getDigits(number);
	}
	
	public static void getDigits(int number) {
		int digit1 =0;
		int digit2 = 0;
		int digit3=0;
		int digit4=0;
		int digit5=0;
		int divisor = 10000;	
//		divisor /=10;	
		for (int counter =1; counter <= 5; counter++) {
			for (int counter1 =1; counter1 <= 5; counter1++) {
			digit1 = number/divisor;
			int remainder = number%divisor;
			digit2 = remainder/1000;
			int remainder2 = remainder%1000;
			digit3 = remainder2/100;
			int remainder3 = remainder2%100;
			digit4 = remainder3/10;
			digit5 = remainder3%10;
			}
		}
		System.out.printf("%d  %d  %d  %d  %d", digit1, digit2, digit3, digit4, digit5);
	}	
}
