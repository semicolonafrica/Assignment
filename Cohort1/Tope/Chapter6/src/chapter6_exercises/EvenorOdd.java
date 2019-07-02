package chapter6_exercises;

import java.util.Scanner;

public class EvenorOdd {
//Exercise 6.17
//Program to determine if a number is Even or Odd
//Program written by Oyemade Temitope
//20th of June 2019
	
	
	public  static boolean isEven(int number) {
		boolean status;
		
		if(number % 2 == 0)
			status = true;
		else
			status = false;
		
		return status;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how numbers you want to compare");
		int numberOfTimes = input.nextInt();
		int counter = 1;
		int number;
		
		while(counter <= numberOfTimes) {
			
			System.out.println("Enter number ");
			number = input.nextInt();
			System.out.println(isEven(number));
			
			counter++;
		}
		input.close();
		

	}

}
