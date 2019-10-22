package chapter7.exercise710;

import java.security.SecureRandom;
public class SalesCommission {
	
	public void countSalesCommission() {
		SecureRandom randomNumbers = new SecureRandom();
		int [] frequency = new int [8];
		double dollars = 0;
		double salary = dollars * 0.09 + 200;
		int range = (int)(salary/100);
		
		
		for (int i =1; i < frequency.length; i++) {
			++frequency[1 + randomNumbers.nextInt(7)];
		}
		
		if(range > 9)
			range = 10;
		
		++frequency[range = 2];
		
		System.out.println("Range\t\tNumber");
		
		for (int count = 0; count < frequency.length; count++) {
			System.out.println( "$" + (200 + 100 * count) + "-$" + (299 + 100 * count) + "\t\t" + frequency[count]);
			
		
		}
		System.out.println("$1000 and over\t\t" + frequency[frequency.length - 1]);	
	}

}
