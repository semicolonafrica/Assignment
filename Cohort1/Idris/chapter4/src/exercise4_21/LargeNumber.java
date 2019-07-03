package exercise4_21;

import java.util.Scanner;
public class LargeNumber {
Scanner input = new Scanner(System.in);
	

	public void findLargestNumber() {
		int number;
		int largest = 1;;
		int counter = 1;
		while(counter <= 10) {
			
			System.out.print("Enter numberto be compared: ");
			number = input.nextInt();
			
			if(number > largest) {
				largest = number;
			}
			counter++;
		}
		System.out.println("the Largest number is: " + largest );
	}
	
}
