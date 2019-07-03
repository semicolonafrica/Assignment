package exercise423;

	import java.util.Scanner;

public class LargestTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int newNumber;
		int largest = 0;
		int secondLargest = 0;
		int counter = 1;
		
		while(counter <=3) {
			System.out.print("Enter new number : ");
			newNumber = input.nextInt();
			
			if(largest < newNumber) {
				secondLargest = largest;
				largest = newNumber;
			}
			if(newNumber < largest && newNumber >secondLargest) {
				secondLargest = newNumber;
			}
			
			counter++;
		}
		System.out.println("largest number is : " + largest);
		System.out.println("second largest number is : " + secondLargest);
	}

}
