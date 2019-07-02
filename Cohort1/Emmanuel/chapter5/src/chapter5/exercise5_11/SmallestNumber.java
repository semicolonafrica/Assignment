/**
 * 
 */
package chapter5.exercise5_11;

import java.util.Scanner;

/**
 * @author Emmauel Akinbode
 *
 */
public class SmallestNumber {

	/**
	 * @param args
	 */
	public int getNumber(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value");
		int value = input.nextInt();
		
		int smallestNum = value;
		
		int counter = 1;
		
		while(counter < value) {
			
			System.out.print("Enter value: ");
			value = input.nextInt();
			
			if(value<smallestNum) {
				smallestNum = value;
		}
			counter++;
		}
		return smallestNum;
	}

}
