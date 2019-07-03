package exercise6_19;

public class SquareOfChar {
	public static void displaySquareAst(int a, char b) {
		int row = a;
		int side = a;
		int i,j;
		for(i=row;i>0;i--) {
			for(j= side; j>0;j--) {
				System.out.print(b);
			}
				
			System.out.println();
		}
		
	}

}
