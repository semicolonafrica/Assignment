package chapter7.exercise7_21;
import java.util.Scanner;
public class TurtleGraphics {
	     Turtle obj = new Turtle();
	 	Scanner input = new Scanner(System.in);
		
		public void takeAction() {
		System.out.println("1 to \tpenUp");
		System.out.println("2 to \tpenDown");
		System.out.println("3 to \tturnRight");
		System.out.println("4 to \tturnleft");
		System.out.println("5 to \tmoveForward");
		System.out.println("6 to \tdisplayArray");
		System.out.println("7 to \tdisplayTurtle");
		System.out.println();
		
		System.out.println("enter number to turtle");
		int number = input.nextInt();
		
		while(number != -1) {
			if (number == 1)
				obj.penUp();
			else if (number == 2)
				obj.penDown();
			else if (number == 3)
				obj.turnRight();
			else if (number ==4)
				obj.turnRight();
			else if (number == 5)
		{
				System.out.println("enter number of space");
				int space = input.nextInt();
				obj.moveForward(space);
		}
			else if (number == 6)
				obj.displayArray();
			else if (number == 7)
				obj.displayTurtle();
			
			number = input.nextInt();
			obj.displayTurtle();
	}
		
	}
}
