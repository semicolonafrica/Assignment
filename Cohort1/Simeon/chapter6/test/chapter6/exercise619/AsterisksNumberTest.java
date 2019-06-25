package chapter6.exercise619;

import java.util.Scanner;

public class AsterisksNumberTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the Number: ");
		int size = input.nextInt();
		
		System.out.println("Enter the Character: ");
		char charact =input.next().charAt(0);
		
		AsterickNumber.calAsterick(size,charact);


		input.close();
	}
}
