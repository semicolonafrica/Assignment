package exercise5_11;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		int counter = 0;
		int number = 0;
		int smallest = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter loop number");
		int num = input.nextInt();
		while(counter < num) {
			System.out.println("Enter the number");
			number = input.nextInt();
			if(number < smallest)
				System.out.println(smallest);
				smallest = number;
			counter++ ;	
		}
		

		input.close();
		}
	

}
