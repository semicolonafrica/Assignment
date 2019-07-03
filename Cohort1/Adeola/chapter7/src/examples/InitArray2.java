package examples;

public class InitArray2 {

	public static void main(String[] args) {
		final int ARRAY_LENGHT = 10;
		int[] array = new int[ARRAY_LENGHT];
		
		for(int counter = 0; counter < ARRAY_LENGHT; counter++) {
			array[counter] = 2 + 2*counter;
		}
		System.out.printf("%s%8s\n", "position" , "value");
		
		for(int counter = 0; counter < ARRAY_LENGHT ; counter++) {
			System.out.printf("%4s%9s\n", counter , array[counter]);
		}
	}

}
