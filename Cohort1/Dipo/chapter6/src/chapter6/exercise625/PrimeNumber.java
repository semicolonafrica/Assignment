package chapter6.exercise625;
import java.util.Scanner;
public class PrimeNumber {
	
	public static void isPrime() {
		
		Scanner input = new Scanner(System.in);
		
		String store = " Prime numbers from 1 to 10000";
		int counter = 1;
		for( counter = 1; counter <= 100; counter++)
		
			if(isprime(counter) == true)
				store += "\n" + counter;
		
		System.out.println(store);
	}
	
	
	public static boolean isprime( int n) {
		
		int max = (int) Math.sqrt(n);
		
		if(n < 2)
			return false;
		for(int count = 2; count <= n/2; count++) {
			if(n%count == 0)
				return false;
		}
		return true;
	}

}
