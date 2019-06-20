package chapter6_exercises;

import java.util.Scanner;

public class SquareofAsteriks {
//Exercise 6.18
//Program to display square of asteriks
//Written by Oyemade Temitope
//20th of June 2019

	
	public static void squareOfAsteriks(int side) {
		
		for(int i = 1; i<=Math.pow(side, 2); i++) {
			System.out.print("*");
			
			if(i % side ==0 )
				System.out.println();
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			System.out.println("Enter number");
			int number = input.nextInt();
			squareOfAsteriks(number);
			input.close();
	}

}
