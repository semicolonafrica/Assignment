package chapter2.exercise2_21;

import java.util.Scanner;
public class Radius {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number");
		int radius= input.nextInt();
		
		double diameter = 2 * radius;
		double circum =  Math.PI * diameter / 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.printf("diameter is: %2f%nCircum is: %2f%nArea is: %2f%n", diameter, circum, area);
		
		

	}

}
