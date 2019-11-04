package exercise7_15;

public class InitArray {
	
	public static void main(String[] args) {
		int arrayLength =0;
		if (args.length !=1) {
			arrayLength = 10;
		}
		else {
			arrayLength = Integer.parseInt(args[0]);
		}
		
		int[] array = new int[arrayLength];
		System.out.printf("%s%8s%n", "Index","Value");
		for(int i =0; i< array.length;i++) {
			System.out.printf("%5d%8d%n", i,array[i]);
		}
	}

}
