package chapter5.exercise518;

import java.util.Scanner;

public class DiamondPrinting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number in the range 1 to 19: ");
		int side1 = input.nextInt();
		//DiamoondPrinting
		int A = 1, C = 15;
		for(int i = side1; i >= 1; i--) {
			
			for(int j = i; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= A; k++) {
				System.out.print("*");
			}
			for(int j = i; j >= 1; j--) {
				System.out.print(" ");
			}
			A+=2; 
			System.out.println();
		}
		
		
		for(int i = 1; i <= 19; i++) {
			 
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.print(" ");
			for(int k = C; k >= 1; k--) {
				System.out.print("*");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			C -=2;
		System.out.println();
	}
	}
}
