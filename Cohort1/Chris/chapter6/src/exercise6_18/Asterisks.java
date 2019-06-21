package exercise6_18;
import java.util.Scanner;

public class Asterisks {
	
	public static void squareOfAsterisks(int size) {
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int side = input.nextInt();
		System.out.println();
		squareOfAsterisks(side);
		
	
		
	}

}
