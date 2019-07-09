package chapter7; 

import java.util.Random;

public class SalesCommission {
	public static Random random = new Random();
	public static void getSales() {
		
		int[] sales = new int[40];
		
		int[] frequency = new int[11];
		
		for(int i = 0; i < sales.length; i++) {
			
			
			sales[i] = 200 + (random.nextInt(900));
			
		}
		
		for(int count = 2; count < sales.length;count++) {
			
			++frequency[sales[count] / 100];
		}
		
		for(int k = 2; k < frequency.length; k++) {
			
			if(k >= 10) {
				System.out.printf("$%6s: ","1000 and over");
			} else {
				System.out.printf("$%03d - $%03d: ",k * 100, k * 100 + 99);
			}
			
			int store = 0;
			
			for(int j = 0; j < frequency[k]; j++) {
				store +=1;
				
			}
			System.out.print(store);
			System.out.println();
			
		}
		
	}
	
}
