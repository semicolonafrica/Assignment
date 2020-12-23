/**
 * 
 */
package chapter4.exercis418;
import java.util.Scanner;
/**
 * @author user
 *
 */
public class SalesCommission {
	
	private String salesPersonName;

	/**
	 * @param salesPersonName
	 */
	public SalesCommission(String salesPersonName) {
		this.salesPersonName = salesPersonName;
	}

	/**
	 * @return the salesPersonName
	 */
	public String getSalesPersonName() {
		return salesPersonName;
	}

	/**
	 * @param salesPersonName the salesPersonName to set
	 */
	public void setSalesPersonName(String salesPersonName) {
		this.salesPersonName = salesPersonName;
	}
	
	public double calculateGrossSales() {
		
		Scanner input = new Scanner(System.in);
		int numberOfItems = 0;
		int counter = 1;
		double total = 0;
		double itemPrice =0;
		System.out.print("Enter number of items: ");
		numberOfItems = input.nextInt();
		
		while(counter <= numberOfItems) {
			System.out.print("Enter item price: ");
			itemPrice = input.nextDouble();
			
			total = (double)total + itemPrice;
			counter++;
			
		}
		return total;
		
	}
	public double getEarnings() {
		double earnings;
		earnings = 200 + (0.09 * calculateGrossSales());
		
		return earnings;
	}
}
