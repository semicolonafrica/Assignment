package exercise620;
import java.util.Scanner;

public class AreaCircle {
	public static void circleArea() {
		Scanner input = new Scanner(System.in);
		int r;
		double	pi = 3.14285;
		
		System.out.println("Enter the radius Value: ");
		r = input.nextInt();
		
		double total = (pi * (r * r));
		
		System.out.printf("the Area of circle is: ",total);
		

		input.close();
		
	}

	public static void main(String[] args) {
		AreaCircle.circleArea();

	}

}
