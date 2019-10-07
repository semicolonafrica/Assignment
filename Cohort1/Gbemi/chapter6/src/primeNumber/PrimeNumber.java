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
	
	public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
        result[j] = list[i];
    }
        for(int number:result)
        	
        System.out.print(number);
        return result;
   }
 
	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("enter a number");
//		int value=input.nextInt();
//		
//		isPrimeNumber(value);
		reverse(new int[] {6,5,4,3,2,1});
	}
}



