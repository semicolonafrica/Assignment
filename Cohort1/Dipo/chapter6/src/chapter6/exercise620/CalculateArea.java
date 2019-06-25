package chapter6.exercise620;
import java.util.Scanner;
public class CalculateArea {
	
	public void circleArea() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of radius: ");
		int radius = input.nextInt();
		
		CalculateArea.circleArea(radius);
		
	}
	
	public static void circleArea(int radius) {
		
		double area = (Math.PI * radius * radius);
		
		System.out.println(area);
		
		
	}
	
	
	

}
