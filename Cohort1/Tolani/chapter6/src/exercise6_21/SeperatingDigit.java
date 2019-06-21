package exercise6_21;

import exercise6_15.Maths;

public class SeperatingDigit {
	
		public static String displayDigits(int number) {
		int remainder = 0;
		String space = " ";
		while(number>0) {
			remainder = Maths.remainder(number,10);	
			space = remainder+ " " +space;
			number = Maths.quotient(number,10);
			
		}
		return space;

	}
}