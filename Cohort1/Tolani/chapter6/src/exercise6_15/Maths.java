package exercise6_15;

public class Maths {
	
	public static double square(double value) {
		double squareOfValue = value *  value;
		return squareOfValue;
	}
	
	
	
	public static double squareRoot(double value) {
		double squareRoot = 0;
		int i;
		for(i =1;i<value;i++) {
			if(i == value/i) {
				squareRoot = i;
			}
		}
		return squareRoot;
	}

}
