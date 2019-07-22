package exercise7_16;

public class UsingTheEnhancedForStatement {
		
	public static void main(String[] args) {
		
		double [] array = new double[args.length];
		for(int i = 0; i < array.length; i++) {
			array[i] = Double.parseDouble(args[i]);
			}
		double value = 0;
		for(double digit : array) {
			value += digit;
		}
		System.out.println(value); 
	}
	
}
