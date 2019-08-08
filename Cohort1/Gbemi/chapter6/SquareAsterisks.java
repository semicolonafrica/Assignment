/**
 * 
 */
package chapter6;

/**
 * @author gbemi
 *
 */
import java.util.Scanner;
public class SquareAsterisks {
	
	
	public static void printAsterisks() {
		
		Scanner input = new Scanner(System.in);
		int side;
		
		System.out.println("enter the number of side ");
		 side = input.nextInt();
		 
		 int counter=1;
		 
		 for(counter=1;counter<=side;counter++) {
			 
			 for(int y=1;y<=side;y++) {
				 System.out.print("*");
				 
			 }
			 
		
			 System.out.println();
		 }
		 
	
	}
	public static void main(String[] args) {
		printAsterisks();
	}

}
