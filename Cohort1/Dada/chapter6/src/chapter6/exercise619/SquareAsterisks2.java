package chapter6.exercise619;

import java.util.Scanner;

public class SquareAsterisks2 {

	public void squareOfAsterisks() {
		Scanner input = new Scanner(System.in);
			
		System.out.println("Enter number: ");
		char x = input.next().charAt(0);
		
		int c =Character.getNumericValue(x);
		for(int row = 1; row <= c; row++) {
			
			for(int column = 1; column <= c; column++) {
				System.out.print("#");
				
			}
			System.out.println();
			
		}
		
		
	
			
			
			
		}
}
