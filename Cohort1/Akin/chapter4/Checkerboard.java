package chapters;

public class Checkerboard {

	public int getChecker() {
		int row = 8;
		while(row >= 1) {
			
			int column = 1;
			while(column <= 9) {
				System.out.print(row % 2 == 1 ? " *": "* ");
				
				++column;
			}
			--row;
			System.out.println();
		} 
		return column;
	}
	public static void main(String[] args) {
		Checkerboard my = new Checkerboard();

		my.getChecker();

	}

}
