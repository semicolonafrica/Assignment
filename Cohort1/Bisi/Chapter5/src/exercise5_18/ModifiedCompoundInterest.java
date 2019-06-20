package exercise5_18;

public class ModifiedCompoundInterest {
	 public static void main(String[] args) {
		 int principal = 1000; // initial amount before interest
		 int rate = 5; // interest rate
		 
		 System.out.println("Year\t Amount");
		 
			 for (int year = 1; year <= 10; ++year) {
		 
			 int amount = (int) (principal * Math.pow(1 + rate, year));
			 
			 int amount1 = amount % 100;
			int amount2 = amount / 100;
							 
			 System.out.println(year + "\t" + "$"+amount1 +"."+ year + amount2+"c" );
		 }
	 }

}
