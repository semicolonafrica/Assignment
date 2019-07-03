package chapter5.exercise518;

import java.util.Scanner;

public class DiamondPrintingTest {
	
	public int getDiamondPrinting() {
		
		int A = 9; 
		int B = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int number = input.nextInt();
		
		int average = number / 2;
		 
		for(int i = 1; i <= 9; i++) {
			
			for(int j = A; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= B; k++) {
				System.out.print("*");
			}
			if(i > 4) {
				A +=1;
				B -= 2;
			}
			else {
				A-=1;
				B +=2;
			}
			System.out.println();
			
	}
		return number;	
}
}
