package chapter5.exercise512;

public class OddIntegers {
	
	public int calculateOddIntegers() {
		
		int product = 1;
		
		for(int counter = 1; counter <= 15; counter++) {
			
			if(counter % 2 ==1) {
				
				product = product * counter;
			}
			
		}
		
		
		System.out.println("The product of the Odd Integer is:"+ product);
		
		return product;
		
		
		
	}

}
