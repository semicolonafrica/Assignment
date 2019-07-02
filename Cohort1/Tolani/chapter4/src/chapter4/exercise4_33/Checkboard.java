/**
 * 
 */
package chapter4.exercise4_33;

//import java.util.Scanner;

/**
 * @author USER
 *
 */
public class Checkboard {
	public static void main(String [] args) {
		
		int counter = 1;
		
		
		while(counter <= 4 )
		{
			int rows = 1;
			while(rows <= 8 )
			{
				System.out.print("* ");
				rows++;
			}
			System.out.println();
			System.out.print(" ");
			
			int next = 1;
			while(next <= 8)
			{
				System.out.print("* ");
				next++;
			}
			
			System.out.println();
		counter++;
		}
	}

}
