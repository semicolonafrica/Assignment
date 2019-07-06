package chapter7.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exercise 7.20
//Program to calculate sales of product using two dimensional array
//Program written by Oyemade Temitope 
//6th of July 2019

public class TotalSales {
	
	public  void evaluateSales() {
		
		Scanner input = new Scanner(System.in);
		int productNumber = 0;
		int salesPerson =  0;
		int totalValueOfProduct =0;
		int roww =5 , colomnn = 4; 
		int[][] array = new int[roww][colomnn];
		
		int[] sumColomn = new int[colomnn]; 
		int cCount = 0, rowSum =0, colomnSum =0;
		int counter = 1;
	
		
		 System.out.println("Enter sales persons slip details or -1 to exit");
		 
		 while(counter <=(roww *colomnn)) {
			 
			 try {
				 
				 
			 System.out.println("Enter product number");
			 productNumber = input.nextInt(6) -1;
			 
			 System.out.println("Enter sales person number");
				salesPerson = input.nextInt(5) -1;
				
				 System.out.println("Enter total value of Product");
				totalValueOfProduct = input.nextInt();
				
				 array[productNumber][salesPerson] = totalValueOfProduct;
				 
				}
			 
			 catch(InputMismatchException | ArrayIndexOutOfBoundsException e) {
				 
				 System.out.println("Opps!");
				 input.nextLine();
			 }
			 
			 counter++;
		 }
			 
			 
		 
		 System.out.printf("\t\t%s\t%-5s\t%5s\t%-5s%s%n", "Sales Rep 1", "Sales Rep 2", "Sales Rep 3",
				 "Sales Rep 4", "   Total");
		 
		 for(int row = 0; row <array.length; row++) {
			 
			 rowSum *= 0;
			 colomnSum *= 0;
			 
			 System.out.printf("%n%s %-15d", "Product", row +1);

			 for(int colomn =0; colomn< array[row].length; colomn++) {
				 
				 colomnSum += array[colomn][row];
				 rowSum += array[row][colomn];
				 
				 System.out.printf("%-13d ", array[row][colomn]);
			 }
			 
			 sumColomn[cCount] = colomnSum;
			 
			 System.out.printf("%8d", rowSum);
			 			 cCount +=1;
		 }
		
		 System.out.print("\n\nTotal");
			for(int u :sumColomn)
			System.out.printf("%17d", u);
	
		 input.close();
	}
	
	

}
