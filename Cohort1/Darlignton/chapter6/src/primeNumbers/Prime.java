package primeNumbers;

public class Prime {

	public static boolean isPrime(int number) {
		int primeDeterminant = 0;
		boolean primeStatus = false;

		for(int i = 1; i <= number; i++) {

			if(number % i ==0)
				primeDeterminant++;
		}

		if(primeDeterminant > 2)
			primeStatus = false;
		else
			primeStatus = true;

		return primeStatus;
	}

	public static void  displayPrimeNumbers() {

		for(int i = 1; i<=100; i++) {

			if(isPrime(i) == true)
				System.out.println(i);

		}

	}

	public static void main(String[] args) {

		//System.out.println(isPrime(11));
			displayPrimeNumbers();
	}

}
