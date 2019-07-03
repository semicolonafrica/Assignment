package chapter7.exercises;

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
		
		System.out.println("Enter number between 10 and 100");
		
		for(int i =0; i<myArray.length; i++) {
			
			number = input.nextInt();
			
			if(number < 10 || number > 100) {
				System.err.println("Enter number that is in range");
				break;
			}
				
			
			if(!(searchArray(myArray, number))) {
				System.out.println(number);
					
			myArray[i] = number;
			}
			
			for(int x : myArray) {
				
				if(x !=0)
				System.out.printf("%d ", x);
			}
	
		}
				
		input.close();
		
		System.out.println();
		
		for(int displayArray : myArray) {
			System.out.printf("%d ", displayArray);
			}
		
	}
		
	public static void main(String[] args) {
		
		duplicateArray();
	
	}

}
