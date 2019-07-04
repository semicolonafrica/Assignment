package chapter6.exercise615;

import java.util.Scanner;

public class Hypotenuse {

	public static double hypotenuse(double side1, double side2) {
		
		side1 = Math.pow(side1,2); 
		side2 = Math.pow(side2,2);
		
		double hypotenuse = side1 + side2;
		hypotenuse = Math.sqrt(hypotenuse);
		
		return hypotenuse; 
		
	}
	
	public static void main(String[] args) {
		
		Scanner hypo = new Scanner(System.in);
		System.out.println("Enter side1");
		double side1 = hypo.nextDouble();
		
		System.out.println("Enter side2");
		double side2 = hypo.nextDouble();
		
		System.out.println(hypotenuse(side1, side2));
		
		hypo.close();
		

	}

}
