package chapter6.exercise6_14;

public class Exponential {
	
	public static int integerPower(int base, int exponent) {
		
		int exponential =1;
		for(int counter=1; counter <= exponent; counter++) {
			exponential *= base;
		}
		System.out.println("The exponnetial of "+base+","+exponent +" is "+exponential);
		return exponential;
	}
}
