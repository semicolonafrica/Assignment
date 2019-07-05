package chapter6Exercises;

import java.util.Scanner;

public class Square {

	public static void squareOfAsterisks() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of square");
		int squareSize = input.nextInt();
//		System.out.println("Enter type of square fill");
//		char fill = input.next().charAt(0);
		
		Square.squareOfAsterisks(squareSize);
//		Square.squareOfCharacter(squareSize, fill);
		input.close();
	}
	public static void squareOfAsterisks(int squareSize) {
		
		for(int squareHeight=1; squareHeight <=squareSize; squareHeight ++) {
			
			for(int squareWidth=1; squareWidth <=squareSize; squareWidth ++) {
			System.out.print("* ");
			}
		System.out.println();
		}
	}
//	
//	public static void squareOfCharacter(int squareSize, char fill) {
//		
//		for(int squareHeight=1; squareHeight <=squareSize; squareHeight ++) {
//			
//			for(int squareWidth=1; squareWidth <=squareSize; squareWidth ++) {		
//					System.out.print(fill );
//				}
//		System.out.println();
//		}
//	}
}