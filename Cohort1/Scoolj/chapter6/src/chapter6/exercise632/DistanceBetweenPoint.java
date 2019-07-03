/**
 * 
 */
package chapter6.exercise632;
import java.util.Scanner;
/**
 * @author Scoolj, Oluwajuwonlo
 *
 */
public class DistanceBetweenPoint {

	public static double findDistanceBetweenPoint() {
		double findDistancePoints =0;
		Scanner input = new Scanner(System.in);
		try {
		System.out.println("Enter value for coordinate X1  and Y1");
		double x1 = input.nextInt();
		char characterComa = input.next().charAt(0);
		double y1 = input.nextInt();
		System.out.println("Enter value for coordinate X2  and Y2");
		double x2 = input.nextInt();
		char characterComa2 = input.next().charAt(0);
		double y2 = input.nextInt();
		findDistancePoints = calculateDistanceBetweenPoints(x1, y1, x2, y2);
		} catch (Exception e) {
			System.out.println("Wrong coordinate value inputs. try again ");
			System.out.println(" Tips: enter each value with 'Space follow by Coma' ");
		}
		
		
		
		return findDistancePoints;
	}
	
	public static double  calculateDistanceBetweenPoints(double x1, double y1, double  x2,  double y2) {
		double xSquare = 0;  double ySquare =0;
		// this calculate distance between two point by subtracting like points, multiply and square of sum 
			xSquare = (x1 - x2) * (x1 - x2);
			ySquare = (y1 - y2)* (y1 - y2);
			double distancePoints = Math.sqrt(xSquare + ySquare);
		 
		 System.out.println(distancePoints);
		
		return distancePoints;
	}
	
}
