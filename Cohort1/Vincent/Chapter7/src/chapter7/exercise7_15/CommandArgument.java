package chapter7.exercise7_15;

public class CommandArgument {

	public static void main(String [] args) {
		int arrayLength = 10;	
		if(arrayLength != 0) {
		int x = Integer.parseInt(args[0]);	
		arrayLength = x;
		}	
	
		 int [] array1 = new int [arrayLength];
			System.out.printf("%s%10s\n", "index" , "elements");
			
			for(int counter =0;counter < array1.length; counter++)
				System.out.printf("%5d%8d\n", counter,array1[counter]);
			
		}
	}

