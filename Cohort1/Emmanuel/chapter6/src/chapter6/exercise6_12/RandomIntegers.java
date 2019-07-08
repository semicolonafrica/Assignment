/**
 * 
 */
package chapter6.exercise6_12;

import java.security.SecureRandom;

/**
 * @author Emmanuel Akinbode
 *
 */

	
	public class RandomIntegers {
		SecureRandom random = new SecureRandom();		
		
		public int generateNumBetweenOneAndTwo() {
						
			int n = 1 + random.nextInt(2);
			System.out.print(n);
			return n;
		} 
		public int generateNumBetweenOneAndHundred() {
			
			int n = 1 + random.nextInt(100);
			System.out.print(n);
			return n;
		} 
		public int generateNumBetweenZeroAndNine() {
			
			int n = random.nextInt(10);
			System.out.print(n);
			return n;
		} 
		public int generateNumPointFour() {
			//Number 1000 and 1112
			
			int n = 1000 + random.nextInt(1112);
			System.out.print(n);
			return n;
		} 
		public int generateNumPointFive() {
			
			int n = -1 + random.nextInt(2);
			System.out.print(n);
			return n;
		} 
		public int generateNumPointSix() {
			
			int n = -3 + random.nextInt(12);
			System.out.print(n);
			return n;
		} 
		
		
}
	


