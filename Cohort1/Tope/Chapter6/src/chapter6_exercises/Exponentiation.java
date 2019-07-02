package chapter6_exercises;

import java.util.Scanner;

//Program to calculate the exponential of a value
////Excercise 6.11
//Written by Oyemade Temitope
//6th of June 2019
public class Exponentiation {
	
	public static int integerPower(int base, int exponent) {
		int power = 1;
		for(int i =1; i<=exponent; i++)
			power = power * base;
		return power;	
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = input.nextInt();
		System.out.println("Enter the exponent");
		int exponent = input.nextInt();
		
		System.out.println("The power is: " + integerPower(base, exponent) );
		input.close();
		
	}
	

}
