package chapter6_exercises;

import java.util.Scanner;

//Program to calculate the distance between two points
//Program written by Oyemade Temitope
//Exercise 6.32

public class Distance {

	
	public static double distanceBetweenPoints(float x1, float x2, float y1, float y2) {
		
		double distance = 0;
		
		distance = (y2 - y1) / (x2 -x1);
		
		
		return distance;
	} 
	

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value for x1, x2, y1, y2");
		float x1 = input.nextFloat();
		float x2 = input.nextFloat();
		float y1 = input.nextFloat();
		float y2 = input.nextFloat();
		
		System.out.printf("%s%.2f", "Distance = ", distanceBetweenPoints(x1,x2,y1,y2));
		input.close();
	}

}
