package chapter6.exercises;

import java.util.Scanner;

public class Hypotenuse {
	
	public static double getHypotenus(double x,double y ) {
		
		double hypo = 0.0;
		
		hypo = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		
			return hypo;	
	}
	public static double printHypotenus(double x, double y) {
		double result= Math.hypot(x, y);
		
		
		return result;
		//end of method
	}

	
	public static void main(String[] args) {
		
		System.out.println(getHypotenus(3.0, 4.0));
		System.out.print(Hypotenuse.printHypotenus(3.0, 4.0));
		
		
	}
}
