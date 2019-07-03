package characters;

public class PrintCharacter {
	public static void squareOfCharacters(int side, char fillCharacter) {
		for(int i = 1; i<= side; i++) {
			for(int j = 1; j <=side; j++) {
				System.out.print(fillCharacter);
			}
			System.out.println();
		}
	}

}
