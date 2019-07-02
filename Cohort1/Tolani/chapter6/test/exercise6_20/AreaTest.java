package exercise6_20;

import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		
		System.out.println("Enter the value of radius: ");
		int radius = insert.nextInt();
		
		System.out.println("The area of circle is: " + Area.circleArea(radius));
		insert.close();
	}

}
