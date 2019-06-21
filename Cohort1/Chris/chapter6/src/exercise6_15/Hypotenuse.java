package exercise6_15;
//Method that gets the hypotenuse
//of a right angle
import java.util.Scanner;

public class Hypotenuse {
	
	public static double hypotenuse(double a, double b) {
	
		double side1 = Math.pow(a, 2);
		double side2 = Math.pow(b, 2);
		
		double sum = side1 + side2;
		double hyp = Math.sqrt(sum);
		
		if(hyp * hyp == sum) {
			return hyp;
		}else
			{System.out.println("this cannot reperesent the sides of a right angle triangle!!");
			return 0.0;
				}
		
		 
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter side1:");
		double side1 = input.nextDouble();
		
		System.out.printf("Enter side2:");
		double side2 = input.nextDouble();
		
		System.out.printf("%nThe hypotenuse is: %.2f", hypotenuse(side1, side2));
	}

}
