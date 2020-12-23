package chapter6_exercises;

import java.util.Scanner;

//Program to calculate the Greatest Common Divisor of two values
//Written by Oyemade Temitope
//Exercise 6.27
//22nd of June 2019
public class GreatestCommonDivisor {
	
	public static int greatestCommonDivisor(int value1, int value2) {
		
		int gcdValue = 0;
		int multiple1= 0;
		int multiple2 =0;
		int counter = Math.min(value1, value2);
		
		for(int i =1; i<counter; i++) {
			
			if((value1 % i == 0) && (value2 % i == 0))
			multiple1 = i;
				multiple2 = i;
			
			if(multiple1 == multiple2) {
				gcdValue = multiple1; 
			}
			
		}
	
		return gcdValue;
	}

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the two numbers");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			
			System.out.printf("%s%d", "G.C.D = ", greatestCommonDivisor(num1, num2));
			
			input.close();
	}

}
