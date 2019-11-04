package exercise7_14;

public class VariableLength {
	
	public static int calculateProduct(int... numbers) {
		int product = 1;
		for(int value : numbers) 
			product *=value;
		
		return product;
		
	}

}
