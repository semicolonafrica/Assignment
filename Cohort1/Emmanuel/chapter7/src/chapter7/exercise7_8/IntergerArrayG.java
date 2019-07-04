/**
 * 
 */
package chapter7.exercise7_8;

import java.security.SecureRandom;

/**
 * @author Emmanuel Akinbode
 *
 */
public class IntergerArrayG {

	static SecureRandom randomNumbers = new SecureRandom();
	
	
	public static void arrayG(){
		
		int [] g = new int[6];
		
		for(int counter = 1; counter < g.length; counter++) {
			
			System.out.printf("%d",g[counter]+8 );
		}
		
	}
		
			
	public static double totalFloatPoint() {
		
		final int ARRAY_LENGTH = 100;
		double [] c = new double [ARRAY_LENGTH];
		
		double total = 0;
		for(int i = 0; i<c.length; i++) {
			c[i] += 1 + i;
			total += c[i];			
		}
				
			return total;
		
	}
	
	public static void copyArray() {
	
		int [] a = new int[11];
		int [] b = new int[34];
		
		for(int i = 0; i < a.length; i++) {
			a [i] = 11 + randomNumbers.nextInt(30);
			//System.out.println(a[i]);
			b[i]= a[i];
		}
		
		
		for(int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
	
	}
	
	public static void smallestAndLargest() {
		
		final int ARRAY_LENGTH = 99;
		double [] w = new double [ARRAY_LENGTH];
		double smallest = 0;
		double largest = 0;
		
		for(int i = 0; i<w.length; i++) {
			//w[i] += 1 + i;	
			w [i] = 1 + randomNumbers.nextInt(200);
			System.out.println(w[i]);
			
	}
		largest = w[1];
		smallest = w[1];
		
		for(int j = 0; j < w.length; j++) {
			if(w[j] > largest) {
				largest = w[j];
				
			}else if(w[j] < smallest) {
				smallest = w[j];
				
			}
			
		}
		System.out.println("Largest is " + largest);
		System.out.println("Smallest is " + smallest);

}
	public static void main(String[] args) {
			
			//IntergerArrayG.arrayG();
			//System.out.println(IntergerArrayG.totalFloatPoint());
			//copyArray();
			smallestAndLargest();
	}
}
