package exercise5_18;

import java.util.Scanner;
public class CompoundInterestModified{
	
		Scanner accept = new Scanner(System.in);
		
		 public void calculateCompoundInterest() {
			 System.out.print("Enter principal amount ");
			 double principal  = accept.nextDouble();
			 
			 System.out.print("Enter number of years ");
			 double year  = accept.nextDouble();
			 
			 System.out.print("Enter  rate ");
			 double rate  = accept.nextDouble()/100.0;
			 
			 double interest =1.0;
			double amount = 0.0;
			double i;
			  
				for(i=1.0;i<= year;i++) {// this calculate interest by year
					interest *= 1 + (rate);
					System.out.printf("%d%n",(int)interest);	
					amount = ((principal * 100)*interest);
					int cent = (int)amount % 100;
					int interestDollar = (int)amount / 100;
					System.out.printf("%d %s %d",interestDollar,":",cent);
				}
				

		 }
}
