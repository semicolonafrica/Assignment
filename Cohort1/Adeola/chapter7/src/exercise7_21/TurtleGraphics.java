package exercise7_21;
import java.util.Scanner;

public class TurtleGraphics {
	Turtle obj = new Turtle();
	
	Scanner input = new Scanner(System.in);
	
	public void moveTurtle() {
		System.out.println("enter 1 for pen Up");
		System.out.println("enter 2 for pen Down");
		System.out.println("enter 3 to turn right");
		System.out.println("enter 4 turn left");
		System.out.println("enter 5, Move forward different number of spaces");
		System.out.println("enter 6 to display array");
		System.out.println("enter 9 to end data(sentinel)");
		
		int a = input.nextInt();
		
		while(a!=9) {
			if(a==1)
				obj.penUp();
			else if (a == 2)
				obj.penDown();
			else if(a == 3)
				obj.turnRight();
			else if(a==4)
				obj.turnLeft();
			else if(a==5) {
				System.out.println("Enter number of spaces: s");
				int spaces = input.nextInt();
				obj.moveForword(spaces);
			}
			else if(a==6)
				obj.displayArray();
			
			obj.displayPosition();
			a = input.nextInt();
		}
	}

}
