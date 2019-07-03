package examples;

public class ArrayBarChart {

	public static void main(String[] args) {
		int[] array = { 9, 17, 0, 9, 0, 5, 1, 2, 4, 18, 1 };
		for(int counter = 0; counter <array.length; counter++) {
			if(counter == array.length-1) {
				System.out.printf("%5d:", 100);
			}
			else {
				System.out.printf("%02d-%02d:", counter*10, counter*10+9);
			}
			for (int star = 0;star<array[counter];star++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}