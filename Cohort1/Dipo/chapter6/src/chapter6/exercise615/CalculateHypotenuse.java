package chapter6.exercise615;

public class CalculateHypotenuse {
	
	
	public static double hypotenuse( double side1, double side2) {
		
		double hypotenuseSquared = Math.pow(side1 , 2) + Math.pow(side2 , 2);
		
		System.out.println(hypotenuseSquared);
		
		
		double hypotenuseSquarednew = Math.sqrt(hypotenuseSquared);
		
		System.out.print(hypotenuseSquarednew);
		return hypotenuseSquarednew;
	}
	

}
