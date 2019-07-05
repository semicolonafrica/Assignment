package exercise714;

public class VariableLength {

	public static int getProduct(int... number) {
		// TODO Auto-generated method stub

		int product = 1;
		for(int value : number) {
			product *= value;
		}
		return product;
		
	}
	public static void main(String[] args) {
		System.out.println(getProduct(2,3,4,5));
		System.out.println(getProduct(4,5,6,7,8));
		System.out.println(getProduct(5,6,7,8,9));
	}
	

}
