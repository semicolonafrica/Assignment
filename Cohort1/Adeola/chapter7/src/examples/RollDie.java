package examples;
import java.security.SecureRandom;
public class RollDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		int[] die = new int[7];
		for(int roll=1; roll<=6000000; roll++ ) {
			++die[1+random.nextInt(6)];
		}
		for(int face =1 ;face< die.length;face++) {
			System.out.printf("%d %10d%n", face, die[face]);
		}

	}

}
