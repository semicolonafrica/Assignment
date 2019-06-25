package chapter6.exercise618;


public class AsterickNumber {
	
	public static void squareOfAsterick(int value ) {
		
		
	
		
		for(int row = 1; row<= value; row++) {
			
			for(int columns = 1; columns<= value; columns++) {
				System.out.print("*");
			}
			
				System.out.println();
		}
	}

}
