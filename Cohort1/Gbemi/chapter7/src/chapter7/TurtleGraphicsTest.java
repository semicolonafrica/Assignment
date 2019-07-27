/**
 * 
 */
package chapter7;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class TurtleGraphicsTest {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("enter 1 for PenUp");
		System.out.println("enter 2 for PenDown");
		System.out.println("enter 3 to turn right ");
		System.out.println("enter 4 to turn left");
		System.out.println("enter 5 to move forward");
		System.out.println("enter 6 to display shapes");
		System.out.println("enter 9 for end data");
		int value=input.nextInt();
		while(value!=9) {
			
			TurtleGraphics.printTurtlePosition();
			switch(value){
			case 1:
				TurtleGraphics.penUp();
				System.out.println("Pen is up");
				break;
				
			case 2:
				TurtleGraphics.penDown();
				System.out.println("Pen is down");
				break;
				
			case 3:
				TurtleGraphics.moveRight();
				
				
				break;
				
			case 4:
				TurtleGraphics.moveLeft();
				break;
				
			case 5:
				System.out.println("Enter number of spaces: ");
				int spaces = input.nextInt();
				TurtleGraphics.moveForward(spaces);
				
				break;
				
			case 6:
				System.out.println("Enter character: ");
				char sign = input.next().charAt(0);
				TurtleGraphics.displayArray(sign);
				break;
			
		case 9:
			
			break;
			}
			value = input.nextInt();
			
		}
		
	}

}
