package exercise7_17;

import java.security.SecureRandom;
public class DiceRolling {
	SecureRandom randomNumber = new SecureRandom();
	public void displayDice() {
		int [] frequency = new int[13];
		int temp;
		for(int i=0; i < 36000; i++) {
			temp = rollDice();
			++frequency[temp];
			//System.out.println(temp);
		}
		
		System.out.println("face\tfrequency");
		for (int face=2; face < frequency.length; face++) {
			System.out.println(face + "\t" + frequency[face]);
		}
	}
	
	
	public int rollDice() {
		int die1 = 1 + randomNumber.nextInt(6);
		int die2 = 1 + randomNumber.nextInt(6);
		
		int sum = die1 + die2;
		//System.out.println("sum of dice is " + sum);
		return sum;
	}
}
