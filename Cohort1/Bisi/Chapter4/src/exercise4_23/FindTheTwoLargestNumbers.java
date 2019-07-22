package exercise4_23;

import java.util.Scanner;

public class FindTheTwoLargestNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int value;
		int count = 1;
		int largestNumber = 0;
		int largerNumber = 0;
		
		while(count <= 10) {
		System.out.print("Enter value:");
		value = in.nextInt();
		if(value > largestNumber) {
			largestNumber = largerNumber;
			largerNumber = value;
		}
		else if(value > largestNumber) {
			value = largestNumber;
		}
		count++;	
		}
		System.out.println("The largest number of all the numbers given above is " + largestNumber);
		System.out.println("The larger number of all the numbers given above is " + largerNumber);
		}
}
