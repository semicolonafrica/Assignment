/**
 * 
 */
package chapter5.exercise5_17;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class SalesCalculator {

	
	public void calSales() {
		
		int productNum = 0;
		int quantitySold;
		double perTotal = 0;
		double total = 0;
		//perTotal = productNum * quantitySold;
			
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product number 1, 2, 3, 4, 5,"
				+ " respectively for the the different 5 products or"
				+ " -0 to terminate");
		
		//System.out.println("productNum\tquantitySold\tperTotal");
		
		while(productNum != 6) 
		{
			
			 productNum = input.nextInt();
			 quantitySold = input.nextInt();
			 
			 switch(productNum) 
			 {
				case 1:
					perTotal=2.98*quantitySold ;
					break;
					
				case 2:
					perTotal=4.50*quantitySold;
					break;
				
				case 3:
					perTotal=9.98*quantitySold;
					break;
					
				case 4:
					perTotal=4.49*quantitySold;
					break;
					
				case 5:
					perTotal=6.87*quantitySold;
					break;
					
				}
		if(productNum != 6) {
			
		 	System.out.println();
		 
		 System.out.println(productNum +"\t" + quantitySold + "\t"+ perTotal);
		 //System.out.println(perTotal);
		}
		total+=perTotal;
		System.out.println("Total is: " + total);
		}
		
		
	}

}
