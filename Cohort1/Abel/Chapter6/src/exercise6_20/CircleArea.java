package exercise6_20;

import java.util.Scanner;
public class CircleArea {
	public static void circleArea() {
		Scanner input = new Scanner(System.in);
		int value = 0;
		
		System.out.println("enter radius of circle");
		value = input.nextInt();
		
		double area = Math.PI * (value * value);
		System.out.print(area);
		
		
	}
	}


