package exercise6_18;

// @author CHIMA CHUKWUEBUKA
 import java.util.Scanner;
public class SquareOfAsterisks {
	
	public static void squareOfAsterisks() {
		
		Scanner aster = new Scanner(System.in);
		
		System.out.println("Enter Number of Side:");
			int side = aster.nextInt();
			
			for(int i = 1; i <= side; i++) {
				
				for(int j = 1; j <= side; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	}

// @param args
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SquareOfAsterisks.squareOfAsterisks();
	}

}
