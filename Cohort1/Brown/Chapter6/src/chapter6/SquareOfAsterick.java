package Chapter6.exercise6_18;
import java.util.Scanner;
public class SquareOfAsterick {
	
	public static void squareOfAsterick() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer value for a side of a square: ");
		int side = input.nextInt();
		
		for(int i =0; i < side; i++) {
			for(int j =0; j < side; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		SquareOfAsterick.squareOfAsterick();
	}

}
