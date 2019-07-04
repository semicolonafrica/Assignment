package chapter7.exercises;
//Exercise 7.15
//Program written by Oyemade Temitope
//Program that specifies the length of an array from the command Line
//4th of July 2019

public class CommandLineArgument {

	public static void main(String[] args) {
		
		// declare variable array and initialize it with an array object
		int arrayLength = 10;
		int userInput = 0;
		
		if(args.length != 0) {
		 userInput = Integer.parseInt(args[0]);
			arrayLength = userInput;
			
			}
			
		
		int[] array = new int[arrayLength]; // create the array object
		
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
		
	}

}
