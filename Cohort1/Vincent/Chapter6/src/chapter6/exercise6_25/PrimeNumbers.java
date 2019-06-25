package chapter6.exercise6_25;

import java.util.Scanner;
//A positive integer is prime if it’s divisible by only 1
//and itself. For example, 2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not.
//The number 1, by definition, is not prime.
//1. Write a method that determines whether a number is prime.
//2. Use this method in an application that determines and displays all
//the prime numbers less than 10,000. How many numbers up to
//10,000 do you have to test to ensure that you’ve found all the
//primes?
//3. Initially, you might think that n/2 is the upper limit for which you
//must test to see whether a number n is prime, but you need only
//go as high as the

public class PrimeNumbers {
	
	public static void findPrime() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("prime number from 1 to 1000");
		int n = input.nextInt();
		
		for(int count = 1; count <= n; count++) 
			if (calculatePrime(count) == true)
				System.out.println(count);
		
		
	}
	  
		public static boolean calculatePrime(int n) {
			
			if (n < 2) 
				return false;
				
			for(int counter = 2; counter <= n/2; counter++) {
						
			if(n% counter == 0)
				return false;
			}	
		 return true;
}
}




