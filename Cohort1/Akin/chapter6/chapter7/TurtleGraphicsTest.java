package chapter7;

import java.util.Scanner;

public class TurtleGraphicsTest {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int row = 0;
		int turtle = 0;
		System.out.print("You are at position (0,0)\n and the Turtle pen is up.");
		
		System.out.print("Enter 2 to pen down and start writing: ");
		int move = input.nextInt();
		
		System.out.print("Enter the spaces to move");
		row = input.nextInt();
		int[][] floor = new int[row][row];
		
		if( move == 2) {

		System.out.printf("%s%d%s%n","You moved to (0," ,row,")");
		} else {
			System.out.print("Pen is Up. Enter 2 to start writing.");
		}
		System.out.print("Enter the direction to move either right or left: ");
		int firstDirection = input.nextInt();
		if(firstDirection == 3) {
			System.out.print("Enter the spaces to move");
			turtle = input.nextInt();
			System.out.printf("%s%d,%d%s%n%n","You moved to (",row ,row,")");
		} 
		
		//System.out.print("System.out.print(\"Enter the position to move either right or left: \");");
//		System.out.print("Enter the spaces to move");
//		TurtleGraphics.row = input.nextInt();
//		System.out.printf("%s%d%d%s%n","You moved to (",TurtleGraphics.row ,TurtleGraphics.row,")");
		
		//System.out.print("System.out.print(\"Enter the position to move either right or left: \");");
		System.out.print("Enter the spaces to move");
		turtle = input.nextInt();
		System.out.printf("%s%d,%s%s%n%n","You moved to (",row ,"0",")");
		
		//System.out.print("System.out.print(\"Enter the position to move either right or left: \");");
		System.out.print("Enter the spaces to move");
		turtle = input.nextInt();
		System.out.printf("%s%n","You moved to (0,0)");
		
		
		
		System.out.printf("Enter the character to display the(%d x %d) array",row,row);
		char character1 = input.next().charAt(0);
		
		System.out.print("Enter 6 to display the (%d x %d) array");
		int six = input.nextInt();
		
		System.out.println("Enter 9 to end: ");
		int nine = input.nextInt();
		
		while(nine != 9) {
		if(six == 6) {
		TurtleGraphics.direction(floor,character1);
		} else {
			System.out.print("Enter 9 to cancel.");
		}
		nine = input.nextInt();
	}
	}
}
