package exercise618;
import java.util.Scanner;

public class AsterickNumber {
	
	public static void squareOfAsterick(int value ) {
		
		
	
		
		for(int row = 1; row<= value; row++) {
			
			for(int columns = 1; columns<= value; columns++) {
				System.out.print("*");
			}
			
				System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int size = input.nextInt();
		AsterickNumber.squareOfAsterick(size);
		
		input.close();

	}

}
