/**
 * 
 */
package chapter5.examples;

/**Fig. 5.6: Interest.java
 * compound interest calculation with for
 * @author user
 *
 */
public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double amount; // amount on deposit at the end of each year
		double principal = 1000.0; // initial amount before interest
		double rate = 0.05; // interest rate
		
		// display header
		System.out.printf("%s%25s%n" , "Year" , "Amount on deposit");
		
		//calculate amount on deposit for each of the ten years
		for(int year = 1; year <= 10; year ++) {
			
			//calculate new amount for specified year
			amount = principal * Math.pow(1.0 + rate, year);
			
			// display the year and the amount
			System.out.printf("%d%20.2f%n", year, amount);
		}

	}

}
