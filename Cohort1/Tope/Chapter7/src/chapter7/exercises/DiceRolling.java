package chapter7.exercises;

import java.security.SecureRandom;

//Exercise 7.17
//Program written by Oyemade Temitope
//4th of July 2019

public class DiceRolling {

	
	public static void rollDice() {
		
		SecureRandom random = new SecureRandom();
		int sum = 0;
		int die1;
		int die2;
		int[] array = new int[13];
		
		for(int i = 0; i< 36_000_000; i++) {
			
			die1 =  1 + random.nextInt(6);
			die2 = 1 + random.nextInt(6);
			
			sum = die1 + die2;
			
			++array[sum];
		}
		
		
		System.out.printf("%s\t\t%s%n", "SUM", "TALLY");
		
		for(int i = 2; i< array.length; i++) {
			
			System.out.printf("%2d\t\t%d%n",i, array[i]);
			
		}
	}
	
	public static void main(String[] args) {
		 rollDice();

	}

}
