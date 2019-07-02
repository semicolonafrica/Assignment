package exercise6_23;

public class Minimum {
	
	public static double findMinimum3(double num1,double num2,double num3) {
		double result = Math.min(num1, Math.min(num2, num3));
		return result;
	}
}
