//package testClass;
//
//import java.util.Scanner;
//
//public class TurtleTest {
//	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		TurtleGraphic move = new TurtleGraphic();
//
//		System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n","Turtle Grapics SketchPad", "Commands", "(1) Pen up", "(2) Pen down",
//				"(3) Turn right", "(4) Turn Left","(5) Move Forward", "(6) Display array",
//				"(7) Clear pad","(8) Reset Turtle Position", "(9) End of data");
//		int control = input.nextInt();
//
//		while(control != 9) {
//
//
//		switch(control) {
//		case 1: 
//			move.penUP();
//			break;
//
//		case 2: 
//			move.penDOWN();
//			break; 
//
//		case 3: 
//			move.directionTurnRight();
//			break;
//
//		case 4:
//			move.directionTurnLeft();
//			break;
//
//		case 5:
//			System.out.println("Enter number of spaces: ");
//			int spaces = input.nextInt();
//			move.forwardMovement(spaces);
//			break;
//		case 6:
//			move.displayArrayFloor();
//			break;
//
//		case 8: 
//			move.resetPosition();
//			break;
//
//		}
//		move.displayPosition();
//		System.out.println();
//		control = input.nextInt();
//
//		}
//	}
//
//	
//}
// 
//
