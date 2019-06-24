package exercise6_15;

public class Maths {
	
	public static double square(double value) {
		double squareOfValue = value *  value;
		return squareOfValue;
	}
	
	public static int square(int value) {
		int squareOfValue = value *  value;
		return squareOfValue;
	}
	
	
	
	public static double squareRoot(double add) {
		double squareRoot = 0;
		int i;
		for(i =1;i<add;i++) {
			if(i == add/i) {
				squareRoot = (double)i;
			}
		}
		return squareRoot;
	}
	
	public static int squareRoot(int value) {
		int squareRoot = 0;
		int i;
		for(i =1;i<value;i++) {
			if(i == value/i) {
				squareRoot = i;
			}
		}
		return squareRoot;
	}
	
	public static int quotient(int number1,int number2) {
		int quotient =  number1 / number2;
		return quotient;
	}
	
	public static double quotient(double number1,double number2) {
		double quotient =  number1 / number2;
		return quotient;
	}
	
	public static int remainder(int number1,int number2) {
		int remainder =  number1 % number2;
		return remainder;
	}
	
	
	public static double remainder(double number1,double number2) {
		double remainder =  number1 % number2;
		return remainder;
	}
	
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

}
