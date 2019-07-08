package exercise4_23;

	import java.util.Scanner;
	public class TwoLargeNumber {
	
	Scanner input = new Scanner(System.in);
	
		public void findTwoLargestNumber() {
			int number;
			int largest = 1;
			int secondLargest = 1;
			int counter = 1;
			while(counter <= 10) {
				
				System.out.println("Enter number to be compared: ");
				number = input.nextInt();
				
				if(number > largest) {
					largest = number;
					secondLargest = number;
				}
				counter++;
			}
			System.out.println("the Largest number is: " + largest );
			System.out.println("The Secondlargest Number is "+ secondLargest);
			
		}
}


