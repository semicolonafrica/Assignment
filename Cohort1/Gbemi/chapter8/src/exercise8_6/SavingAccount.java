/**
 * 
 */
package exercise8_6;

/**
 * @author gbemi
 *
 */
public class SavingAccount {
	private static double annualInterest;
	private  double savingBalance;
	
	
	
	public SavingAccount(double savingBalance) {
		
		this.savingBalance=savingBalance;
	}
	
	
	public static double getAnnualInterest() {
		return annualInterest;
	}


	public static void modifyInterest(double annualInterest) {
		SavingAccount.annualInterest = annualInterest;
	}


	public  double getSavingBalance() {
		return savingBalance;
	}


	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}


	public double calMonthInterest() {
		double monthInterest=(savingBalance*annualInterest)/12;
		return savingBalance+monthInterest;
		
	}
	
	
	

}
