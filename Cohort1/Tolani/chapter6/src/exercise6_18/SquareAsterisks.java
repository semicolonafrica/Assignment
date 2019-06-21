package exercise6_18;

public class SquareAsterisks {
	
	public static void printSquareAsterisks(int number) {
		for(int i =1;i<=number;i++) {
			for(int j =1;j<=number;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
