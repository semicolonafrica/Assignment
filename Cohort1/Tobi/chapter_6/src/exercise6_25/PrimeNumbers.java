package exercise6_25;

public class PrimeNumbers {
	
	public static void findPrime() {
		int number = 100000;
		int prime = 0;
		 // divide number by 2
		for(int n = 1; n <= number; n++) {
			int div = n / 2;
			
			
			for(int f = 2; f <= div; f++) 
			{
				 prime = n % f;
				 if(prime == 0 )
					 break;
			}
			if (prime != 0)
				System.out.print(n + "  ");
//			if(n % 5 == 0) {
//				System.out.println();
//			}
			
		}	
					
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int g = 1; g <= 100; g++) {
			findPrime();
		
		

	}

}
