package chapter5.exercise5_14;

//Modify the compoundinterest
//application of Fig. 5.6 to repeat its steps for interest rates of 5%,
//6%, 7%, 8%, 9% and 10%. Use a for loop to vary the interest rate.

public class CompoundInterest {
	public static void main(String[] args) {
		double amount;
		double principal = 1000.0;
		double rate = 5;
		//double rate1 = rate/100;
		int year = 10;
		
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		
		while(rate <= 10) {
			double rate1 = rate/100;

			amount = principal *Math.pow(1 + rate1, year);
			/*amount1 = principal * Math.pow(1.0 + 0.05, year);
			amount2 = principal * Math.pow(1.0 + 0.06,  year);
			amount3 = principal * Math.pow(1.0 + 0.07, year);
			amount4 = principal * Math.pow(1.0 + 0.08, year);
			amount5 = principal * Math.pow(1.0 + 0.09, year);
			amount6 = principal * Math.pow(1.0 + 0.10, year);
			*/
			System.out.println("amount for " + rate + " % rate ` is " + amount);
			rate++;
			
			//System.out.println("amount for " + (year-1) + " is " + amount);
		}	
	}

}
