/**compound interest calculator 
 * the other method way
 */
package chapter5.example;

/** 3rd month into the training.
 * @author Dipo
 *
 */
public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double principal = 1000.0; // initial rate given
		double rate = 0.05; //initial amount given
		
		// display the header
		System.out.printf("%s%20s%n", "Year", "Amount on Deposit");
		
		//calculate the amount on deposit for each of the ten years using for loop
		for(int year = 1; year <= 10; ++year) {
			//new amount on deposit for each year
			double amount = principal * Math.pow(1.0 + rate, year);
			
			//display the year and the amount
			System.out.printf("%4d%,20.2f%n", year, amount);
		}
	}

}
