package exercise5_20;

public class Value {
	
	public void calculateValue() {
		
		double pii = 4;
		double divisor = 3;
		//double total = 0;
		
		System.out.printf("%s %13s%n%n","Nth Term", "Value");
		
		for(int j = 1; j <= 200_000; j++) {
			
			
			
			if(j % 2 == 0) 
				pii = pii + (4/divisor);
			
			if(j % 2 == 1)
				pii = pii - (4/divisor);
			
			divisor += 2;
			
			System.out.printf("%d) %20.5f%n", j, pii);
		}
		
	}

}
