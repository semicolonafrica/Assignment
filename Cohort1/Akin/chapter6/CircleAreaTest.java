	import java.util.Scanner;
public class CircleAreaTest {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle in meters: ");
		
		int radius = input.nextInt();
		double circle = CircleArea.circleArea(radius);
		
		System.out.printf("The Area of a circle of radius %d is %.2fm2%n", radius,circle);
		input.close();
	}

}
