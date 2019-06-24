package chapter6Exercises;

import java.util.Scanner;

public class PrimeNumbers {
//	Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
//	2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
//	a) Write a method that determines whether a number is prime.
//	b) Use this method in an application that determines and displays all the prime numbers
//	less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
//	you’ve found all the primes?
//	c) Initially, you might think that n/2 is the upper limit for which you must test to see
//	whether a number n is prime, but you need only go as high as the square root of n. Rewrite
//	the program, and run it both ways.
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