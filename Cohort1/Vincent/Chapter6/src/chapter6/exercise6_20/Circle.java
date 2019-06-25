package chapter6.exercise6_20;

import java.util.Scanner;

public class Circle {

	public static void calculateArea() {
		
		Scanner input = new Scanner(System.in);
		
		double total;
		
		System.out.println("enter radius");
		double raduis = input.nextDouble();
		
		total = (Math.PI * raduis * raduis);
		
		System.out.println(total);
		
		input.close();
	}
}
