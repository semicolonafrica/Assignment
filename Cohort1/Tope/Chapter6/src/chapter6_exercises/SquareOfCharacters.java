package chapter6_exercises;

import java.util.Scanner;

public class SquareOfCharacters {
//Exercise 6.19
//Program to print character
//Written by Oyemade Temitope
//20th of June 2019
	
	
	public static void squareOfCharacter(int side, char fillCharacter) {
		
		for(int i = 1; i<=Math.pow(side, 2); i++) {
			System.out.print(fillCharacter);
			
			if(i % side ==0 )
				System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of sides");
		int sides = input.nextInt();
		System.out.println("Enter character");
		char fill = input.next().charAt(0);
		
		squareOfCharacter(sides, fill);
		input.close();
		
	}

}
