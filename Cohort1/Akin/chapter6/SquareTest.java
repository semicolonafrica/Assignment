import java.util.Scanner;

public class SquareTest {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		int side = input.nextInt();
		
		System.out.print("Enter the the fill character: ");
		char fill = input.next().charAt(0);
		
		Square.squareOfAsterisks(side, fill);
		

		input.close();
	}

}
