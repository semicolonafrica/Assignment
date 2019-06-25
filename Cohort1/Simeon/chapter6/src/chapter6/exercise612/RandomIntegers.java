package chapter6.exercise612;

import java.security.SecureRandom;

public class RandomIntegers {

	public static void assignIntegers() {
		
		SecureRandom rand = new SecureRandom();
		
		
		int n1 = 1 + rand.nextInt(2);
		int n2 = 1 + rand.nextInt(100);
		int n3 = rand.nextInt(9);
		int n4 = 1000 + rand.nextInt(1112);
		int n5 = -1 + rand.nextInt(1);
		int n6 = -3 + rand.nextInt(11);
		
		
		System.out.println("Random integers: " + n1);
		System.out.println("Random integers: " + n2);
		System.out.println("Random integers: " + n3);
		System.out.println("Random integers: " + n4);
		System.out.println("Random integers: " + n5);
		System.out.println("Random integers: " + n6); 
	}
}
