package exercise625;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		
		
		 int temp;

		 	
		 			temp = num /2;
		 				if(num < 2) {
		 					return false;
		 				}
		 		 for(int i = 2; i <= temp; i++) {
					
					
					if(num % i == 0) {
						return false;
				
					  }
		 		 }
		 		  return true;
		 		//if(prime != 0) {
					//System.out.println("this is a prime number:" + num);
					
				 }
		 public static boolean squareRoot(int num) {
			 double temp = 0;
			 
			 temp = Math.sqrt(num);
			 if(num < 2) {
					return false;
				}
		 for(int i = 2; i <= temp; i++) {
			
			
			if(num % i == 0) {
				return false;
		
			  }
		 }
		  return true;
		 }
		
	
	public static void main(String[] args) {
	PrimeNumber.displayPrime();
	
	}
	public static void displayPrime() {
		for(int i = 1; i <= 10000; i++) {
			if(squareRoot(i) == true) {
				System.out.println(i);
			}
			
		}
	}
}
