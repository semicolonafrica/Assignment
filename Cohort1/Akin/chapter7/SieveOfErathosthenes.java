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
			if(predicate[i] == true) {
			for(int j = i + 1; j < predicate.length; j++) {
				if(j % i == 0) {
					predicate[j] = false;
				}
			}
			}
		}
		
		for(int i = 2; i < predicate.length; i++) {


			if(predicate[i] == true) {

				System.out.printf("%d ", i);
				if(i % 6 == 0) {
					System.out.println();
				}
			}

		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		isPrime();
	}
	
}
