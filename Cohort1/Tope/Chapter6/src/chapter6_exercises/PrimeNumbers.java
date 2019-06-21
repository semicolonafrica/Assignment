package chapter6_exercises;
//Program to determine if a number is prime or not
//Exercise 6.25
//Program written by Oyemade Temitope
//21st of June 2019

public class PrimeNumbers {
	
	public static boolean isPrime(int number) {
		int primeDeterminant = 0;
		boolean primeStatus =false;
		
		for(int i = 1; i <= number; i++) {
			
			if(number % i ==0)
				primeDeterminant++;
		}
		
		if(primeDeterminant > 2)
			primeStatus = false;
		else
			primeStatus = true;
		
		return primeStatus;
	}
	
	public static void  displayPrimeNumbers() {
		
		for(int i = 1; i<=100; i++) {
			
			if(isPrime(i) == true)
				System.out.println(i);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(isPrime(11));
			displayPrimeNumbers();
	}

}
