package exercise5_13;

public class Factorial {
	
	public void calculateFactorial(){
		
		long factorial = 1;
		
		for(int counter = 1; counter <= 20; counter++) {
			factorial*=counter;
			
			System.out.println(counter+ ")\t" +factorial);
		}
	
	
	
	}
	
	
}
