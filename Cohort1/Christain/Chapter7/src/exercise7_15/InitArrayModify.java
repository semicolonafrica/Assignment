package exercise7_15;

public class InitArrayModify {

	public static void main(String[] args) {
		
		int arrayLength = 10;
		if(args.length != 0) {
		
			int x = Integer.parseInt(args[0]);
			
			arrayLength = x;
		}
			
			
			System.out.printf("%s%8s%n", "Index", "Value");
			//display array index and value
		int [] array = new int [arrayLength];
			for (int counter = 0; counter < array.length; counter++)
				System.out.printf("%5d%10d%n", counter, array[counter]);
		}

	}


