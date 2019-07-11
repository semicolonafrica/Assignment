package chapter6.exercises;

import java.util.Scanner;

/**
 * @author LEMON
 *
 */
public class SquareAsterisk {
	
	public static void squareOfAsterisks(int numb) {
		Scanner input = new Scanner(System.in);
		
		int i=1;
		
		System.out.println("Enter SquareSize ");
		numb = input.nextInt();
		
		int row = numb;
		
		 for(; i<=numb; i++) {
			 for (int j=1; j<=row; j++) {
				 System.out.print("* ");
			 }
			 
			 System.out.println();
		 }
		
	}

	public static void main(String [] args) {
		squareOfAsterisks(0);
	}
}