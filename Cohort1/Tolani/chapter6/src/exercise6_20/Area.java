package exercise6_20;

import exercise6_15.Maths;

public class Area {
	
	public static double circleArea(int radius) {
		double result = Math.PI * Maths.square(radius);
		return result;
	}
}
