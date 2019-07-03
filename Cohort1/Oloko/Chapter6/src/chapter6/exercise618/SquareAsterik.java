/**
 * 
 */
package chapter6.exercise618;

import java.util.Scanner;

/**
 * @author Olayinka oloko
 *
 */
public class SquareAsterik {
	
	public static void squareAsterik(int number){
		
		for(int i = 1; i<=Math.pow(number, 2); i++) {
		System.out.print("*");
	   
		if(i % number==0) 
			System.out.println();
		
	    	
		}
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner asterik = new Scanner(System.in);
		
		squareAsterik(4);
		
	}
	
	

}
