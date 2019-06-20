package exercise6_18;

public class SquareOfAsterisk {
	public static void displaySquareAst() {
		int row = 4;
		int side = 4;
		int i,j;
		for(i=row;i>0;i--) {
			for(j= side; j>0;j--) {
				System.out.print(" * ");
			}
				
			System.out.println();
		}
		
	}
}
