package chapter6.exercise6_18;

//Write a method
//squareOfAsterisks that displays a solid square (the same number of
//rows and columns) of asterisks whose side is specified in integer
//parameter side. For example, if side is 4, the method should display
//Incorporate this method into an application that reads an integer value for
//side from the user and outputs the asterisks with the
//squareOfAsterisks method.

public class SquareAsterisks {

	public static void displaySquare() {
	
	int x = 4;
	
	for(int count = 1; count <= 4; count++) {
		
		for(int counter = 1; counter <= x; counter++) {
			System.out.print("*");
		}
		System.out.println();
	}

		
	}		
	
}
