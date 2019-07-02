package exercise6_21;

public class SeparateDigit {
	public static int divideDigit(int a ,int b) {
		int divide = a/b;
		return divide;
	}
	public static int modulOfDigit(int a, int b) {
		int modulus = a%b;
		
		return modulus;
	}
	
	public static String diplayDigit(int c) {
		String space = " ";
		int remainder;
		while(c>0) {
			remainder = modulOfDigit(c,10);
			space = remainder+"  "+space;
			c = divideDigit(c, 10);
		}
		return space;
		
	}
}
