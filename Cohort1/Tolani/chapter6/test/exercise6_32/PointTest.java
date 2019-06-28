package exercise6_32;

import java.util.Scanner;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner insert = new Scanner(System.in);
		System.out.println("Enter value for horizontal points: ");
		int x1 = insert.nextInt();
		int x2 = insert.nextInt();
		
		System.out.println("Enter value for vertical points: ");
		int y1 = insert.nextInt();
		int y2 = insert.nextInt();
		
		System.out.println(Point.distanceBtwPoints(x1, x2, y1, y2));
		
		insert.close();

	}

}
