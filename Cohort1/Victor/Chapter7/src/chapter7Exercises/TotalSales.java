package chapter7Exercises;

import java.util.Scanner;

public class TotalSales {
	private int salesPersonsNumber;
	private int productNumber;
	private int valueOfProductSold;
	
	Scanner input = new Scanner(System.in);
//	int [][]sales = new int [5][4];
	
	// sales array with five rows and 4 columns
	int [][]sales = {{800,400,600,700}, 
					{200,330,000,420},
					{350,765,567,433},
					{434,456,543,680},
					{543,423,534,1645,}};
	
//	public void processTotal() {
//		int counter =1;
////		while(counter <=5)
//		System.out.println("Enter Sales Person Number, Product Number, Total Dollar");
//		int salesPersonsNumber = input.nextInt();
//		int productNumber = input.nextInt();
//		int valueOfProductSold = input.nextInt();
//		
////		outputTotal();
//		
////		counter++;
////		input.close();
//	}
	
	// method to print result
	public void outputTotal(){
//		int total11=0;
		int total1=0;
		int total2=0;
		int total3=0;
		int total4=0;
		int productTotal=0;
		
		
		System.out.printf("The product sold are: %n%n");
		System.out.print("           ");
		
		for(int SalesPerson =0; SalesPerson < sales[0].length; SalesPerson++)
			System.out.printf("SalesPerson%d  ", SalesPerson+1);
			System.out.println("  Product Total");	
			System.out.println();
		for(int product = 0; product < sales.length; product++) {
			System.out.printf("Product%d", product+1);
			
				for (int SalesValue : sales[product])
					System.out.printf("%10d 	", SalesValue);
			
				productTotal = getProductTotalSales(sales[product]);
			System.out.printf("%d%n", productTotal);
		}
		
		for(int column =0; column < sales[0].length; column++){
			int salesPersonTotal =0;
			for(int row =0; row < sales.length; row++) {
				salesPersonTotal += sales[row][column];
			}
			System.out.print("\t       "+salesPersonTotal);
		}
//		salesPersonTotal = total1+total2+total3+total4;
		System.out.println();

	}
	
	public int getProductTotalSales(int[] productSales) {
		int totalProduct = 0;
		
		for (int product : productSales) {
			totalProduct+=product;
		}
		return totalProduct;
	}

}
