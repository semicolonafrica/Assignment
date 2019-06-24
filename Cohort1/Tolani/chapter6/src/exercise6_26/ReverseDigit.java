package exercise6_26;

import exercise6_15.Maths;

public class ReverseDigit {
	public static String displayDigits(int number) {
		int remainder = 0;
		String space = " ";
		while(number>0) {
			remainder = Maths.remainder(number,10);	
			space = space+remainder;
			number = Maths.quotient(number,10);
			
		}
		return space;

	}
}
