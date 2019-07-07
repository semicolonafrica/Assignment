package EnhancedForLoop;

public class EnhancedForStatement {

	public static void main(String[] args) {
		
		double sumTotal = 0; 
		
		for(String x : args) {
			
			sumTotal = sumTotal + Double.parseDouble(x);	
		}
		
		System.out.printf("Sum of the numbers = %.2f", sumTotal);

	}

}