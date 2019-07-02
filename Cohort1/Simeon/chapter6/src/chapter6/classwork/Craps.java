package chapter6.classwork;

import java.security.SecureRandom;

public class Craps {
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public static int rollDice()
	{
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
	}
	public static void sumOfDice()
	{
		String won;
		String lose;
		String continue;
		
		if ( sum == 7 || sum == 11) {
			System.out.print("YOU WIN");
		}
		
		if ( sum == 2 || sum == 3 || sum == 12) {
			System.out.print("YOU LOSE");
		}
		
	}
}
