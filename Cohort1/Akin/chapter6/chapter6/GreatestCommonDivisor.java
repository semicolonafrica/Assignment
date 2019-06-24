package chapter6;

public class GreatestCommonDivisor {
	
	//Calculating the greatest common divisor of two numbers applying euclid's Algorithm
	
	public static int gcd(int num1, int num2) {
		
		int remainder = 0;
		
		if(num1 > num2) {
			remainder = num1 % num2;
		} else {
			remainder = num2 % num1;
		}
		while(remainder != 0) {
			num1 = num2;
			num2 = remainder;
			
			remainder = num1 % num2;
			
			
		}
		return num2;
		
	}
	
}
