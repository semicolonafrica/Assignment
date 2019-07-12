package chapter7Exercises;

import java.util.Scanner;

public class DuplicateElimination {
	
	public static void printNumber() {
		Scanner input = new Scanner(System.in);
		
		int number;
		int counter = 0;
		int store2 = 0; 

		int[] store = new int [10];
		
		for(counter =0; counter <store.length; counter++) {
			System.out.println("Enter Number");
			number = input.nextInt();
			
			if(number>10 && number <100) {
				if (store[counter] !=number)
					System.out.println(number);
			}
			else {
				System.out.println("Wrong Input");
			}
			
		for(int counter2 =0; counter2 <store.length; counter2++) {
//			System.out.println("counter2 "+store[counter2]);
				if(store[counter2] == number) {
					System.out.println("duplicate");
					break;
				}
		
			}
		store[counter] =number;
			
		}
	}
	public static void main(String[] args) {
		DuplicateElimination.printNumber();

	}

}
