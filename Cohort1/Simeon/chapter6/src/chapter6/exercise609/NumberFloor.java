package chapter6.exercise609;

import java.util.Scanner;

public class NumberFloor {

	public static void aproxNumber() {
		
		double y = 0;
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		for(int i=1;i<=10;i++) {
			System.out.print("Enter value for x: ");
			double x = input.nextDouble();
			
			y = Math.floor(x + 0.5);
			
			
			
			System.out.println("Original Number(x)\t" + "Rounded Number(y)\n"
					+ x + "\t\t\t" + y);	
			System.out.println();
		}
		
	}
	
}
