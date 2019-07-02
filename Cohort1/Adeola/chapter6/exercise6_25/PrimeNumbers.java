package exercise6_25;

public class PrimeNumbers {
	public static boolean isPrime(int num) {
		boolean result = false;
		for (int i=2; i<=num/2; i++) {
			if(num%i ==0) {
				result = false;
				break;
			}
			else {
				
				result = true;
			}
		}
		return result;
	}
	public static boolean isPrime2(int num) {
		boolean result = false;
		for (int i=2; i<=Math.sqrt(num); i++) {
			if(num%i ==0) {
				result = false;
				break;
			}
			else {
				
				result = true;
			}
		}
		return result;
	}
	public static void displayPrime(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrime(i) == true) {
				System.out.print(i+ ", ");
			}
		}
	}
	public static void displayPrime2(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrime2(i) == true) {
				System.out.print(i+ ", ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPrime(7));
		displayPrime(10000);
		System.out.println();
		displayPrime2(10000);
		
	}

}
