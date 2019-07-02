package chapter5.exercise518;

import java.util.Scanner;

public class TrianglePrintingOne {

	public static void main(String[] args) {
		Scanner input = new Scanner("System.in");
		//Triangle A
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j < i; j++) {
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
		
		//Triangle C
	
	
		//long str = input.nextLong();
		
		
		}

	}


