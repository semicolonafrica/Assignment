package exercise619;
import java.util.Scanner;

public class ModifiedAsterickNumber {
	
	public static void calAsterick(int value,char fill) {
		for(int row = 1; row <= value; row++) {
			for(int columns = 1; columns <= value; columns++) {
				System.out.print(fill);
				
			}
			System.out.println();
			
		}
	
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int size = input.nextInt();
		
		System.out.println("Enter the Character: ");
		char charact =input.next().charAt(0);
		
		ModifiedAsterickNumber.calAsterick(size,charact);
//		System.out.println();

		input.close();
	}

}
