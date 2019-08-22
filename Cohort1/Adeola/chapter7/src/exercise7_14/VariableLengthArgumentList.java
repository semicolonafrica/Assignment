package exercise7_14;

public class VariableLengthArgumentList {
	public static int product(int... num) {
		int product = 1;
		for(int number: num) {
			product *=number;
		}
		return product;
	}

	public static void main(String[] args) {
		System.out.println(product(7,3,2,6));
		System.out.println(product(7,3,45,87, 11, 37));
		System.out.println(product(7,45));
	}

}
