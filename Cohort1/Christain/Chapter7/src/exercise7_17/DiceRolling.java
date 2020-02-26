package exercise7_17;
import java.security.SecureRandom;
public class DiceRolling {
	 public void calRoll() {
	SecureRandom random = new SecureRandom();
	int die1 = 0;
	int die2 = 0;
	int[] frequency = new int [13];
	int sum =0;
	
	for(int roll = 1; roll <= 300; roll++) {
		
		die1 = 1 + random.nextInt(6);
		die2 = 1+ random.nextInt(6);
		sum = die1 + die2;
		
		++frequency[sum];
		
	}
	System.out.printf("%2s%15s%n", "Index", "Frequency");
	for(int v =2; v < frequency.length; v++) {
		
		System.out.printf("%5d      %10d%n", v, frequency[v]);
	}
	
		
	
	 }

}
