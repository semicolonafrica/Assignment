package chapter4.exercise4_21;

import java.util.Scanner;

public class LargestNumber {
	 public void findLargest() {
		 
		 int largest = 0;
		 int counter =0;
		 int number = 0;
		 int larger=0;
		 Scanner input = new Scanner(System.in);
		 
		 while(counter < 10) {
			 System.out.print("enter number");
			 number = input.nextInt();
			 
			 if(number > largest) {
				 largest = number;
					System.out.println(number + " is the largest"); 
			 }
			
			 counter++;
		 }
	 
		 
	 
	 }
	 

}
