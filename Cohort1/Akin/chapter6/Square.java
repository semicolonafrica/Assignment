

public class Square {
	
	public static int squareOfAsterisks(int side,char fillCharacter) {
		
		for(int i = 1; i <= side; i++) {
			for(int j = 1; j <= side; j++) {
				System.out.print(fillCharacter);
			}
			System.out.println();
		}
		return side;
		
	}

	
}
