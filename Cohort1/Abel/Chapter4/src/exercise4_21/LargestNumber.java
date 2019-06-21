package exercise4_21;

import java.util.Scanner;

public class LargestNumber {
	public void largeNumber(){
int counter = 0;
int number = 0;
int largest = 0;
Scanner input = new Scanner(System.in);
while(counter < 10) {
	System.out.println("Enter the nuumber");
	number = input.nextInt();
	if(largest < number)
		largest = number;
	counter++ ;	
}
System.out.println(largest);

input.close();
}
	
}