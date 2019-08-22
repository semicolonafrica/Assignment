package chapter4.exercise4_21;
import java.util.Scanner;
public class SalesLargest {

		public int calculateLargestNum() {
			Scanner input = new Scanner(System.in);
			int counter = 1;
			int largest = 0;
			int number = 0;
			
			while(counter <= 10) {
				System.out.println("Enter the number");
				number = input.nextInt();
//				
				if  (number > largest)
				   largest = number;
//				
//				System.out.println("Enter the number");
//				number = input.nextInt();
//				
				counter++;
			}
//			   largest = Math.max(number, 0);
				System.out.printf("the largest number is:  %d", largest);
				return largest;
		}


		public static void main(String[] args) {
			SalesLargest num1 = new SalesLargest();
			num1.calculateLargestNum();
		}

}
