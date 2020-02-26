package exercise6_25;

public class PrimeNum {
	
	public void isPrime() {
		
		int number = 1;
		int i;
		String primeNumber = " ";
		int remainder = 0;
		
		for(i = 1; i <= 100; i++) {
		
			for(number = 1; number <= i/2; number++) {
				remainder = number % i;
				if(i % number == 0) {
				}
			}
			if(remainder == 0) {
				primeNumber += i + " ";
			}
		}
		System.out.println("Prime Numbers from 1 to 10000 are: ");
		System.out.println(primeNumber);
	}
}
