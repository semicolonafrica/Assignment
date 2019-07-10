package exercise7_14;

public class VariableLength {
	public static int product(int...numbers) {
		int total = 1;
		for(int b : numbers)
			total *= b;
		return total;
		
	}
	
	public void displayProduct() {
		int number1 = 2;
		int number2 = 3;
		
		System.out.printf("The product is: %d", product(number1, number2));
	}
}
