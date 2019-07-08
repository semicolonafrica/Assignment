package exercise6_18;

public class SquareOfAsterisk {
	public static void displaySquareAst(int a) {
		int row = a;
		int side = a;
		int i,j;
		for(i=row;i>0;i--) {
			for(j= side; j>0;j--) {
				System.out.print(" * ");
			}
				
			System.out.println();
		}
		
	}
}
