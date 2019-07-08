package separatingDigits;
import java.util.Scanner;

public class Digits {
	
	//division
	public static int integerPart(int a, int b) {
		return  a / b;
	}
	
	//remainder
	public static int remainderPart(int a, int b) {
		return a % b ;
	}
	
	public static String displayDigit(int number) {
		String numberToString = " ";
		
		
		if(number <1 || number > 99999)
			System.out.println("value must be within 1 - 99999");
		
		
		else if (number < 10)
			numberToString = String.format("%d", number);
		
		else if(number > 9 && number < 100) {
			
			int firstDigitOfNumber  = number / 10;
			int secondDigitOfNumber = number % 10;

			numberToString          = String.format("%d %d  ", firstDigitOfNumber ,secondDigitOfNumber);
			
			}
		
		else if(number >99 && number < 1000) {
			int firstDigitOfNumber  = number / 100;
			int remainder           = number % 100;
			int secondDigitOfNumber = remainder / 10;
			int thirdDigitOfNumber  = remainder % 10;
			
			numberToString          = String.format("%d %d %d ", firstDigitOfNumber ,secondDigitOfNumber, thirdDigitOfNumber);
				
		}
		
		else if(number > 999 && number < 10000) {
			int firstDigitOfNumber  = number / 1000;
			int remainder           = number % 1000;
			int secondDigitOfNumber = remainder / 100;
			remainder               = remainder % 100;
			int thirdDigitOfNumber  = remainder / 10;
			int fourthDigitOfNumber = remainder % 10;
			
			numberToString          = String.format("%d %d %d %d", firstDigitOfNumber ,secondDigitOfNumber, thirdDigitOfNumber, fourthDigitOfNumber);
		}
		
		else if(number > 9999 && number < 100000) {
			int firstDigitOfNumber  = number / 10000;
			int remainder           = number % 10000;
			int secondDigitOfNumber = remainder /  1000;
			remainder               = remainder % 1000;
			int thirdDigitOfNumber  = remainder / 100;
			remainder               = remainder % 100;
			int fourthDigitOfNumber = remainder / 10;
			int fifthDigitOfNumber  = remainder % 10;
			
			numberToString          = String.format("%d %d %d %d %d", firstDigitOfNumber, secondDigitOfNumber, thirdDigitOfNumber, fourthDigitOfNumber, fifthDigitOfNumber);
			
		}
				
		return numberToString;
	}
}