package exercise6_20;
import java.util.Scanner;
public class Circle {
	 public void circleArea(){
	        Scanner input = new Scanner(System.in);

	        int r;
	        double pi = 3.14;

	        System.out.print("Enter radius: ");
	        r = input.nextInt();

	        double area = pi * r * r;

	        System.out.print("Area of a circle is: " + area);

	    } 
}
