/**
 * 
 */
package chapter7.exercise7_17;

import java.security.SecureRandom;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Dice {
	
	static SecureRandom randomNumber = new SecureRandom();
	
	public static int rollDice() {
		
		int die1 = 1 + randomNumber.nextInt(6);
		int die2 = 1 + randomNumber.nextInt(6);
		
		int sum = die1 + die2;
		//System.out.println(sum);
		return sum;
	}
	 public static void tallySum() {
		 
		 int [] frequency = new int [13];
		 
		 for(int roll = 1; roll < 36_000_000; roll++) {
			 ++frequency[rollDice()];
		 }
		 System.out.printf("%s%10s%n", "Sum", "Frequency");
		 
		 for(int sum = 2; sum < frequency.length; sum++)
			 System.out.printf("%2d%10d%n", sum, frequency[sum]); 
	 }

	
	

}
