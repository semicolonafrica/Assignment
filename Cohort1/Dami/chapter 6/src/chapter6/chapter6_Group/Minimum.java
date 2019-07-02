package chapter6.chapter6_Group;

public class Minimum {
	
	public static double minimum3(double a, double b, double c) {
		double min_temp = Math.min(a, b);
		double min = Math.min(min_temp, c);
		return min;
	}
}
