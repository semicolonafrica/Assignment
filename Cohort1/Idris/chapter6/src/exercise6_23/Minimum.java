package exercise6_23;

public class Minimum {
	public static double findMinimum(double a,double b, double c) {
		if(a < b && a < c) {
			return a;
		}
		else if(b < c && b <a) {
			return b;
		}
		else {
			return c;
		}
	}

}
