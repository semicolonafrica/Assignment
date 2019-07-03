package exercise6_32;
import java.util.Scanner;
public class DistanceBetweenPoints {
	static Scanner input = new Scanner(System.in);
	public static double distance() {
		System.out.println("enter x1: ");
		double x1 = input.nextDouble();
		System.out.println("enter x2: ");
		double x2 = input.nextDouble();
		System.out.println("enter y1: ");
		double y1 = input.nextDouble();
		System.out.println("enter y2: ");
		double y2 = input.nextDouble();
		double distance = Math.sqrt(Math.pow(y2-y1, 2)+ Math.pow(x2-x1, 2));
		return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(distance());
	}

}
