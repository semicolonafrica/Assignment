package chapter7Exercises;

import java.util.Scanner;

public class Product {
//	(Variable-Length Argument List) Write an application that calculates
//	the product of a series of integers that are passed to method product
//	using a variable-length argument list. Test your method with several calls,
//	each with a different number of arguments.
	
	public static void printProduct() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers to find product");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		System.out.println("product is: "+calculateProduct(number1,number2));
		System.out.println("product is: "+calculateProduct(number1,number2, number3));
		
		input.close();
		
	}
//	System.out.println("Enter numbers to find product");
//	int number1 = 0;
//	for(int counter=0; counter<3; counter++) {
//		number1 = input.nextInt();
//	}
//	System.out.println("product is: "+calculateProduct(number1));
	
	public static int calculateProduct(int ...numbers) {
		int total = 1;
		
		for (double multiples: numbers) {
			total *= multiples;
		}
		return total;
	}

	public static void main(String[] args) {
		Product.printProduct(); 

	}

}
