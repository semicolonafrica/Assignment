package chapter8;

public class Rational {

	
	private int numerator;
	private int denominator;
	
	
	public Rational() {
		
		numerator = 1;
		denominator = 1;
		
	}
	
	// initialize numerator and denominator
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		convert();
	}

	//CREATE A METHOD TO ADD TWO RATIONAL NUMBER
	public Rational sum( Rational value) {
		int resultDenominator = denominator * value.denominator;
		int resultNumerator = numerator * value.denominator + value.numerator * denominator;
		
		return new Rational( resultNumerator, resultDenominator );
		
	}
	
	public Rational subtract(Rational value) {
		int resultDenominator = denominator * value.denominator;
		int resultNumerator = numerator * value.denominator - value.numerator * denominator;
		
		return new Rational( resultNumerator, resultDenominator );
		
	}
	
	public Rational multiply(Rational value) {
			
		return new Rational( numerator * value.numerator, denominator * value.denominator);
		
	}

	public Rational divide(Rational value) {
		
		return new Rational( numerator * value.denominator, denominator * value.numerator);
		
	}
	
	//method *convert* to check if the numerator is divisible by the denominator
	private void convert() {
		int greatest_common_divisor = 0;
		int small;
		
		//Find the greatest common divisor of both numbers
		if(numerator < denominator) {
			small = numerator;
		} else {
			small = denominator;
		}
		
		for(int i = small; i >= 2; i--) {
			if(numerator % i == 0 && denominator % i == 0) {
				greatest_common_divisor = i;
				break;
			}
		}
		
		if(greatest_common_divisor != 0) {
			numerator /= greatest_common_divisor;
			denominator /= greatest_common_divisor;
		}
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public String toFloatString( int digits ) {
		double value = (double) numerator / denominator;
		
		return String.format("%." + digits + "f", value);
	}
	
}
