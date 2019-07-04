package chapter7.exercises;

import java.util.Scanner;

//Exercise 7.14
//Program written by Oyemade Temitope
//3rd of July 2019

public class VariableLengthArgumentList {

	
	public static int variableLengthArgument(int... number) {
		
		int product =1;
		
		for(int i = 0; i< number.length; i++) {
			
			product = product * number[i];
		}
		return product;
		
	} 
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of number you want to input");
		int numberOfTimes = input.nextInt();
		int number = 0;
		
		int[] array = new int[numberOfTimes];
		
		
		System.out.println("Enter Numbers");
		
		for(int i = 0; i< array.length; i++) {
			number = input.nextInt();
			array[i] = number;
		}
		
		System.out.println(variableLengthArgument(array));
		
		input.close();
		
	}

}
