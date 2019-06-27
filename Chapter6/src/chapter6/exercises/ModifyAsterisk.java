package chapter6.exercises;

import java.util.Scanner;

public class ModifyAsterisk {
	
	public static void squareOfAsterisks(int numb, char fillCharacter) {
		Scanner input = new Scanner(System.in);
		
		int i=1;
		
		System.out.println("Enter SquareSize ");
		numb = input.nextInt();
		
		System.out.println("Enter character ");
		char fill = input.next().charAt(0);
		
//		int row = fill;
		
		 for(; i<=numb; i++) {
			 for (int j=1; j<=numb; j++) {
				 System.out.print(fill + " " );
			 }
			 
			 System.out.println();
		 }
		
	}

	public static void main(String [] args) {
		squareOfAsterisks(0,'@');
	}
}