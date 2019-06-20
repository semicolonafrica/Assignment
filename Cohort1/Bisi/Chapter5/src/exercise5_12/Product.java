package exercise5_12;

public class Product {
	 public static void main(String[] args) {
		 int i = 1;
		 int product = 1;
 			 for(i = 1; i <= 15; i+=2) {
 				 product = product * i;	
				 System.out.print(" "+i);
		 } 
			 			// System.out.printf("Product is %d%n", product);
 			 System.out.println("\nThe product is:" + product);
		 }
	 }

