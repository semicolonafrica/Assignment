package exercise6_25;



public class PrimeNumbers {
	public static void displayPrimeNumbers() {
		int div =0;
		double squareRoot =0;
		double flooredSquare =0;
		int remainder = 0;
		//String space = " ";
		int i;
		for(i=1;i<=50;i++) {
			
			div = i % 2;
			
			squareRoot = Math.sqrt(i);
			flooredSquare = Math.floor(squareRoot);
			
			for(int j = 2;j<=flooredSquare;j++) {
				remainder = i % j;				
			}

			if(i == 2 || i == 3) {
				System.out.println(i);
			}
			if(remainder != 0 && div !=0) {
				System.out.println(i);
			}			
		}
		

		
		
		
		
		
		
	}

}
