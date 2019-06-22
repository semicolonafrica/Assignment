package chapter6Exercises;

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
//	6.26 (Reversing Digits) Write a method that takes an
	
	public static int  findPrimeNumber(int number) {
		
		int primeNumber = 0;
		for (int counter =1; counter <= number;counter ++) {
			
			if(number %1!=0 && number%counter!=0) {
				primeNumber = counter;
				System.out.println(primeNumber);
			}
		}
		return primeNumber;
		
	}

}
