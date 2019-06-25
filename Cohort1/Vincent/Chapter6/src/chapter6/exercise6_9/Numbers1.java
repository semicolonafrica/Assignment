package chapter6.exercise6_9;

import java.util.Scanner;
public class Numbers1 {
	
	public double roundNumber() {
		
	Scanner input = new Scanner(System.in);
	
	double x = 0;
	double y = 0;
	int counter = 1;
	
	while(x !=-1) {
		System.out.println("Enter value x");
		x = input.nextDouble();
		
		 y = Math.floor(x + 0.5);
		 
		 System.out.println("original is: " + x + "\nrounded number is:" + y);
		 counter++;
	}
	input.close();
	return y; 
	
	}
	
}
