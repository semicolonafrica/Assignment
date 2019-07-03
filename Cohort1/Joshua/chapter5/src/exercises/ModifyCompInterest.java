/**
 * 
 */
package exercises;

/**Exercise 5.14)
 * @author Group2(Me and Christian)
 *
 */
/**
 * 
 */

public class ModifyCompInterest {
	
	public void calculateInterest() {
		int principal = 1_000;
		double rate1 = 0.05;
		double rate2 = 0.06;
		double rate3 = 0.07;
		double rate4 = 0.08;
		double rate5 = 0.09;
		double rate6 = 0.1;
		int year = 10;
		double amount = 0;
		
		
		
		
		double temp_value = 1.0;
		
		
		for(int counter = 0; counter < year; counter++) 
			
			temp_value = temp_value * (1 + rate1);
			System.out.println("Return on Investment at 5% is: " + temp_value);

			temp_value = temp_value * (1 + rate2);
			System.out.println("Return on Investment at 6% is:  " + temp_value);

			temp_value = temp_value * (1 + rate3);
			System.out.println("Return on Investment at 7% is:  " + temp_value);

			temp_value = temp_value * (1 + rate4);
			System.out.println("Return on Investment at 8% is:  " + temp_value);

			temp_value = temp_value * (1 + rate5);
			System.out.println("Return on Investment at 9% is: " + temp_value);

			temp_value = temp_value * (1 + rate6);
			System.out.println("Return on Investment at 10% is: " + temp_value);

		
			amount = (int) (principal * temp_value);
			System.out.println("Return on Investment for 10 years is: " + amount);
			
	}
		
}
