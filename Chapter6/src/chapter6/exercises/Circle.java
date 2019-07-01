package chapter6.exercises;

/**
 * @author Lemon
 *
 */
import java .util.Scanner;
public class Circle {
	
	private final static double pie=3.141159;
	
	public static void circleArea() {
		
		Scanner accept = new Scanner(System.in);
		
		int r=1;
		System.out.println("enter the value of radius");
		r =accept.nextInt();
		
		
		double area = 0.1;
		
		int radius= r*r;
		
		area+=pie*radius;
		
		System.out.println(area);
	
		accept.close();
    }
	public static void main(String[] args) {
		circleArea();
	}	
}