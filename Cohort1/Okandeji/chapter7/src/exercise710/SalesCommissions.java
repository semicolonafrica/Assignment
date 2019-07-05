package exercise710;

import java.security.SecureRandom;

public class SalesCommissions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] salesEarnings = new double[20];
		int[] frequency = new int[11];
		double totalEarnings;
		double totalSales;
		
		SecureRandom ranNum = new SecureRandom();
		for(int count = 0; count < salesEarnings.length; count++) {
			totalSales = 500 + ranNum.nextInt(10_000);
			totalEarnings = 200 + (totalSales * 0.09);
			salesEarnings[count] = totalEarnings;
			
			if(salesEarnings[count]/100 >= 10) 
				++frequency[10];
				else
					++frequency[(int)salesEarnings[count]/100];
			
		}
		for(int count = 2; count < frequency.length; count++) {
			if(count == 10) {
				System.out.printf("%14s%8d%n", "$1000 and over", frequency[10]);
			}
			else
			System.out.printf("%d%s%d%15d%n", (count*100), "-", ((count*100) + 99), frequency[count]);
		}
	}

}
