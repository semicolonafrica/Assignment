package exercise206;

/* A program that calculates the product of 3 integers 
 * Author: Simeon O.
 * Date: 10'06'19, 1:27PM
 */

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;
		
		System.out.print("Enter first number: ");
		x = input.nextInt();
		
		System.out.print("Enter second number: ");
		y = input.nextInt();
		
		System.out.print("Enter third number: ");
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("Product is %d", result);
		
		input.close();
		
	} // end method main
} // end class Product
