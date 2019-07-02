package characters;


import java.util.Scanner;

public class FillCharacterTest {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("ENTER SIDES: ");
		int side = input.nextInt();
		
		System.out.print("ENTER FILL CHARACTER: ");
		char fill = input.next().charAt(0);
		
		PrintCharacter.squareOfCharacters(side, fill);
	}
}
	