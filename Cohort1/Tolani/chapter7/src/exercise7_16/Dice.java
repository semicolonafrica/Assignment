/**
 * 
 */
package exercise7_16;

import java.security.SecureRandom;

/**
 * @author omotolani
 *
 */
public class Dice {
	
	SecureRandom random = new SecureRandom();
	final int ARRAY_LENGTH = 36000000;
	
	int[] dice = new int[ARRAY_LENGTH];
	
	public void diceRolling() {
		int die1 =0; //1 + random.nextInt(6);
		int die2 =0; //1 + random.nextInt(6);
		int sum =0;
		int[] frequency = new int[13];
		for(int i =1;i <=dice.length;i++) {
			die1 = 1 + random.nextInt(6);
			die2 = 1 + random.nextInt(6);
			sum = die1 + die2;
			++frequency[sum];
		}
		
		System.out.printf("%s%10s%n","Sum of Face","Frequency");
		
		for(int j =1;j<frequency.length;j++) {
			System.out.printf("%4d%10d%n", j,frequency[j]);
		}
	}

}
