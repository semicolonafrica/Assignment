package chapter6_branch;

import java.security.SecureRandom;

public class RandomNumberFromSet {

	public static void main(String[] args) {
		SecureRandom setgame= new SecureRandom();
		
		int a = 1+ setgame.nextInt(10);
		if(a%2==1)
			a = a+1;
		
		System.out.println(a);
		
		int b = 1+ setgame.nextInt(11);
		if(b%2==0)
			b = b+1;
		
		System.out.println(b);
		
		int c = 1+setgame.nextInt(11);
		if(c%2==0)
			b = 1+b;
		if(b==1)
			b= b +2;
		
		b= b*2;
		
		System.out.println(b);
			
	}

}
