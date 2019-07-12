package chapter7Exercises;


public class InitArray {
		

	public static void main(String[] args) {
		int arrayLength = 10;
		int increment =2;
		int initialValue = 0;
		
		if (args.length !=0) {
			int arrayLength1 = Integer.parseInt(args[0]);
			arrayLength = arrayLength1;
			int increment1 = Integer.parseInt(args[1]);
			increment = increment1;
			int initialValue1 = Integer.parseInt(args[2]);
			initialValue = initialValue1 ;
		}
		System.out.printf("%s%8s%n", "Index", "Value");
		
		int[] array = new int[arrayLength ];

			for(int counter=0; counter<array.length; counter++) {
				array[counter] = initialValue + increment * counter;
				System.out.printf("%4d%8d%n", counter, array[counter]);
		}
	}

}
