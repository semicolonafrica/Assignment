package perfectNumber;

public class PerfectNumber {
	
	public static boolean isPerfect(int number) {
		boolean status;
		int sumOfFactors = 0;
		int remainder;
		for(int counter = 1; counter<number; counter++) {
			remainder = number % counter;
			
			if(remainder == 0) {
				System.out.println(counter);
				sumOfFactors = sumOfFactors + counter;
			}
				
		}// iteration ends here.
		
			if(sumOfFactors == number) {
				status = true;
			}
			else {
				status = false;
			}	
		return status;     
	}
}