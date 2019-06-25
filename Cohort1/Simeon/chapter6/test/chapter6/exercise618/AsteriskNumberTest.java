package chapter6.exercise618;

import java.util.Scanner;

public class AsteriskNumberTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int size = input.nextInt();
		
		AsterickNumber.squareOfAsterick(size);
		
		input.close();

	}

}
