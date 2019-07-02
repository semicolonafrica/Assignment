package chapter6;

import java.util.Scanner;

public class DistanceBetweenPointsTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter coordinates of \npoint 1 (x1 and y1)\npoint 2(x2 and y2) in meters \nrespectively: ");
		DistanceBetweenPoints.x1 = input.nextDouble();
		
		DistanceBetweenPoints.y1 = input.nextDouble();
		
		DistanceBetweenPoints.x2 = input.nextDouble();
		
		DistanceBetweenPoints.y2 = input.nextDouble();
		
		System.out.printf("%s %.2fm","The distance between \n point 1 with  and point 2 \nis: ",DistanceBetweenPoints.distance());

	}

}
