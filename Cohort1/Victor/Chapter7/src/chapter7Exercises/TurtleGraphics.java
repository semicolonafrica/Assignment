package chapter7Exercises;

import java.util.Scanner;

public class TurtleGraphics {
	
//	(Turtle Graphics) The Logo language made the concept of turtle graphics famous. Imagine
//	a mechanical turtle that walks around the room under the control of a Java application. The turtle
//	holds a pen in one of two positions, up or down. While the pen is down, the turtle traces out shapes
//	as it moves, and while the pen is up, the turtle moves about freely without writing anything. In this
//	problem, you’ll simulate the operation of the turtle and create a computerized sketchpad.
//	Use a 20-by-20 array floor that’s initialized to zeros. Read commands from an array that contains
//	them. Keep track of the current position of the turtle at all times and whether the pen is currently
//	up or down. Assume that the turtle always starts at position (0, 0) of the floor with its pen
//	up. The set of turtle commands your application must process are shown in Fig. 7.29.
//	Suppose that the turtle is somewhere near the center of the floor. The following “program”
//	would draw and display a 12-by-12 square, leaving the pen in the up position:
//	2
//	5,12
//	3
//	5,12
//	3
//	5,12
//	3
//	5,12
//	1
//	6
//	9

	Scanner input = new Scanner(System.in);
	int[][]floor = new int[10][10];
	
	
	public void getJoystick() {
	int counter =0;
		
//	while(input.nextInt() !=9) {
	while(counter !=9) {
		
	System.out.println("Enter 2 to pen down");
	int penDown = input.nextInt();
	
	System.out.println("Enter 5 to move");
	int move = input.nextInt();
	
	System.out.println("Enter 6 to move forward");
	int spaces = input.nextInt();
	
//	for(int row=0; row < spaces; row++) {
//		for(int column=0; column < spaces; column++) {
//			if(penDown == 2 && move == 5 && spaces == 6)
//				print(spaces);
//		}
//		System.out.println();
//		}
	
	
	if(penDown == 2 && move == 5 && spaces == 6) {
		printRow(spaces);
	if(penDown == 2 && move == 5 && spaces == 6) {
			printColumn(spaces);	
	}
	counter++;
	System.out.println();
	}
	}
	}
	

	public void printRow(int steps) {
	for(int counter=1; counter <=steps; counter++)
		System.out.print("* ");
		
	}
	
	public void printColumn(int steps) {
	for(int column=0; column <=steps; column++)
		
		switch (column) {
		
		case 0:
			System.out.println("* ");
			break;
		case 1:
			System.out.println("* ");
			break;
		case 2:
			System.out.println("* ");
			break;
		case 3:
			System.out.println("* ");
			break;	
		}
		
		
	}
	
	
	
	public void asterisks(int [][] printer) {
		int spaces = 0;
		int move =0;
	for(int row=0; row < printer[spaces].length; row++) {
		for(int column=0; column < spaces; column++) {
				System.out.print(floor[column]);

		}
	}
}
}