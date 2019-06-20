package exercise5_14;

public class CompoundInterest {
	
		public void interest(){
		
		int principal= 1000;
		int year = 10;
		double rate = 1.05;
		
			 double Amount = 0;
			 double temp_value = 1;
			 
			 System.out.printf("%s%20s%n", "Year", "Amount");
			 
			 for(int j = 5; j <= 10; j++) {
				 
				 for(int counter = 0; counter < year; counter++) {
					
					 temp_value = temp_value * rate;
					 Amount = principal * temp_value;
					 
					 System.out.printf("%,.2f%n",Amount);
					 
				 }
				 System.out.println();
				  rate += 0.01;
								 
			 }			 
		}
		
	}
