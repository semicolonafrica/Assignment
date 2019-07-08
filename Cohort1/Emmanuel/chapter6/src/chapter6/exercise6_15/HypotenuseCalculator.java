/**
 * 
 */
package chapter6.exercise6_15;

import java.util.Scanner;

/**
 * @author Emmanuel Akinbode
 *
 */
public class HypotenuseCalculator {
	
	public static double calculateHypotenuse(double side1, double side2) {
		
		
		double x = side1 * side1;
		double y = side2 * side2;
		double hypotenuse = x + y;
		
		for(int i =1; i < hypotenuse; i++) {
			if(hypotenuse/i == i) {
				return i;
			}
		}
		return hypotenuse;
		
	}
	public static double calculateHypotenuse () {
					
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter value for side 1: ");
		double side1 = input.nextDouble();
		System.out.println("Enter valur for side2: ");
		double side2 = input.nextDouble();
		
		double hypotenuse = calculateHypotenuse(side1, side2);
		
		
		return hypotenuse;
	}
	


}
