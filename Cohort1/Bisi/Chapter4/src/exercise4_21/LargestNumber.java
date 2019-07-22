package exercise4_21;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int value;
	int count = 1;
	int largestNumber = 0;
	
	while(count <= 10) {
	System.out.print("Enter value:");
	value = in.nextInt();
	if(value > largestNumber) {
		largestNumber = value;
	}		
	count++;	
	}
	System.out.println("The largest number of all the numbers given above is " + largestNumber);
	}
}
