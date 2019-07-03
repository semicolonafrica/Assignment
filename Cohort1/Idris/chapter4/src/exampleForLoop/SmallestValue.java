package exampleForLoop;

import java.util.Scanner;
public class SmallestValue {
	
	public void checkValue(){
		Scanner accept = new Scanner(System.in);
		
		System.out.print("The total number to be checked: ");
		int totalNumber = accept.nextInt();
	
		System.out.print("The number to be checked: ");
		int number = accept.nextInt();
		int smallest = number;

		for(int counter = 0; counter < totalNumber; counter++) {
			System.out.print("The number to be checked: ");
			number = accept.nextInt();
		
			if(number < smallest) {
				smallest = number;
			}
			
			

		}
		System.out.println("the smallest value is: "+ smallest);
		accept.close();
	}
	
}
