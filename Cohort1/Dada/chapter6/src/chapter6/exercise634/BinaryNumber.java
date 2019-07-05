package chapter6.exercise634;

public class BinaryNumber {
	
	public String convertBinary(int number) {
		
		String store = " ";
		int modulus;
		
		while(number > 0) {
			modulus = number % 2;
			store = modulus + " " + store;
			number = number / 2;
			
//			return store;
		}
		System.out.printf("Binary is: %s", store);
		return store;
		
//		
	}
	public String convertOctal(int number) {
		
		String store = " ";
		int modulus;
		
		while(number > 0) {
			modulus = number % 8;
			store = modulus + " " + store;
			number = number / 8;
		}
		System.out.println();
		System.out.printf("OctalDeximal is: %s", store);
		return store;
		
	}
	public String convertHexadecimal(int number) {
		
		String store = " ";
		int modulus;
		
		while(number > 0) {
			modulus = number % 16;
			store = modulus + " " + store;
			number = number / 16;
			
//			if(store > 10; || )
			
		}
		System.out.println();
		System.out.printf("Hexidecimal is: %s", store);
		return store;
	}

}
