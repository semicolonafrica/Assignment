package exercise715;

public class CommandLineArgs {

	public static void main(String[] args) {
	int [] array = new int[args.length];
	int value;
	for(int i = 1; i < args.length; i++) {
		value = Integer.parseInt(args[i]);
		array[i] = value;
		System.out.printf("%8d%8d%n", i, array[i]);
				
	}

	}

}


