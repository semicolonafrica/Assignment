package exercise7_15;

public class CommandLineArgument {
	
	public static void main(String[] args) {
		
		int arraylength = 10;
		int number=0;
		
		if(args.length !=0) { 
			
		number = Integer.parseInt(args[0]);
		
		arraylength = number;
		}
		
		int[] array = new int[arraylength];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < array.length; counter++) 
			System.out.printf("%4d%8d%n", counter, array[counter]);
			
	}
}
