package chapter6_exercises;

import java.util.Scanner;

public class Hypotenuse {
//Exercise 5.15
//Program to calculate the hypotenuse of a triangle using a Math class
//Program written by Oyemade Temitope
//20th of June 2019
	
	public static double hypotenuse(double opposite, double adjacent) {
		double hyp = 0;
		
		hyp = Math.pow(opposite, 2) +  Math.pow(adjacent, 2);
		hyp = Math.sqrt(hyp);
		
		return hyp;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of times");
		int number = input.nextInt();
		int counter =1;
		
		while(counter <= number) {
		System.out.println("Enter value for side 1");
		double side1 = input.nextDouble();
		System.out.println("Enter the value for side 2");
		double side2 = input.nextDouble();
	
		System.out.println("Hypotenuse = " + hypotenuse(side1, side2));
		counter++;
		}
		
		input.close();	

	}

}
