package chapter7.exercises;

import java.util.Scanner;
/**
 * @author LEMON
 *
 */
public class Commission {	
	
		static int [] sales;
		static final int WAGES = 200;
		
		public void calculateCommission() {
			
			double earnings = 0;
			
			double commission = 0;			
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter number of worker: ");
			int number = input.nextInt() ;
			
				sales = new int[number];
			
			int [] frequency = new int[11];
		
			for(int i = 0; i < sales.length; i++) { 
			

					System.out.println("Enter item value: ");
					int itemValue = input.nextInt();
					if (itemValue == -1) {
						break;
					}
									
				commission = itemValue * 0.09;				
				earnings = WAGES + commission;
				
				System.out.println( earnings);				
				sales[i] = (int)earnings;
			}
			
			
			for(int m=0; m < sales.length; m++) {
				
				++frequency[(sales[m]/100)];
				
			}
			System.out.println();
			System.out.println("Employee Frequency");
			int store;
			for (int c = 2; c< frequency.length; c++) {
				
				   if (c == 10) {
					   System.out.printf("%6s", "$1000 and over:");
				   }				   
				   else {
					   System.out.printf("%03d-%03d:", c * 100, c *100 + 99);
				   }	   
				  store=0;
				   for(int k=0; k < frequency[c]; k++) {
					   store +=1;
				   }

				   System.out.print(store);
				   System.out.println();
				}	
			input.close();
		}

		public static void main(String [] args){
			Commission obj = new Commission();

			obj.calculateCommission();
		}	
}