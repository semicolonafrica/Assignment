package chapter6;

public class PerfectNumber {

	public static boolean isPerfect(int number) {
		
		boolean determinePerfect = true;
		String store = "";
		int modulus = 1;
		int sum = 0;
		
		for(int i = 1; i < number; i++) {
			
			modulus = number % i;
			
			
			if(modulus == 0) {
			
			sum += i;
			
			store = store + " " + i;
			}
			
		}
		
		if(sum == number) {
			determinePerfect = true;
			System.out.printf("%s = %d%n",store, sum);
			System.out.println();
		}
		else {
			determinePerfect = false;
		}
		

		return determinePerfect;
	}
	
	public static void displayPerfect() {
		
		for(int i = 1; i < 1000; i++) {
			isPerfect(i);
		}
	}
	
}
