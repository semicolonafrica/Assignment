package chapter6_exercises;

import java.util.Scanner;

public class SeperatingDigits {
//Program to seperate Integers from range 1 - 99999
//Exercise 6.21
//Program written by Oyemade Temitope
//20th of June 2019
	
	public static int integerPart(int a, int b) {
		int output = a / b;
		
		return output;
	}
	
	public static int remainderPart(int a, int b) {
		int output = a % b ;
		
		return output;
	}
	
	
	public static String displayDigit(int digit) {
		String equivalent = " ";
		
		
		if(digit <1 || digit > 99999)
			throw new IllegalArgumentException("Enter value that is within 1 - 99999");
		
		if(digit <10)
			equivalent = String.format("%d", digit);
		
		if(digit >9 && digit <100) {
			
			int value1 = digit /10;
			int value2 = digit % 10;

			equivalent = String.format("%d %d  ", value1 ,value2);
			
			}
		
		if(digit >99 && digit < 1000) {
			int value1 = digit / 100;
			int remainder = digit % 100;
			int value2 = remainder / 10;
			int value3 = remainder % 10;
			
			equivalent = String.format("%d %d %d ", value1 ,value2, value3);
				
		}
		
		if(digit > 999 && digit < 10000) {
			int value1 = digit / 1000;
			int remainder = digit % 1000;
			int value2 = remainder / 100;
			remainder = remainder %100;
			int value3 = remainder / 10;
			int value4 = remainder %10;
			
			equivalent = String.format("%d %d %d %d", value1 ,value2, value3, value4);
		}
		
		if(digit >9999 && digit < 100000) {
			int value1 = digit / 10000;
			int remainder = digit % 10000;
			int value2 = remainder /  1000;
			remainder = remainder % 1000;
			int value3 = remainder /100;
			remainder = remainder %100;
			int value4 = remainder / 10;
			int value5 = remainder % 10;
			
			equivalent = String.format("%d %d %d %d %d", value1, value2, value3, value4, value5);
			
		}
				
		return equivalent;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input number");
		int number = input.nextInt();
		
		System.out.println(displayDigit(number));
		input.close();
		
	}

}
