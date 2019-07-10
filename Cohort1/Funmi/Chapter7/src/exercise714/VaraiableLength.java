package exercise714;

public class VaraiableLength {
	
	public static int testVariable(int... num) {
		int product = 1;
		for(int value : num) {
			product *= value;
		}
		return product;
	
		
	}
	public static void main(String[] args) {
		
		System.out.println(testVariable(23,56,2));
		System.out.println(testVariable(23,56,2,17,30));
		System.out.println(testVariable(23,2,8,90));
	}

}
