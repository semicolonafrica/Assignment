package chapter7;

import java.util.Random;

public class DiceRolling {
	public static Random random = new Random();
	public static void rollDice() {
		

		int[] frequency = new int[14];
		for(int i = 0; i < 36_000_000; i++) {
			
			++frequency[(1 + random.nextInt(6)) + (1 + random.nextInt(6))];
		
		}
		for(int k = 2; k < frequency.length - 1; k++) {
			System.out.printf("%d   %d%n", k, frequency[k]);
		}
	}
	
	public static void main(String[] args) {
		rollDice();
	}
	
}
