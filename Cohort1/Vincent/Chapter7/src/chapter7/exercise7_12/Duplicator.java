package chapter7.exercise7_12;

//Use a one-dimensional array to solve the
//following problem: Write an application that inputs five numbers, each
//between 10 and 100, inclusive. As each number is read, display it only if
//it’s not a duplicate of a number already read. Provide for the “worst case,”
//in which all five numbers are different. Use the smallest possible array to
//solve this problem. Display the complete set of unique values input after
//the user enters each new value.

import java.util.Scanner;
public class Duplicator {
	
	
	public static boolean compareElements(int [] array, int value ) {
		
		for(int compare =0; compare < array.length; compare++) {
			if(array[compare] == value)
				return true;	
		}
		 
			return false;
 
	}

	public static int setlength()
	{
		Scanner input = new Scanner(System.in);
		int [] array = new int [5];
		int value = 0;
		for (int count = 0; count < array.length; count++) {
			
			System.out.println("enter number 1-100");
			value = input.nextInt();
			
		
			if (compareElements(array, value) == false)
				array[count] =value  ;
				
			for(int number : array)
				if(number != 0)
			System.out.println(number);
		}
		return 0;
	}
}
