package chapter6.exercise18;

import java.util.Scanner;

public class SquareAsterisks {

	public void squareOfAsterisks() {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter number: ");
		int c = input.nextInt();
		
		for(int row = 1; row <= c; row++) {
			
			for(int column = 1; column <= c; column++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		
	}
}
