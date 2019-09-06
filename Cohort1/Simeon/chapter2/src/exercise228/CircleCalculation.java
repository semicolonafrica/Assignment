package exercise228;

import java.util.Scanner;

public class CircleCalculation {

	// main method begins execution of java application
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int r;
		
		System.out.print("Enter radius of cirle: ");
		r = input.nextInt();
		
		System.out.printf("Diameter = %d%n", 2*r);
		
		System.out.printf("Circumference = %.3f%n", 2*3.14159*r);
		
		System.out.printf("Area = %.3f%n", 3.14159*(r*r));
		
		input.close();

	}

}
