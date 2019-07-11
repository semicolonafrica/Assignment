package chapter7.exercises;

import java.security.SecureRandom;

public class Dice {
	
	static int[] array = new int [13];
	
	public static int rollDice() {
		SecureRandom rand = new SecureRandom();
		int sum=0;
		
		int dice1 = 1 + rand.nextInt(6);
		int dice2 = 1 + rand.nextInt(6);
		
		sum = dice1 + dice2;
		
		return sum;
	}
	
	public static void displayFrequency() {	
		
		for(int i=0; i <= 36_000_000; i++) {
			
			++array[rollDice()];
			
		}		
		
	for(int m=2; m<array.length; m++) {
		
		System.out.printf("%2d        %d%n", m, array[m]);
	}
		
	}
	
	public static void main(String... args) {
		
		displayFrequency();
	}
}