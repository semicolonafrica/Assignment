package chapter7.exercises;

import java.util.Arrays;
//Another way of finding prime numbers using Sieve of Eratosthenes
//20th of July 2019
//Program written by Oyemade Temitope
//Exercise 7.27


public class SieveOfEratosthenes {

	public static void sieveOfEratosthenes() {
	
		boolean[] sieve = new boolean[1000];
		
		Arrays.fill(sieve, true);

			for(int i = 2; i< sieve.length;  i++) {
					
				for(int v = i ; v< sieve.length;) {
				
				v=v+i;
				
				if(v < sieve.length)
				sieve[v ] = false;
					
				}
		}
			
	
		for(int t = 2; t < sieve.length; t++) {
			
			if(sieve[t] == true)
			System.out.printf("%d %n", t);
			
			
		}
		

	}


	
	
	public static void main(String[] args) {
	
		sieveOfEratosthenes();	
		
	}
	
}
