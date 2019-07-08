/**
 * 
 */
package exercise6_24;

import exercise6_21.SeperatingDigits;

/**
 * @author ken_granero
 *
 */
public class PerfectNumber {
	
	public static boolean isPerfect(int number) {
		
		
		int counter = 1;
		int remainder = 0;
		int total = 0;
		
		String display = " ";
		
		while(counter < number) {
			remainder = SeperatingDigits.getRemainder(number, counter);
			
			if(remainder == 0) {
	
				total += counter;
				
				display = display+" ' "+counter;
			}
		
			counter++;	
		
		}
		
		if(total == number) {
			
			System.out.print(display+ " " +total);
			return true;
		}
		
		return false;
	}	
	public static void displayPerfectNumber() {
		
		boolean check;
		
		for(int i = 1; i <= 100; i++) {
			
			check = isPerfect(i);
			
		}
		
	}

}
