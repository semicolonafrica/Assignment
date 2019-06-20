package chapter6_exercises;

import java.util.Scanner;

//Program to calculate the Area of a circle
//Exercise 6.20
//Program written by Oyemade Temitope

public class CircleArea {

	
	public static double circleArea(int radius) {
		double area;
		
		area = Math.PI * Math.pow(radius, 2);
		
		return area;	
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius");
		int radius = input.nextInt();
		
		System.out.printf("%nArea = %.2f", circleArea(radius));
		input.close();
	}

}
