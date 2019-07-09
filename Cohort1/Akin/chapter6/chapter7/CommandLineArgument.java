package chapter7;

import java.util.Scanner;

public class CommandLineArgument {

	public static Scanner input = new Scanner(System.in);
	
	//public static 
	
	public static void main(String[] args) {
		int arrayLength = 0;
		if(args.length == 0) {
	//		System.out.print("The default number: 10");
			arrayLength = 10;
		}
		else {
			arrayLength = Integer.parseInt(args[0]);
		}
		int store = 1;
		int[] array = new int[arrayLength];
		System.out.printf("Enter %d numbers to get the product.",arrayLength);
		for(int i =0; i < array.length; i++) {
			
			array[i] = input.nextInt();
			
		}
		
		for(int num : array) {
			
			store *= num;
			
		}
		System.out.print(store);
		
	}
}
