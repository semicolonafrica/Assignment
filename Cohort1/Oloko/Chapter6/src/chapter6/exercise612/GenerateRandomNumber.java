package chapter6.exercise612;

import java.security.SecureRandom;


public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		SecureRandom mygame = new SecureRandom();
		//1<=n <2
		int x;
		x = 1+ mygame.nextInt(2);
		
		System.out.println(x);
		
		int y = 1+ mygame.nextInt(100);
		System.out.println(y);
		
		int z = mygame.nextInt(10);
		System.out.println(z);
		
		int j = 1000+mygame.nextInt(113);
		System.out.println(j);
		
		int k = mygame.nextInt(3)-1;
		System.out.println(k);
		
		int m = mygame.nextInt(15)-3;
		System.out.println(m);

	}
	
	

}
