package chapter6.exercise6_17;

import java.util.Scanner;

//Write a method isEven that uses the remainder
//operator (%) to determine whether an integer is even. The method should
//take an integer argument and return true if the integer is even and
//false otherwise. Incorporate this method into an application that inputs
//a sequence of integers (one at a time) and determines whether each is even
//or odd.

public class Even {
	
	public static int isEven(int num1 , int num2) {
		
		Scanner input = new Scanner(System.in);
		
		int total =0;
		
		System.out.println("enter num1 ");
		num1 = input.nextInt();
		System.out.println("enter num2 ");
		num2 = input.nextInt();
		
		total = num1 % num2;
		int result = total;
		
		if (result > 0.0) {
			System.out.println("it is an odd number  : false");
		}
		
		else 
			System.out.println(" it is an even number: true");
		
		
		input.close();
		return result;
				
	}
}






