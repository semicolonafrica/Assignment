package exercise6_14;


public class Maths {
	
	
	public static int integerPower(int a, int b) {
		int power = 1;
		int counter;
		for(counter = 1; counter<=a; counter++) {
			power *= b;
		}
		return power;
	}

}
