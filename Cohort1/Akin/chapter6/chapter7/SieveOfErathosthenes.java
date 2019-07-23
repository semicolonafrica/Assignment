package chapter7;

import java.util.Random;

public class SieveOfErathosthenes {

	public static Random random = new Random();
	public static boolean[] predicate = new boolean[1000];
	public static void isPrime() {
		
		for(int i = 0; i < predicate.length; i++) {
			predicate[i] = true;
		}
		
		for(int i = 2; i < predicate.length; i++) {
			for(int j = i + 1; i < predicate.length; j++) {
				if(j % i == 0) {
					predicate[j] = false;
				}
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		//calculatePrime();
	}
	
}
