/**
 * 
 */
package chapter7.exercise7_10;


import java.security.SecureRandom;


/**
 * @author Emmanuel Akinbode
 *
 */
public class SalesCommission {
	static SecureRandom randomNumbers = new SecureRandom();
	
	public static double getGross(int [] gross) {
		
		double total = 0;
		
		for(int i =0; i < gross.length; i++) {
			gross [i] = 200 + randomNumbers.nextInt(2000);
			//System.out.println(gross[i]);
			total = 200 + (gross[i] * 0.09);
		}
		return total;

	
	}
	public static void calGross( ){
		int [] gross = new int [25];
	   
		int [] freq = new int [11];
		
		getGross(gross);
		
		for(int counter = 0; counter < gross.length; counter++) {
//			System.out.println(gross[counter]);
			if(gross[counter]/100 >10)
				++freq[10];
			else 
			++freq[gross[counter]/100];
		
		
		}
		System.out.printf("%s%12s%n", "Gross Sales", "Frequency");
		System.out.println();
		for(int j=2; j <freq.length; j++) {
			if (j == 10) 
				System.out.printf("%s%5s%5d","$", "1000 and above", freq[j]);
				else
				System.out.printf("%s%3d-%3d%12d%n","$",j * 100, j * 100 + 99, freq[j]);
			
			
			
		}
	
	}
	

}
