/* Author: ADEBAYO Johnson
 Date: 26/06/2019 
 Location of exercise:  Exercise 6, Question 6.32
 Purpose: To obtain distance between points
*/
package chapter6.exercise632;

import java.util.Scanner;
public class DistanceBetweenPoints{
	static private int x1;
	static private int x2;
	static private int y1;
	static private int y2;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Distance between the two points: " + distance());
	}
	public static double distance() {
		System.out.println("Enter x1: ");
		x1 = input.nextInt();
		System.out.println("Enter x2: ");
		x2 = input.nextInt();
		System.out.println("Enter y1: ");
		y1 = input.nextInt();
		System.out.println("Enter y2: ");
		y2 = input.nextInt();
		double distanceX = Math.pow((x2 - x1),2);
		double distanceY = Math.pow((y2 - y1),2);
		double distanceBetweenXY = Math.sqrt(distanceX + distanceY);
		return distanceBetweenXY;
	}
}
