package exercise6_31;
import java.util.Scanner;
public class Distance {
	Scanner input = new Scanner(System.in);
	public void distance() {
		double x1;
		double x2;
		double y1;
		double y2;
		
		System.out.print("Enter Number: ");
		x1 = input.nextDouble();
		System.out.print("Enter Number: ");
		x2 = input.nextDouble();
		
		System.out.print("Enter Number: ");
		y1 = input.nextDouble();
		System.out.print("Enter Number: ");
		y2 = input.nextDouble();
		
		double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
		System.out.println("The Distance between the two points is: " + result);
	}
}
