package chapter6.exercise6_14;


public class Exponentiation {

	public int calculateintegerPower( int base ,int exponent) {
		
		int exponential = 1;
		
		for(int counter=1; counter <= exponent; counter++) {
			exponential *= base;
		}
		System.out.println("Exponnetial is: "+exponential);
		return exponential;
		
	}
	
	}
