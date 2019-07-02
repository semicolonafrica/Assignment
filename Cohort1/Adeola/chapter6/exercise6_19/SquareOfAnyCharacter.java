package exercise6_19;

public class SquareOfAnyCharacter {
	public static void squareOfAnyCharacter(int side, char fillCharacter) {
		for (int i= 1; i<= side; i++) {
			for(int a = 1; a<=side; a++) {
				System.out.print(fillCharacter+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareOfAnyCharacter(4, '#');
		squareOfAnyCharacter(9, '$');
		squareOfAnyCharacter(13, '%');

	}
}
