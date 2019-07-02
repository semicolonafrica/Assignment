package exponentiation;

//import java.util.Scanner;

public class Exponentiation {
	
	public static int integerPower(int base, int exponent) {

		int result = 1;
		for(int i = 1 ; i <= exponent; i++) {
			result = result * base;
		}
		return result;
	}
}