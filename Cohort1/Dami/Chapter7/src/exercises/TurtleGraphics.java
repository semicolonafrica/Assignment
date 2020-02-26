package exercises;

import java.util.Scanner;

public class TurtleGraphics {
		// Creating objects of Class Scanner (To receive input from user) and Turtle.
		Scanner input = new Scanner(System.in);
		Turtle obj = new Turtle();
		
		// Method to collect input from user and move the turtle
	public void moveTurtle() {
		System.out.println("Command\t\tMeaninig");
		
		System.out.printf("%5d%17s%n%5d%17s%n%5d%17s%n%5d%17s%n%5s%21s%n%5d%17s%n%5d%17s%n", 1,"Pen up", 2, "Pen down", 3, "Turn right", 4, "Turn left", "5-10", "Move forward 10 spaces (replace 10 for a different number of spaces)", 6, "Display the 20-by-20 array", 9, "End of data (sentinel)");
		
		System.out.println("Enter number");
		int number = input.nextInt();
		
		int sentinel = 9;
		while(number != sentinel) {
			switch (number) {
				case 1:
					obj.penUp();
					break;
				case 2:
					obj.penDown();
					break;
				case 3:
					obj.turnRight();
					break;
				case 4:
					obj.turnLeft();
					break;
				case 5:
					System.out.println("Enter length");
					int length = input.nextInt();
					obj.moveForward(length);
					break;
				case 6:
					obj.displayArray();
					break;					
			}
			obj.printLocation();
			number = input.nextInt();
		}
	}
}
