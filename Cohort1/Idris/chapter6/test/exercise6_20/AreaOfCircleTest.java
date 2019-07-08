package exercise6_20;

import java.util.Scanner;
public class AreaOfCircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle: ");
		double radius = input.nextInt();
		
		System.out.println(AreaOfCircle.CalculateArea(radius));
		input.close();
	}

}
