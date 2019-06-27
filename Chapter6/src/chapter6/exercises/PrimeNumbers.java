
package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LEMON
 *
 */
public class PrimeNumbers {

	public static boolean isPrime(int number) {
		int primeCheck = 0;
		boolean checkPrime = false;

		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				primeCheck++;
			}
		}

		if (primeCheck >2 ) {
			checkPrime = false;
		}
		else {
			checkPrime = true;
		}

		return checkPrime;
	}
	public static int displayPrimeNumbers() {
		int result = 0;
		
		Scanner ops = new Scanner(System.in);
		
		
		System.out.println("Enter Number to check");
		int numb = ops.nextInt();

		for (int i = 2; i <= numb; i++) {
			if (isPrime(i) == true)
				System.out.println(result = i);
		}
		return numb;
	}

	public static void main(String[] args) {
		System.out.println("These are Prime numbers from 1 to "+   displayPrimeNumbers());
	}

}