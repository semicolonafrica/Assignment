package exercise6_14;

public class Math {
	
	public static int integerPower(int base,int exponent) {
		int power =1;
		for(int i =1;i<=exponent;i++) {
			power=power * base;
		}
		return power;
	}
	
	public static double integerPower(double base,double exponent) {
		double power =1;
		for(double i =0.1;i<=exponent;i+=0.1) {
			power=power * base;
		}
		return power;
	}
	
	public static double integerPower(double base,int exponent) {
		double power =1;
		for(int i =1;i<=exponent;i++) {
			power=power * base;
		}
		return power;
	}
	
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
