/**
 * 
 */
package exercise5_15;

/**
 * @author ken_granero
 *
 */
import java.util.Scanner;

public class Triangle {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = insert.nextInt();
		
		for(int counter = 0; counter <= num; counter++){
			
			for(int i = counter; i > 0; i--) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		System.out.println();
		
		for(int counter = num; counter > 0; counter--) {
			
			for(int i = counter; i > 0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int counter = num; counter > 0; counter--) {
			
			for(int i = counter; i > 0; i--) {
				
				System.out.print("*");
				
			}
			System.out.println();
			if(counter == 10) {
				System.out.printf("%1s","");
			}
			else if(counter == 9) {
				System.out.printf("%2s","");
			}
			else if(counter == 8) {
				System.out.printf("%3s","");
			
			}
			else if(counter == 7) {
				System.out.printf("%4s","");
			
			}
			else if(counter == 6) {
				System.out.printf("%5s","");
			
			}
			else if(counter == 5) {
				System.out.printf("%6s","");
			
			}
			else if(counter == 4) {
				System.out.printf("%7s","");
			
			}
			else if(counter == 3) {
				System.out.printf("%8s","");
			
			}
			else if(counter == 2) {
				System.out.printf("%9s","");
			
			}
			else if(counter == 1) {
				System.out.printf("%10s","");
			
			}
		}
		System.out.println();
		
		for(int counter = 1; counter <= num; counter++) {
			
			if(counter == 1) {
				System.out.printf("%10s","");
			}
			for(int i = counter; i > 0; i--) {
				
				System.out.print("*");
				
			}
			System.out.println();
			if(counter == 1) {
				System.out.printf("%9s","");
			
			}
			if(counter == 2) {
				System.out.printf("%8s","");
			}
			else if(counter == 3) {
				System.out.printf("%7s","");
			
			}
			else if(counter == 4) {
				System.out.printf("%6s","");
			
			}
			else if(counter == 5) {
				System.out.printf("%5s","");
			
			}
			else if(counter == 6) {
				System.out.printf("%4s","");
			
			}
			else if(counter == 7) {
				System.out.printf("%3s","");
			
			}
			else if(counter == 8) {
				System.out.printf("%2s","");
			
			}
			else if(counter == 9) {
				System.out.printf("%1s","");
			
			}
			else if(counter == 10) {
				System.out.printf("%s","");
			}
			
			
			
	}

		insert.close();		
		

	}

}
