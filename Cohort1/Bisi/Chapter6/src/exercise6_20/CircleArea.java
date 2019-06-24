package exercise6_20;
import java.util.Scanner;
public class CircleArea {
	
	public static void circleArea(){
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter radius:");
		double r = input.nextDouble();
		
		//	r = Math.pow(r, 2.0);
		double c = Math.PI * (r *r);
		
		System.out.print("Area of the radius given is:");
		System.out.println(c);
	}
  }
