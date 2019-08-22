package chapter7.exercise7_14;

public class Varags {
	int [] array1;
	int [] array2;
	
	
	public static void product(int [] array) {
		int product = 1;
		int total = 0;
		for(int counter = 0; counter < array.length; counter++) {
			product *= array[counter];
		}
		
		total+= product;
		System.out.println("The product of the numbers are: " + product);
	}

	public static void getnumber() {
	
		int [] array1 = {2,3,4,5,6};
		
		int [] array2 = {3,4,3};
		product(array1);
		System.out.println();
		product(array2);
	
	}
	
	public static void main(String [] args) {
		Varags.getnumber();
		
		
	
		
		
		
	}
}
