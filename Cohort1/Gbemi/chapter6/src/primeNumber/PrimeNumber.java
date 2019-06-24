/**
 * 
 */
package primeNumber;

/**
 * @author gbemi 
 *
 */

import java.util.Scanner;
public class PrimeNumber {
	public static void isPrimeNumber(int number) {
		 
		 String store = " ";
		 for(int i = 1; i <=number;i++) {
			 	
		 if(i%2==1 ) {
			 
			 
			 
				store= store + " "+ i +"\n";
		 }
		 else {
			 store=store;
		 }
		 
	}
		 
		 System.out.println("\n" +store + "\n");	 
	}
 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int value=input.nextInt();
		//(isPrimeNumber(value));
		isPrimeNumber(value);
	}
}



