package chapter6.exercise619;


public class AsterickNumber {
	
	public static void calAsterick(int value,char fill) {
		for(int row = 1; row <= value; row++) {
			for(int columns = 1; columns <= value; columns++) {
				System.out.print(fill);
				
			}
			System.out.println();
			
		}
	
	}

}
