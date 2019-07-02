package exercise5_18;

public class Compound2 {
	
	public void calculateInterest() {
		
		double amount;
		int principal = 1000 * 100;
		double rate = 0.05;
		int year;
		int dollar;
		int cent;
		
		System.out.printf("%s %15s%n%n", "Year","Principal");
	
		for(year = 1; year <= 10; ++year) {
			amount = principal * Math.pow(1 + rate, year);
			
			cent = (int)amount % 100;
			dollar = (int)amount /100;
			
			
			
			System.out.printf("%d) %10s%,d.%dc %n",year, "$",dollar,cent);
		}
		
		
	}

}
