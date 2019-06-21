package exercise6_18;

import java.util.Scanner;
public class SquareOfAstriskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of side: ");
		int side = input.nextInt();
		SquareOfAsterisk.displaySquareAst(side);
		input.close();
	}

}
