package exercise7_14;

public class VariableLengthArgumentList {

	public static void product(int... numbers) {
			int total = 0;
			int product = 1;
		for(int  q : numbers) {
			product = product * q;
			 total += q;
			
		}
		 System.out.println("The sum is:" + total);
		 System.out.println("The product is:" + product);
		//return total;		
	}
	
public static void main(String[] args) {
	int w = 5 ; int w1 = 2; int w3 = 7; int w4 = 12; int w5 = 3;
	product(w, w1, w4);
	product(w, w1, w5);
	product(w3, w3, w4);
	
	}
}