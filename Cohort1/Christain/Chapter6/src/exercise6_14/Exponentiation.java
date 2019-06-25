package exercise6_14;

public class Exponentiation {

	public static int calculateIntegerPower(int x,int y) {
		int counter = 0;
		int integerPower=0;
		
		while(counter <= y ) {
			counter++;
			integerPower = x * x;
			
			
		}
		System.out.printf("%nInteger Power is equal to %d%n ",integerPower);	
		
		return integerPower;
	}
	
	public static void main(String[] args) {
		
		Exponentiation.calculateIntegerPower(2,4);
	}

}
