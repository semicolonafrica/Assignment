package exercise6_15;

public class Hypotenuse {
	public static double hypotenueCalculator(double a, double b) {
		double side1 = Math.pow(a,2);
		double side2 = Math.pow(b,  2);
		double sum = side1 + side2;
		
		double hypo = Math.sqrt(sum);
		return hypo;
	}
}
