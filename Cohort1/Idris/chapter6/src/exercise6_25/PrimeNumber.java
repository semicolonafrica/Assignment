package exercise6_25;

public class PrimeNumber {
	public static int isPrime(int number) {
		int div = number / 2, prime=0;
		for(int i= 2;i<=div; i++) {
			
			prime = number % i;
			if(prime==0) {
				break;	
			}
		}
		if(prime!=0) {
			System.out.println(number);
		}
		return prime;
	}
	
	public static void rangeNumbers() {
		for(int i = 1; i<=10000;i++) {
			isPrime(i);
		}
	
	}
	//another method of finding prime number using square root of a number
	  public static double isPrime(double number){
		  	double mid;
		  	
		     mid = Math.sqrt(number);
		  	
		    double prime=0;
		    for(int i = 2; i<=mid; i++){
		    	if(number == 2 ) {
			  		break;
			  	}
			  	else if(number == 3) {
			  		break;
			  	}
			  	else
		    	 prime = number%i;
		    	 
		     	if(prime==0){
		      	  break;
		    	 }
		    }
		     if(prime!=0) {
		         System.out.println(number);
		       }
		     return number;		
		  } 
		     
	public static void range() {
		for(int i = 1; i<=10000;i++) {
			isPrime(i);
		}
}
	
}
