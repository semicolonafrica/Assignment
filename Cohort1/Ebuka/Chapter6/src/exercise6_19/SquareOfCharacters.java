package exercise6_19;

//@author CHIMA CHUKWUEBUKA
import java.util.Scanner;

public class SquareOfCharacters {

	// @param args
	public static void squareOfCharacter() {
		
		Scanner aster = new Scanner(System.in);
		
		System.out.println("Enter Number of Side:");
			int side = aster.nextInt();
			
			System.out.println("Enter Number of Side");
			char fill = aster.next().charAt(0);
			
			for(int i = 1; i <= side; i++) {
				
			for(int j = 1; j <= side; j++) {
					System.out.print(fill);
				}
				System.out.println();
			}
	}

// @param args
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SquareOfCharacters.squareOfCharacter();
	}

	}
