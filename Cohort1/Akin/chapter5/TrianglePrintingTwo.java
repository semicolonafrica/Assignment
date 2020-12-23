package chapter5.exercise518;

import java.util.Scanner;

public class TrianglePrintingTwo {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("\n\n");
		
		//Triangle B
		for(int i = 10; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("\n\n");
		
		
		System.out.print("Enter number of asterisks: ");
		int ast = input.nextInt();
		
		int reduce = ast - 1;
		
		for(int i = ast; i > 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if(j == i) {
					System.out.println();
					for(int m = j - reduce; m <= 1; m++) {
						System.out.print(" ");
					}
				}
			}
		}
		System.out.print("\n\n");
		
		//Triangle D

		
		//Try with Pseudocode
		for(int i = ast; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
				if(j == i) {
					
					for(int m = j - reduce; m <= 1; m++) {			
						System.out.print("*");
						
					}
				System.out.println();
				}
				
			}
		}
		
		input.close();
	}
}


