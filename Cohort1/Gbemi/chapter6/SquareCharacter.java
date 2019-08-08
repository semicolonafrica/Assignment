/**
 * 
 */
package chapter6;

import java.util.Scanner;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;

public class SquareCharacter {
	
public static void printAsterisks(int x,char fillCharacter) {
		
		Scanner input = new Scanner(System.in);
		int side;
		
		System.out.println("enter the number of side ");
		 side = input.nextInt();
		 
		 System.out.println("enter the character ");
		 char fill = input.next().charAt(0);
		 
		 int counter=1;
		 
		 for(counter=1;counter<=side;counter++) {
			 
			 for(int y=1;y<=side;y++) {
				 System.out.print(fill +" ");
				 
			 }
			 
		
			 System.out.println();
		 }
		 
	
	}
	public static void main(String[] args) {
		printAsterisks(1,'@');
	}


}
