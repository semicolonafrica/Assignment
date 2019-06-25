package exerecise6_12;
import java.security. SecureRandom;
public class RandomNumbers {

	public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
		
		int n1 =  1 + randomNumbers.nextInt(2);
		System.out.println("Random numbers of n for 1 ≤ n ≤ 2 = " + n1);
		
		int n2 = 1 + randomNumbers.nextInt(100);
		System.out.println("Random numbers of n for 1 ≤ n ≤ 100 = " + n2);
		
		int n3 = 0 + randomNumbers.nextInt(9);
		System.out.println("Random numbers of n for 0 ≤ n ≤ 9 = " + n3);
		
		int n4 = 1000 + randomNumbers.nextInt(112);
		System.out.println("Random numbers of n for 1000 ≤ n ≤ 1112 = " + n4);
		
		int n5 = (-1) + randomNumbers.nextInt(3);
		System.out.println("Random numbers of n for -1 ≤ n ≤ 1 = " + n5);
		
		int n6 = (-3) + randomNumbers.nextInt(15);
		System.out.println("Random numbers of n for -3 ≤ n ≤ 11 = " + n6);

	}

}
