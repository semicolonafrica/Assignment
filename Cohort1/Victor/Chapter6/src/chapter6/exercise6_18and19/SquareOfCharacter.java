package chapter6.exercise6_18and19;

import java.util.Scanner;

public class SquareOfCharacter {
	
	public static void squareOfChar() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of square");
		int squareSize = input.nextInt();
		
		System.out.println("Enter type of square fill");
		char fill = input.next().charAt(0);
		
		SquareOfCharacter.squareOfChar(squareSize, fill);
		
	}
	public static void squareOfChar(int squareSize, char fill) {
		
		for(int squareHeight=1; squareHeight <=squareSize; squareHeight ++) {
			
			for(int squareWidth=1; squareWidth <=squareSize; squareWidth ++) {		
					System.out.print(fill );
				}
		System.out.println();
		}
	}

}