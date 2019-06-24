package exercise6_12;
import java.security.SecureRandom;

public class RandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom randomNumbers = new SecureRandom();
		int a = 1 + randomNumbers.nextInt(2);
			System.out.println(a);
			System.out.println();
		
		int b = 1 + randomNumbers.nextInt(100);				
			System.out.println(b);
			System.out.println();
			
		int c = randomNumbers.nextInt(10);
			System.out.println(c);
			System.out.println();
		
		int d = 1 + randomNumbers.nextInt(1112);
			System.out.println(d);
			System.out.println();
		
		int e = -1 + randomNumbers.nextInt(2);
			System.out.println(e);
			System.out.println();
		
		int f = -3 + randomNumbers.nextInt(14);
			System.out.println(f);
			System.out.println();
		}
}