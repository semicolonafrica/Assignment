package exercise5_14;
import java.util.Scanner;

public class CompoundInterest {
	
	public static void main(String[] args) {
		Scanner accept = new Scanner(System.in);
	
	 //public void calculateCompoundInterest() {
		 System.out.print("Enter principal amount ");
		 int principal  = accept.nextInt();
		 
		 System.out.print("Enter number of years ");
		 int year  = accept.nextInt();
		 

		 double interest =1.0;
		double amount = 0.0;
		  
		for(double rate = 0.05;rate<=0.1;rate+=0.01){
	
			
			for(int i=1;i<= year;i++) {// this calculate interest by year
				interest *= (1 + (rate));
				amount = principal*interest;
				System.out.printf("%s %d %s %.2f%n","The  interest rate for ", i ," is " , amount);	
				 if(i == year) {
					 interest = 1;
				 }
			}
			
		System.out.println();		
		}
		
		 
		
		 accept.close();
	}
}
