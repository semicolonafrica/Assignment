package exercise5_17;

import java.util.Scanner;
public class Sales {
	//product prices
	double product1 = 2.98;
	double product2 = 4.50;
	double product3 = 9.98; 
	double product4 = 4.49;
	double product5 = 6.89;
	
	//storage 
	double item1 = 0 ;
	double item2 = 0 ;
	double item3 = 0 ;
	double item4 = 0 ;
	double item5 = 0 ;
	
	int productNumber;
	int productQuantity;
	double totalProductSold;
	
	public void calculateProductsSold() {
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter product number or -1 to exit");
		 productNumber = input.nextInt();
		 
		 
		 while(productNumber != -1) {
				System.out.print("Enter product quantity ");
			 productQuantity = input.nextInt();
			 
			 switch(productNumber) {
			 case 1:
				 item1 = product1 * productQuantity + item1;
				 System.out.printf("%s%f%n%d%n%f%n%n", "The product and its price with sold price ", product1,productQuantity,item1);
				 break;
			 case 2:
				 item2 = product2 * productQuantity + item2;
				 System.out.printf("%s%f%n%d%n%f%n%n", "The product and its price with sold price ", product2,productQuantity,item2);
				 break;
			 case 3:
				 item3 = product3 * productQuantity + item3;
				 System.out.printf("%s%f%n%d%n%f%n%n", "The product and its price with sold price ", product3,productQuantity,item3);
				 break;
			 case 4:
				 item4 = product4 * productQuantity + item4;
				 System.out.printf("%s%f%n%d%n%f%n%n", "The product and its price with sold price ", product4,productQuantity,item4);
				 
				 break;
			 case 5:
				 item5 = product5 * productQuantity + item5;
				 System.out.printf("%s%f%n%d%n%f%n%n", "The product and its price with sold price ", product5,productQuantity,item5);
				 break;
				 default:
					 break;
			 }
			 //System.out.printf("%d%n%d%n%d", product1,productQuantity,item1);
			 System.out.print("Enter product number or -1 to exit: ");
			 productNumber = input.nextInt();
		 }
		 totalProductSold = item1+item2+item3+item4+item5;
		 
		 System.out.println("The total retail value is: "+totalProductSold);
		 input.close();
	}
	
	
}
