package chapter7.exercises;

import java.util.Arrays;
import java.util.Scanner;

//Exercise 7.12
//Program written by Oyemade Temitope
//2nd of July 2019

public class DuplicateElimination {
	
	
	
	public static boolean searchArray(int[] array, int number) {
		
		boolean status = false;
		
		for(int i =0; i < array.length; i++) {
			
			if(array[i] == number)
				status = true;		
		}
		
		return status;
		
	}
	
	
	
	
	public static void duplicateArray() {
		
		int[] myArray = new int[5];
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		System.out.println("Enter number");
		
		for(int i =0; i<myArray.length; i++) {
			
			number = input.nextInt();
			System.out.println(number);
			
			myArray[i] = number;
			
			number = input.nextInt();
			
			if((searchArray(myArray, number) == false))
				System.out.println(number);
			
//			else
//				System.out.println();
				
				
			
		
		}
				
		input.close();
		
		
	}

	
	
	public static void main(String[] args) {
		
		duplicateArray();
	
	}

}
