package chapter7;

import java.util.Random;

public class NewTotal {
	
	public static Random random = new Random(); 
	
	public static void getTotal() {
	
	final int PRODUCT = 5;
	final int SALESPERSON = 4;
	
	int[][] sales = new int[PRODUCT][SALESPERSON];
	
	for(int i = 1; i <= 4; i++) {
		System.out.printf("%5s%d","SP", i);
	}
	System.out.println();
	int sum = 0;
	for(int i = 0; i < sales.length; i++) {
		sum = 0;
		System.out.printf("%s%d", "PR",i+1);
		for(int j = 0; j < sales[i].length; j++) {
			
			sales[i][j] = 20 + random.nextInt(5);
			sum += sales[i][j];
			System.out.printf("%4d ", sales[i][j]);
		}
		System.out.printf(" %d", sum);
		System.out.println();
	}
//	System.out.println();
	
	int sum1 = 0;
	for(int k = 0; k < sales[0].length; k++) {
		sum1 = 0;
		for(int m = 0; m < sales.length; m++) {
			sum1 += sales[m][k];
		}
		System.out.printf("%5d ", sum1);
	}
	}
	
	public static void main(String[] args) {
		getTotal();
	}
	
	
}
