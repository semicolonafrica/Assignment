package commandLineArgument;

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
		
		
		System.out.printf("%s%8s%n", "Index", "Value");		
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
		
	}

}
