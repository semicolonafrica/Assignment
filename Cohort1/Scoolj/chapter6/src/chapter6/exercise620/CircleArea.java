/**
 * 
 */
package chapter6.exercise620;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class CircleArea {
	 final static double pi = 3.14159;
	public static double calculateCircleArea() {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter Radius: ");
		double radius = input.nextDouble();
		
		double areaOfCircle= printAreaOfCircle(radius);
		
		return areaOfCircle;
	}
	
	
	public static double printAreaOfCircle(double radius) {
		
		double radiusM = pi * radius * radius;
		
		System.out.println("The circle area is: \t "+radiusM);
		return radiusM;		
	}
	

}
