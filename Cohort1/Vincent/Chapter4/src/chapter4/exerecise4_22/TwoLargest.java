package chapter4.exerecise4_22;

import java.util.Scanner;

import chapter4.exercise4_21.SalesLargest;

public class TwoLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner input = new Scanner(System.in);
		int counter = 1;
		int largest = 0;
		int number = 0;
		int largest1 = 0;
		
		while(++counter <= 10) {
			System.out.println("Enter the number");
			number = input.nextInt();
//			
			if (number > largest) {
			   largest1 = largest;
				largest =number;
				
			}
			if (number < largest1) {
			
				if	(number > largest1) {
				largest1 = number;
				}
				
//		  largest1 = Math.max(number, largest);
		}
			
		}
		 
			System.out.printf("the largest number is:  %d another is %d", largest,largest1);
			
	}


	}


