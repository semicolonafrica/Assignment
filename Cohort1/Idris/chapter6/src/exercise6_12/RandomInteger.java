package exercise6_12;

import java.security.SecureRandom;
public class RandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom rand = new SecureRandom();
		int data =1+rand.nextInt(2);
		System.out.println("the random didgt generated is: "+ data );
		
		int eng = 1+rand.nextInt(100);
		System.out.println("The random digit generated is: "+eng);
		
		int son = rand.nextInt(10);
		System.out.println("The random digit generated is: "+son);
		
		int dad = 1000+rand.nextInt(112);
		System.out.println("The random digit generated is: "+dad);
		
		int naf = -1+rand.nextInt(1);
		System.out.println("The random digit generated is: "+naf);
		
		int ant = -3+rand.nextInt(11);
		System.out.println("The random digit generated is: "+ant);
		}

}
