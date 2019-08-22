package exercise7_17;
//import SecureRandom class
import java.security.SecureRandom;
public class DiceRolling {

	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int dieA =0;
		int dieB =0;
		
		int[] outcome = new int[11];
		int sum =0;
		
		for(int i = 1; i<= 36000000; i++) {
			dieA = 1 + random.nextInt(6);
			dieB = 1 + random.nextInt(6);
			sum = dieA + dieB;
			
			++outcome[sum-2];
		}
		System.out.printf("%8s%8s%8s%n","rolls","sum","outcome");
		for(int j=0; j<outcome.length;j++) {
			System.out.printf("%8d%8d%8d%n", j,j+2, outcome[j]);
		}
		
	}

}
