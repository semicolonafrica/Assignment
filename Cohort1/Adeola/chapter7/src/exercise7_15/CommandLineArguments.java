package exercise7_15;

public class CommandLineArguments {

	public static void main(String[] args) {
 
		int[] array = new int [args.length];
		
		int value;
		for (int i=0; i < args.length; i++) {
			value = Integer.parseInt( args[i] );
			array[i]=value;
			System.out.printf("%4d%5d%n",i, array[i] );
		}
		
	}

}
