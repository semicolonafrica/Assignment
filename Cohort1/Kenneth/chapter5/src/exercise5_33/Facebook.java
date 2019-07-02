/**
 * 
 */
package exercise5_33;

/**
 * @author ken_granero
 *
 */
public class Facebook {
	
	
	public void calculateInterest() {
		
		double user; // amount on deposit at end of each year
		double principal = 1_000_000_000; // initial amount before interest
		double rate = 0.04; // interest rate
		// display headers
		System.out.printf("%s%15s %n", "Month", "Users");
		// calculate amount on deposit for each of ten years
		for (int month = 1; month <= 18; ++month)
		{
		// calculate new amount for specified year
		user = principal * Math.pow(1.0 + rate, month);
		// display the year and the amount
		System.out.printf("%1d%,25.2f%n", month, user);
		}
		
	}

}
