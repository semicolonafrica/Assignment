package chapter5.exercise5_17;

import java.util.Scanner;

//An online retailer sells five products whose retail
//prices are as follows: Product 1, $2.98; product 2, $4.50; product 3, $9.98;
//product 4, $4.49 and product 5, $6.87. Write an application that reads a
//series of pairs of numbers as follows:
//1. product number
//2. quantity sold
//Your program should use a switch statement to determine the retail price
//for each product. It should calculate and display the total retail value of all
//products sold. Use a sentinel-controlled loop to determine when the
//program should stop looping and display the final results.

public class SalesCalculator {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int quantitySold;
		int total = 1;
		int product=0;
		
		
		while(product != -1) {
			
			System.out.println("enter product number");
			product = input.nextInt();
			
			switch(product) {
			case 1:
				System.out.println("$2.98");
				break;
			case 2: 
				System.out.println("$4.50");
				break;
			case 3:
				System.out.println("$9.98");
				break;
			case 4:
				System.out.println("$4.49");
				break;
			case 5:
				System.out.println("$6.87");
				break;
			default:
				System.out.println("exceeded number of product");
				break;
				
				
						
		}
			
		}
		
		if(product == -1) {
			total += product;
		
			System.out.println("total products sold is : " + total);
			}
				
	
	}
	
	

}
