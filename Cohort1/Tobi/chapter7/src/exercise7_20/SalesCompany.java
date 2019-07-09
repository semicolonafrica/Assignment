package exercise7_20;

import java.util.Random;

public class SalesCompany {

	private double[][] sales = new double[4][5];
	

	public void processSlip() {
		Random gross = new Random();
		//process slips for each saleperson daily sales 
		double dailySale;
		for(int daily = 0; daily <= 30; daily++) {
			
			for(int id = 0; id < sales.length; id++) {
			
				for(int product = 0; product < sales[id].length; product++ ) {
					dailySale = gross.nextInt(1000);
					sales[id][product] += dailySale;
				}
			}
		
		}
	}
	public void displayTotals() {
		double totalbyPerson = 0;
		double totalbyProduct = 0;
		processSlip();
		System.out.println("SALES SUMMARY");
		System.out.printf("%10s%15s%15s%15s%15s%15s%15s%n%n", "Salesperson", "product[1]","product[2]",
				"product[3]","product[4]","product[5]","Total Sales");
		
		for(int id = 0; id < sales.length; id ++) {
			System.out.printf("%11d" ,id + 1);
			for(int product = 0; product < sales[id].length; product++) {
				System.out.printf("%15.2f", sales[id][product]);
				totalbyPerson += sales[id][product];
			}
			System.out.printf("%15.2f", totalbyPerson);
			totalbyPerson = 0;
			System.out.println("\n");
		}
		int prodIncrement = 0;
		
		System.out.printf("%s%n%11s","Product","Totals: ");
		for(int count = 0; count < sales.length; count++) {
			
			totalbyProduct = sales[count][prodIncrement] + totalbyProduct;
			if(count == 3 ) {
				System.out.printf("%15.2f", totalbyProduct);
				totalbyProduct = 0;
				prodIncrement++;
				count = 0;
			}
			if(prodIncrement == 5) {
				break;
			}
			
		}
//		System.out.println(sales[4][0]);
	}
	public static void main(String [] args) {
		SalesCompany market = new SalesCompany();
		
		market.displayTotals();
	}
}
