package chapter4.exercise421;

import java.util.Scanner;
public class LargestNumber {
	
	int largest = 0;
	
	int number = 0;
	
	
	public void displayLargest() {
	
		Scanner input = new Scanner(System.in);
		int counter = 1;
		
		while(counter < 10) {
			System.out.println("Enter number: ");
			number = input.nextInt();
			
			if(number > largest) {
				largest = number;
			}
			counter++;
		}
		System.out.println("The largest number is: " + largest);
		
		input.close();
	}
	

}
