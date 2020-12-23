/**
 * 
 */
package exercise6_21;

/**
 * @author ken_granero
 *
 */
public class SeperatingDigits {
	
	public static int getQuotient(int number2, int number1) {
		
		int total = number2 / number1; 
				
		return total;
	}
	
	public static int getRemainder(int number2, int number1) {
		
		int remainder = number2 % number1;
		
		return remainder;
	}

	
	public static String displayDigits(int number) {
		
			int remainder = 0;
			String space = " ";
			
			while(number > 0) {
				remainder = getRemainder(number, 10);
				
				space = remainder+ " " + space;
				
				number = getQuotient(number,10);
				
				
			}
		
		
			return space;
		
			
		
		
		
		
	}
}
