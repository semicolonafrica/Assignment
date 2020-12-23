package exercise6_20;
import java.util.Scanner;

public class CircleArea {
	static Scanner input = new Scanner(System.in);
	public static void  circleArea() {
		System.out.println("enter radius : ");
		int radius = input.nextInt();
		double area = Math.PI * radius * radius;
		System.out.println(4.5%1);
		System.out.println("the area of the circle with radius "+ radius +" is : "+ area);
	}
	public static void  circleArea(double radius) {
		System.out.println("enter radius : ");
		radius = input.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("the area of the circle with radius "+ radius +" is : "+ area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circleArea();
		circleArea(1);
	}

}
