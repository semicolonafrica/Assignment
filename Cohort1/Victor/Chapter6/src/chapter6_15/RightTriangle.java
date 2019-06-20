package chapter6_15;

public class RightTriangle {
	
	public static double hypotenuse(double side1, double side2) {

		double side1Square = Math.pow(side1,2);	
		double side2Square = Math.pow(side2,2);
		double hypotenuse = side1Square +side2Square;
		
		System.out.println("Hypotenuse Square is: "+hypotenuse);
		
		System.out.printf("Hypotenuse is %.1f", Math.sqrt(hypotenuse));
		return hypotenuse;	
	}

}
