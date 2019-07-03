/**
 * 
 */
package chapter5.exercise5_25;

import java.util.Scanner;

/**
 * @author USER
 *
 */
public class ModifiedDiamond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter number: ");
		 int number = input.nextInt();
		 int c = 1;
		 int a = number;
		 
		 for(int counter = 1 ; counter <= number; counter++) {
			 for(int i = a; i >= 1; i--) {
				 System.out.print(" ");
			 }
				 for(int j = 1; j<=c; j++) {
					 System.out.print("*");
					 
				 }
				 
				 if(counter > number/2) {
					 a+=1;
					 c-=2;
				 }
				 else {
					 a-=1;
					 c+=2;
				 }
				 System.out.println();
			 
		 }
	}

}
