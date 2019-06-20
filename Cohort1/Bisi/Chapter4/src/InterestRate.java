import java.util.Scanner;

public class InterestRate {
	
	//  create a Constructor
	public double Interest(){
	int principal;
	int year;
	double rate;
	
	//public double InterestRate() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Principal please: ");
		 principal = input.nextInt();
		 System.out.print("Enter Rate please: ");
		 rate = (double)input.nextInt()/100;		// this allows helps covert User integer input to a double
		 System.out.print("Enter number of year please: ");
		 year = input.nextInt();
		 
		 double amount;
		 double temp_value = 1;
		 
		 for(int counter = 0; counter < year; counter++) {
			 temp_value = temp_value * (1 + rate);
		 }
		 amount = principal * temp_value;
		 return amount;
	}

}
