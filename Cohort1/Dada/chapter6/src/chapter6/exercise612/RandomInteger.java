package chapter6.exercise612;
import java.security.SecureRandom;
public class RandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		
		int rand = 1 + random.nextInt(2); // 6.12a
		
		System.out.println(rand);
		
		int rand2 = 1 + random.nextInt(100); // 6.12b
		
		System.out.println(rand2);
		
		int rand3 = random.nextInt(10); // 6.12c
		
		System.out.println(rand3);
		
		int rand4 = 1000 + random.nextInt(113); // 6.12d
		
		System.out.println(rand4);
		
		int rand5 = -1 + random.nextInt(3); // 6.12e
		
		System.out.println(rand5);
		
		int rand6 = -3 + random.nextInt(15); //// 6.12f
		
		System.out.println(rand6);
		
		
	}

}
