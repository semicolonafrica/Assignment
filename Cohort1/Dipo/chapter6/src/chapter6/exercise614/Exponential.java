package chapter6.exercise614;

public class Exponential {

	public static int integerPower(int base, int exponent) {
		
		int product = 1;
		
		for(int counter = 1; counter <= exponent; counter++) {
			
			product *= base;
			
			
		}
		System.out.println( product);
		
		return product;
		
	}
	
}
