package chapter7.exercises;

import java.util.Scanner;

public class TurtleGraphicsTest {	
		
		public static void moveTurtle() {
			Scanner input = new Scanner(System.in);
			TurtleGraphics lem = new TurtleGraphics();
			
			System.out.println("Enter your Command choice(9 to end):");
			System.out.println("(1)	Pen up");
			System.out.println("(2)	Pen down");
			System.out.println("(3)	Turn right");
			System.out.println("(4)	Turn left");
			System.out.println("(5)	Move 10 spaces forward");
			System.out.println("(6)	Display  the shape");
			
			int control = input.nextInt();
			
			while(control != 9) {
			
			
			switch(control) {
			case 1: 
				lem.penUp();
				break;
				
			case 2: 
				lem.penDown();
				break; 
				
			case 3: 
				lem.turnRight();
				break;
				
			case 4:
				lem.turnLeft();
				break;
				
			case 5:
				System.out.println("Enter number of spaces: ");
				int spaces = input.nextInt();
				lem.moveForward(spaces);
				break;
			case 6:
				System.out.println("Enter character: ");
				char sign = input.next().charAt(0);
				lem.displayArray(sign);
				break;
				
			}
			lem.displayPosition();
			System.out.println();
			control = input.nextInt();
			
			}
			input.close();
		}
		
		public static void main(String[] args) {
			moveTurtle();
		}

}