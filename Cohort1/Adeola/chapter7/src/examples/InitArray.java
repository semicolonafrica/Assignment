package examples;

public class InitArray {
	
	public static void main(String[] args) {
		int[] array;
		array = new int[20];
		array[6] = 65;

		System.out.printf("%s%8s\n", "index", "element");
		for (int i =0; i<array.length; i++) {
			System.out.printf("%5d%8d\n", i , array[i] );
		}

	}

}
