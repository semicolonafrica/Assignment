package chapter6Exercises;

import java.util.Scanner;

public class PerfectNumber {
	
	public static boolean isPerfect() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = input.nextInt();
		System.out.println();
		int factor;
		int sum = 0;
	
		for(int counter = 1; counter < number; counter++ ) {
			
			if(number % counter == 0 ) {
				factor = counter;
				System.out.println(factor);
				sum +=factor;	
				}
		}
		 
		System.out.println();
		System.out.println("The sum of the factors of the number is: "+sum);
		
		if (sum == number) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		input.close();
		return true;
		}
//	public static boolean getPerfectNumber() {
//		
//		
//	}
			
	}

