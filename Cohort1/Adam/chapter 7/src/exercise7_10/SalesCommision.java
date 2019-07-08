package exercise7_10;

import java.util.Random;

public class SalesCommision {
	
	public static Random random  = new Random();
	public static void getSales() {
		
		int [] sales = new int [40];
		
		int[] frequency = new int[11];
		
		for(int i = 0; i < sales.length; i++) {
			
			sales[i] = 200 + random.nextInt(950);
		}
		for(int j = 2; j < sales.length; j++) {
			
			++frequency[ sales[j] / 100];
			if(sales[j] / 10 > 10) {
				
			}
		}
		
		for(int k = 2; k < frequency.length; k++) {
			
			if(k >= 10) {
				System.out.printf("%6s","$1000 and over");
			} else {
				System.out.printf("$%03d - $%03d",k * 100, k * 100 + 99);
			}
			int store = 0;
			for(int value = 0; value < frequency[k]; value++) {
				store += 1;
				
			}
			System.out.printf(" %d", store);
			System.out.println();
		}
	}

}
