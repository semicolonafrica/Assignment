package exampleForLoop;
import java.util.Scanner;

public class CompoundInterest {
	Scanner accept = new Scanner(System.in);
	
	 public void calculateCompoundInterest() {
		 System.out.print("Enter principal amount ");
		 int principal  = accept.nextInt();
		 
		 System.out.print("Enter number of years ");
		 int year  = accept.nextInt();
		 
		//  System.out.print("Enter the rate of the interest ");
		//  double rate  = (double)accept.nextInt()/100;//this is to divide by 100 and change what user input to float value
		double rate = 0.05;
		while(rate<=0.1){
			double interest =1.0;
			double amount = 0.0;
			//1000double totalInterest = 0.0;
			
			for(int i=1;i<= year;i++) {// this calculate interest by year
				interest *= 1 + rate;
				//amount = principal*interest;
				System.out.printf("%s %d %s %.2f%n","The customer interest for ", i ," is " , interest);
				rate++;
			}
			amount = principal*interest;// total interest is store.
		 System.out.printf("%s %d %.2f","The customer total compound interest rate is: ",rate, amount);	
		}
	}
	
}
