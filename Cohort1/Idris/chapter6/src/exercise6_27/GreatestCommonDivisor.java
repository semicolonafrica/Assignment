package exercise6_27;

public class GreatestCommonDivisor {
	public static int calculateGCD(int number1,int number2) {
		int a = number1, b= number2;
		int remainder = number1 % number2;
		while(remainder > 0) {
			number1 = number2;
			 number2= remainder;
			remainder = number1 % number2;
			
		}
		System.out.println("The Greatest common divisor of "
		+ a + " and "+ b +" is "+number2);
		
		return number2;
	}
}