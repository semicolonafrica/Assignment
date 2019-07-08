package exercises;

import java.util.Scanner;

//Exercise 7.10
public class SaleCommissions {

	static int[] arrayHold;
	
	public static int calculateWeeklyAllowance(int grossSales) {
		
		final int COMMISSION_PER_WEEK = 200;
		int adsON = (int) (0.09 * grossSales);
		
		return COMMISSION_PER_WEEK + adsON;
	}
	
	
	public static void compute() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of staffs");
		int staffs = input.nextInt();
		int sales = 0;
		int commission =0;
		
		arrayHold = new int[staffs];
		
		
		System.out.println("Enter their gross sales for the week");
		for(int i = 0; i< staffs; i++) {
			
			sales = input.nextInt();
			
			commission = calculateWeeklyAllowance(sales);
			
			arrayHold[i] = commission;
			
		}
		
		input.close();
		
		
	}
	
	
	public static void showFrequency() {
		
		int[] frequency = new int[11];
		
		for(int x = 0; x<arrayHold.length; x++) {	
			++frequency[(arrayHold[x]/100)];	
		}
		
		//Print out Statistics
		for(int i = 2; i< frequency.length; i++) {
			
			if(i == 10)
				System.out.printf("$%2d and Over", 1000);
			
			else {
				
				System.out.printf("$%2d - %2d", i*100, i *100 + 99);
			}
			
			for(int v = 0; v<frequency[i]; v++)
				System.out.print("*");
			
			
			System.out.println();
		}
		
	}

	
	
	public static void main(String[] args) {
		
		compute();
		showFrequency();
		
	}

}
