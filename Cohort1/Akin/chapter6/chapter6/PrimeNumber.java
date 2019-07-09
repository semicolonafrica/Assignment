package chapter6;

public class PrimeNumber {

	public static boolean isPrimeHalf(int number) {
		
		boolean prime = true;
		int half = number / 2;
		int modulus = 1; 
		
		for(int i = 2; i <= half; i++) {

			modulus = number % i;
			
			if(modulus == 0) {
				prime = false;
				break;
			}
			else {
				prime = true;
			}
		}
		return prime;
 		
	}
	
	
	
	public static boolean isPrimeRoot(int number) {
		boolean prime = true;
		int half = (int)Math.sqrt(number);
		int modulus = 1; 
		for(int i = 2; i <= half; i++) {

			modulus = number % i;
			
			if(modulus == 0) {
				prime = false;
				break;
			}
			else {
				prime = true;
			}
		}
		return prime;
	}
	
	public static void displayPrimeHalf() {
		for(int i = 2; i< 1000;i++) {
			if(isPrimeHalf(i) == true) {
				System.out.printf("%d ",i);
			} 
		
		}
		System.out.println();
		
	}
	
	public static void displayPrimeRoot() {
		for(int i = 2; i< 1000;i++) {
			if(isPrimeRoot(i) == true) {
				System.out.printf("%d ",i);
			} 
		}
	}
	
	
}
