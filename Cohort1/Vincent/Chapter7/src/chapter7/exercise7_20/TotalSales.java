package chapter7.exercise7_20;
import java.util.Scanner;
public class TotalSales {
	private static int [][] sales = new int [4][5];
 
	public static  void acceptInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("salesperson number");
		int salesPerson = input.nextInt();
		
		while(salesPerson != -1) {
			
		System.out.println("enter product number");
		int itemSold = input.nextInt();	
		System.out.println("amount of product");
		int amount = input.nextInt();
		
		if (salesPerson < 1 && salesPerson > 5 && itemSold >= 1 && itemSold < 6 && amount >= 0)
			sales[salesPerson -1][itemSold-1] += amount;
	        if (itemSold > 5)  
			    System.out.print("Invalid input\n");
			
	           System.out.println("enter -1 to end the loop");
	            salesPerson = input.nextInt();
		}
	
			
		 }
		 
	  public static void displayNumber() {
		  double personTotal[] = new double[4];
		  
		  // display the table
		  for (int coll = 0; coll < 4; coll++) {
		     personTotal[coll] = 0;
		  } 
		  System.out.printf("%7s%14s%14s%14s%14s%14s\n", "Product", "Salesperson 1",
		     "Salesperson 2", "Salesperson 3", "Salesperson 4","Total");
		  
		  for (int row = 0; row < 4; row++)
		  {
		     double productTotal = 0.0;
			 System.out.printf("%7d", (row + 1));
			 
			 for (int col = 0; col < 4; col++)
			 {
			    System.out.printf("%d", sales[row][col]);
				productTotal += sales[row][col];
				personTotal[col] += sales[row][col];
				 
			 } // end inner loop
			 System.out.printf("%14.2f\n", productTotal);
			
			 
		  }// end for                                                                                               
		  
		  System.out.printf("%5s", "Total");
		  
		  for (int col = 0; col < 4; col++)
		     System.out.printf("%12.2f", personTotal[col]);
		  
		  System.out.println();
	  }
}