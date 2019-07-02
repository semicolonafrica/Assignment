package chapter6Exercises;

import java.util.Scanner;

public class PrimeNumbers {

	public static void isPrime() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number between 1 - 1000 ");
			int number = input.nextInt();
			
		System.out.println("Prime Numbers between 1 and "+ number+ " are:");
		for(int counter =1; counter <= number; counter ++)
			if(isPrime(counter)==true)
			System.out.printf("%d%n", counter);
		input.close();
		}
	
	public static boolean  isPrime(int number) {	
//		int largest = (int) Math.sqrt(number);
		if (number <2)
			return false;
		for(int counter=2; counter <= number/2; counter++){
			if (number%counter ==0 )
				return false;				
	}
		return true;
	}
}