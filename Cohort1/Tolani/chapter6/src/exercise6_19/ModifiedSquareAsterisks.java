package exercise6_19;

public class ModifiedSquareAsterisks {
	public static void printSquareAsterisks(int number,char character) {
		for(int i =1;i<=number;i++) {
			for(int j =1;j<=number;j++) {
				System.out.print(character);
			}
			System.out.println();
		}
	}

}
