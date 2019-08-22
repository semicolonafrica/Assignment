package exercise7_27;

import java.util.Arrays;

public class SieveOfEratosthenes {
	static boolean[] prime = new boolean[1000];
	
	public static void main(String[] args) {
		Arrays.fill(prime, true);
		
		for(int i=2; i<prime.length; i++) {
			for(int j=i+1; j<prime.length; j++) {
				if(j%i==0)
					prime[j]=false;
			}
		}
		int a = 0;
		for(int i= 2; i<prime.length; i++) {
			if(prime[i]==true) {
				System.out.print(i + " ");
				a++;
			}
			if(a%4==0)
				System.out.println();
		}
	}
	
}