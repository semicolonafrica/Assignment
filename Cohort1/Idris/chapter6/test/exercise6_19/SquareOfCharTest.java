package exercise6_19;

import java.util.Scanner;
public class SquareOfCharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side of the square: ");
		int side = input.nextInt();
		System.out.print("Enter the character to be dispslyed: ");
		char hash = input.next().charAt(0);
		
		SquareOfChar.displaySquareAst(side, hash);
		input.close();
	}

}
