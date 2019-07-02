/**
 * 
 */
package chapter4.exercis418;

/**
 * @author user
 *
 */
public class CreditLimitCalculator {
	private int accountNumber;
	private double beginningBalance;
	private int totalCharge;
	private int creditLimit;
	private int totalCredit;
	private String customerName;
	/**
	 * @param accountNumber
	 * @param beginningBalance
	 * @param totalCharge
	 * @param creditLimit
	 * @param totalCredit
	 */
	public CreditLimitCalculator(String customerName, int accountNumber, double beginningBalance, int totalCharge, int creditLimit,
			int totalCredit) {
		this.accountNumber = accountNumber;
		this.beginningBalance = beginningBalance;
		this.totalCharge = totalCharge;
		this.creditLimit = creditLimit;
		this.totalCredit = totalCredit;
		this.customerName = customerName;
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the beginningBalance
	 */
	public double getBeginningBalance() {
		return beginningBalance;
	}
	/**
	 * @param beginningBalance the beginningBalance to set
	 */
	public void setBeginningBalance(double beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	/**
	 * @return the totalCharge
	 */
	public int getTotalCharge() {
		return totalCharge;
	}
	/**
	 * @param totalCharge the totalCharge to set
	 */
	public void setTotalCharge(int totalCharge) {
		this.totalCharge = totalCharge;
	}
	/**
	 * @return the creditLimit
	 */
	public int getCreditLimit() {
		return creditLimit;
	}
	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	/**
	 * @return the totalCredit
	 */
	public int getTotalCredit() {
		return totalCredit;
	}
	/**
	 * @param totalCredit the totalCredit to set
	 */
	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}
	
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getNewBalance() {
		double newBalance = beginningBalance + totalCharge - totalCredit;
		
		if(newBalance > creditLimit) {
			System.out.println("Credit Limit exceeeded!!!");
		}
			return newBalance;
		
		
	}
}
