package exercise7_14;

import java.util.Scanner;

public class ArgumentList {
			
			public static int product(int... numbers) {
				int total = 1;
				
				for(int num=0; num<numbers.length; num++) {
					
					total *= numbers[num];
					
				}
				return total;			
			}
			
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			int value = 0;
			
			System.out.println("Enter Number of times: ");
			int numb = input.nextInt();
			
			int [] number = new int[numb];

			
			for(int i=0; i<number.length; i++) {
				System.out.println("Enter Values: ");
				 value = input.nextInt();
				 
				 number[i] = value;
			}

			System.out.printf("%s%d", "Product Of Your Value Is : ",product(number));
		}
	
	

}
