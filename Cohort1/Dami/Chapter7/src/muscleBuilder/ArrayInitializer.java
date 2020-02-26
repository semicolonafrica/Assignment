package muscleBuilder;
// Trying hands on Array and for loop. (c) DamiDrevid-020719

public class ArrayInitializer {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 30; // named constant
		
		int[] dami = new int[ARRAY_LENGTH]; //declare and initialize new array (dami)
		System.out.printf("%8s%8s%n", "Index #", "Value");
		for(int i = 0; i < ARRAY_LENGTH; i++) {
			dami[i] = 1 + 2 * i; //Initialize with odd numbers
			System.out.printf("%8d%6d%n", i, dami[i]);
		}
		System.out.println();
			System.out.println("Array length is: "+dami.length); //To know the length of my array
	}

}
