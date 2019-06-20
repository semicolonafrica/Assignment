package exercise4_19;

public class SalesCommission {
	private int weeklyWages;
	private double commissionOnItem;
	private int itemSold;
	private double value;
	private double grossSales;
	private double weeklyEarning;
	
	// Creating a Constructor class
	public SalesCommission(int weeklyWages, double commissionOnItem, int itemSold, double value) {
		
		this.weeklyWages = weeklyWages;
		this.commissionOnItem = commissionOnItem;
		this.itemSold = itemSold;
		this.value = value;
	}

	public int getWeeklyWages() {
		return weeklyWages;
	}

	public void setWeeklyWages(int weeklyWages) {
		this.weeklyWages = weeklyWages;
	}

	public double getCommissionOnItem() {
		commissionOnItem = 0.09 * grossSales;
		return commissionOnItem;
	}

	public double getGrossSales() {
		grossSales = itemSold * value;
		return grossSales;
	}

	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}

	public void setCommissionOnItem(double commissionOnItem) {
		this.commissionOnItem = commissionOnItem;
	}

	public int getItemSold() {
		return itemSold;
	}

	public void setItemSold(int itemSold) {
		this.itemSold = itemSold;
	}

	public double getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public double calWeeklyEarning() {
		weeklyEarning = commissionOnItem + weeklyWages;
		return weeklyEarning;
	}	
	
}

