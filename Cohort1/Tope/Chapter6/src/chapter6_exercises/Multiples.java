package chapter6_exercises;

import java.util.Scanner;

public class Multiples {
//Program to determine if a value is a multiple of the other
//Exercise 6.16
//Written by Oyemade Temitope
//20th of June 2019
	

	public static boolean isMultiple(int num1, int num2) {
		boolean status;
		
		if(num1 % num2 == 0)
			status = true;
		else
			status = false;
		
		return status;
	}
	
		
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter numbers two seperate integers");
		Scanner input = new Scanner(System.in);
		int counter =1;
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println(isMultiple(num1, num2));
		
		while(counter<= 10) {
			num1 = input.nextInt();
			num2 = input.nextInt();
			System.out.println(isMultiple(num1, num2));
				
			counter++;
		}
		input.close();

	}

}
