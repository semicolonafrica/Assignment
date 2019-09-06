package chapter6.exercise615;

import java.util.Scanner;

public class Hypotenuse {
	
	public static void calculateHypotenuse() {

		Scanner input = new Scanner(System.in);
		
		
		double hypotenuse = 0;
		
		for(int i = 1; i <= 3; i++) {
			System.out.print("Enter side1: ");
			double side1 = input.nextDouble();
			
			System.out.print("Enter side2: ");
			double side2 = input.nextDouble();
			
			hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));	
			
			System.out.println("Hypotenuse is: " + hypotenuse);
		}		
		input.close();
	}

}
