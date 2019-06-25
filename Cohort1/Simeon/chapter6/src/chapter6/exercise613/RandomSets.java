package chapter6.exercise613;

import java.security.SecureRandom;


public class RandomSets {

	static SecureRandom rand = new SecureRandom();
//	static Scanner input = new Scanner(System.in);

	public static void randomEven() {

		int counter = 0;
		
		while(counter <=5) {

			int n = 2 + rand.nextInt(10);
			if (n % 2 == 0)
				System.out.println("Random Even number is: " + n);
				break;
		}
		
	}
	
	public static void randomOdd() {
		
		int counter1 = 0;
		
		while(counter1 <=5) {
			int n = 3 + rand.nextInt(11);
			if (n % 2 == 1)
				System.out.println("Random Odd number is: " + n);
				break;
		}
	}
	
	public static void randomFours() {
		
		int counter2 = 0;
		
		while(counter2 <= 5) {
			int n = 6 + rand.nextInt(22);
			if (n % 4 == 2)
				System.out.println("Random Number is :" + n);
				break;
		}
			
	}
}