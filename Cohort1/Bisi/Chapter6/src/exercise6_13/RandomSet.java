package exercise6_13;
import java.security.SecureRandom;
public class RandomSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SecureRandom randomNumbers = new SecureRandom();
		
		
		int n = 2 + 2 * randomNumbers.nextInt(5);
			System.out.println(n);
			System.out.println();
			
		int m = 3 + 2 * randomNumbers.nextInt(5);
			System.out.println(m);
			System.out.println();
			
		int o = 6 + 4 * randomNumbers.nextInt(5);
			System.out.println(o);
			System.out.println();

	}

}
