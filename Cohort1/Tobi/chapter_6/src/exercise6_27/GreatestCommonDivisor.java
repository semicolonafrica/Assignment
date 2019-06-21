package exercise6_27;
//This program returns the greatest common divisor of two numbers
//using the euclid algorithm

public class GreatestCommonDivisor {

	//calculates and returns the greatest common divisor between two number using 
	//euclid algorithm
	public static int  findGCD(int num1, int num2) {
		int a, b;
		int quotient; // stores the divsor of a and b
		int remainder ; // stores remainder of division

		if(num1 > num2) {
			a = num1;
			b = num2;
		}
		else {
		  a = num2;
		  b = num1;
		}
			remainder = a % b;
			quotient = a / b;
			
			while (remainder > 0) {
			quotient = b / remainder; 
			b = remainder;
//			System.out.println;(b + "===")
			remainder = b % remainder;
//			System.out.println(quotient + "==" + remainder);
					
		 }
//		System.out.print(quotient + " " + remainder + " " + a + " " + b);
		return quotient;
		
	}
	public static void main(String[] args) {
		System.out.println(findGCD(24, 5));
	}
}
