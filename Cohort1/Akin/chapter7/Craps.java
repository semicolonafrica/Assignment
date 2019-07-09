package chapter7;

import java.security.SecureRandom;

	public class Craps {
	public static SecureRandom randomNumbers = new SecureRandom();
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args) {
		
		int myPoint = 0;	
		int[] sumOfDice = new int[14];
		for(int r = 0; r <= 1_000_000;r++) {
			
			
			
			++sumOfDice[rollDice()];
		}
		
		for(int sum = 2; sum < sumOfDice.length - 1; sum++) {
		System.out.printf("%d  %d%n",sum, sumOfDice[sum]);
		}
		String result = "";
	
		
		
	}
	
	
	public static int rollDice() {
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		//display results of this roll
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
	
		return sum;
	}
	
}
