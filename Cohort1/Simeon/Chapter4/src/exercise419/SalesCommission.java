package exercise419;

public class SalesCommission {

	private String salesPerson;
	private final int wages = 200;
	private double grossSales;
	
	
	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}
	
	public String getSalesPerson() {
		return salesPerson;
	}
	
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public int getWages() {
		return wages;
	}
	
	public double sales(double sales) {
		grossSales += sales;
		
		return grossSales;
	}
	
	public double totalWages() {
		double totalWages;
		totalWages = wages + (0.09 * grossSales);
		return totalWages;
	}
	
	public void itemSold(int item) {
		if (item == 1)
			grossSales += 239.99;
		if (item == 2)
			grossSales += 129.75;
		if (item == 3)
			grossSales += 99.95;
		if (item == 4)
			grossSales += 350.89;
		
	}
	
	
}
