package examples;
import java.security.SecureRandom;
public class RollDice {
/*
 * declare variables dieA and dieB to rep the 2 dice
 * declare sum variable
 * create an array of size  to represent our outcome 
 * create a loop for possible outcomes
 * increase frequency based out outcome of dice
*/
	static SecureRandom random = new SecureRandom();
	static int die1 = 0;
	static int die2 = 0;
	static int[] frequency= new int[13];
	
	
	public static int sum() {
		die1 = 1 + random.nextInt(6);
		die2 = 1 + random.nextInt(6);
		int sum = die1 + die2;
		return sum;
	}
	
	public static void rollDie(int roll) {
		for(int counter = 0; counter<roll ; counter++) {
			++frequency[sum()];
		}
		System.out.printf("%5s%10s%10s%n","index", "outcome","frequency");
		for(int i = 2; i<frequency.length; i++) {
			System.out.printf("%5d%10s%10s%n",i, sum(),frequency[i]);
		}		
	}
	
	
	
	public static void main(String[] args) {
		rollDie(36000000);
	}

}
