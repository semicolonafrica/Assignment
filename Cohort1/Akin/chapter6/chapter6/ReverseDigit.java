package chapter6;

public class ReverseDigit {

	public static int getDigit(int number) {
		
		int reverse = 0;
		int digit = 0;
		
		while(number != 0) {
			digit = number % 10;
			
			reverse = (reverse * 10) + digit;
			
			number /= 10;
		}
		return reverse;
	}
	
}
