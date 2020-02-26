package arrayPractice;
import java.security.SecureRandom;
public class RollDie {
	
	public void calRoll() {
		SecureRandom random = new SecureRandom();
		
		System.out.printf("%s%10s%n", "Faces", "Frequency");
		
		// roll die 6,000,000 times; use die value as frequency index	
		int frequency[] = new int [7];
		for(int roll = 1; roll <= 60_000; roll++)
			++frequency [1 + random.nextInt(6)];
	
		// output each array element's value
			for(int face = 1; face < frequency.length; face++)
				System.out.printf("%4d%10d%n", face, frequency[face]);
	}

}
