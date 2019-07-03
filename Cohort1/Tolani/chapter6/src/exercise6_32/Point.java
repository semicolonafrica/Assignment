package exercise6_32;

import exercise6_15.Maths;

public class Point {
	
	public static int horizontal(int x1,int x2) {
		int diff = x1 - x2;
		diff = Maths.square(diff);
		return diff;
	}
	
	public static int vertical(int y1,int y2) {
		int diff = y1 - y2;
		diff = Maths.square(diff);
		return diff;
	}
	
	public static double distanceBtwPoints(int x1,int x2,int y1,int y2) {
		double result = horizontal(x1,x2) + vertical(y1,y2);
		result = Math.sqrt(result);
		return result;
	}
}
