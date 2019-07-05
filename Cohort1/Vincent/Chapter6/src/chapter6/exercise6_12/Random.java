package chapter6.exercise6_12;

import java.security.SecureRandom;

public class Random {
	
	private static final SecureRandom randomNumbers = new SecureRandom();

	public static void findRandomNumber(){

		int  a = 1+randomNumbers.nextInt(2);
		int b = 1+randomNumbers.nextInt(100);
		int c = randomNumbers.nextInt(9);
		int d = 1000+randomNumbers.nextInt(1112);
		int e = randomNumbers.nextInt(1);
		

			System.out.printf("The value of a is: %d\t%n ",a);
		
			System.out.println("The value of b is: "+b);
		
			System.out.println("The value of c is: "+c);
		
			System.out.printf("The value of d is:%d\t\t%n ",d);
			
			System.out.println("The value of e is: "+e);
		}
	
	}


