package chapter6.chapter6_Group;
import java.util.Scanner;
public class AreaOfCircleImplementation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What's the radius? ");
		double radius = input.nextDouble();
		
		System.out.println(AreaOfCircle.calculateArea(radius));
	}

}
