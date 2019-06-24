package chapter6.exercise618;
import java.util.Scanner;
public class SquareOfAsterisks {
	
	public static int printiAsterisk() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println(" Enter number of Asterisks: ");
		
		int asterisk = input.nextInt();
		
		int squareAsterisk = designAsterisk(asterisk);
		
		return squareAsterisk;
		
		
	}
	
	
	public static int designAsterisk (int number) {
		// this loop statement helps to print new line after every counter
		for (int counter = 1; counter <= number; counter++) {
			System.out.println();
			
			// this loop statement is use to print asterisk based on input
			for (int counter2=1; counter2 <= number; counter2++) {
				
				System.out.print("*");
				System.out.print(' '); //  this is use to print space between asterisk
 
	
		}
			
		}
		
		return number;
	}
 
	
}
