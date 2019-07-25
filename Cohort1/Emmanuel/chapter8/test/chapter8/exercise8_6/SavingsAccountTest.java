/**
 * 
 */
package chapter8.exercise8_6;

/**
 * @author Emmanuel Akinbode
 *
 */
public class SavingsAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.setAnnualInterestRate(0.04);
		
		System.out.printf("%s%7s%9s%n", "Months", "Saver1","Saver2");
	//	System.out.printf("saver1 %.2f%n",saver1.calculateMonthlyInterest());
		//System.out.printf("saver2 %.2f%n",saver2.calculateMonthlyInterest());
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		double value1 = 0;
		double value2 = 0;
		for(int i = 1; i <= 13; i++) {
			
			value1 = saver1.getSavings();
			value2 = saver2.getSavings  ();
			System.out.printf("%4d%10.2f%9.2f%n", i, value1,value2);
			
			if(i > 12) {
				SavingsAccount.modifyInterestRate(0.05);
				System.out.printf("%s" ,"5% Interest");
			}
		}
		
		


	}

}
