package asterisks;

//(Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays
//a solid
//square (the same number of rows and columns) of asterisks whose side is specified
//in integer param-
//eter side . For example, if side is 4 , the method should display

public class SquareApp {
	
	public static void squareOfAsterisks(int side) {
		for(int i = 1; i<= side; i++) {
			for(int j = 1; j <=side; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
