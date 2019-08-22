package chapter7.practice;
import java.security.SecureRandom;
public class RollDie {

	public static void main(String[] args) {
		
		SecureRandom randomNumbers = new SecureRandom();
		int [] frequency = new int [7];
		
		for(int counter = 1; counter <= 6000000; counter++) 
			++frequency[1 +randomNumbers.nextInt(6) ];
			
			System.out.printf("%s%10s\n", "face", "frequency");
			
			for(int face = 1; face < frequency.length; face++)
				System.out.printf("%4d%10d\n", face, frequency[face]);
		}

	}


