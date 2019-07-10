/**
 * 
 */
package chapter7Exercise712;

import java.util.Scanner;

/**
 * @author Olayinka Oloko
 *
 */
public class DuplicationElimination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int [] array= new int [5];
		
		int user;

		for(int counter = 0; counter < array.length; counter++) {
			System.out.print("Input number");
			user = input.nextInt();
			
		 if(user < 10 || user > 100) {
				 System.out.print("prompt invalid");
				 user = input.nextInt();
		 	}
				 
			if(user != array[0] && user != array[1] && user!= array[2] && user != array[3] && user != array[4]) {
				array[counter] = user;
				
				for(int y = 0; y > array.length; y++) {
					if( y!=0)
						System.out.printf("%d ", y);
				}
		}
			else {
				System.out.println("Invalid, type again");
				user = input.nextInt(); 
				array[counter] = user;				
				System.out.println(array[counter]);
			}
			
			}
		
		 for(int i = 0; i < array.length; i++) {
			 System.out.printf("%2d ",array[i]);
				}
	}
}