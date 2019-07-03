/**
 * 
 */
package exercises;

/**Exercise 5.17
 * @author user
 *work on displaying the result in tabular form
 */
import java.util.Scanner;
public class RetailSales {
	Scanner input = new Scanner(System.in);

	
//	double product1 = 2.98;
//	double product2 = 4.50;
//	double product3 = 9.98;
//	double product4 = 4.49;
//	double product5 = 6.87;
	
	double totalRetailSales = 0;
	int productNum = 0;
	double productQty = 0;
	
	
	
	public void calcSales() {
		
		System.out.println("Enter Product Number or -1 to terminate: ");
		productNum = input.nextInt();
		
		while(productNum != -1) {
			
			System.out.println("Enter Product Quantity: ");
			productQty = input.nextDouble();
			
			switch(productNum) {
			case 1:
				totalRetailSales = totalRetailSales + 2.98 * productQty;
				break;
			case 2:
				totalRetailSales += 4.50 * productQty;
				break;
			case 3:
				totalRetailSales += 9.98 * productQty;
				break;
			case 4:
				totalRetailSales += 4.49 * productQty;
				break;
			case 5:
				totalRetailSales += 6.87 * productQty;
				break;
				default:
				break;
				
			}
			System.out.printf("Total Retail Sales is:  %.2f%n" , totalRetailSales);
			System.out.println();
			
			
			
			System.out.print("Enter product number or -1 to terminate");
			productNum = input.nextInt();
			System.out.println();
			
//			System.out.println();
		}//end while loop
		
		
	}//end method calcSales
}// end class Sales.java
