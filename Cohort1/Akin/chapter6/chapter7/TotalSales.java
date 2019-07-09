package chapter7;

import java.util.Random;

public class TotalSales {
	public static Random random = new Random();
	public static void getValue() {
		
		final int PRODUCT = 5;
		final int SALESPERSON = 4;
		
		int[][] sales = new int[PRODUCT][SALESPERSON];
		
		for(int i = 0; i < sales.length; i++) {
			for(int j = 0; j <sales[i].length; j++) {
				sales[i][j] = 500 + random.nextInt(10);
			}
			
		}
		
		for(int f = 1; f <= 4; f++) {
			System.out.printf("%20s%d",  "SP",f);
		}
		System.out.println();
		int totalRow = 0;
		int totalColumn = 0;
		for(int k = 0; k < sales.length;k++) {
			System.out.printf("Prod %d", k + 1);
			for(int d = 0; d < sales[k].length;d++) {
				totalRow += sales[k][d];
				System.out.printf("%15s%d  ","$", sales[k][d]);
			}
			System.out.printf("   *%s%d*","$",totalRow);
			
			System.out.println();
		}
		System.out.println();
		int total1 = 0;
		for(int t = 0; t < sales[0].length; t++) {
			for(int g = 0; g < sales.length; g++) {
			total1 += sales[g][t]; 
		}
		System.out.printf("%15s%d","$", total1);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		getValue();

	}
}
