package Exercise3_12;

public class Invoice {
	private int quantityPurchased;
	private double pricePerItem;
	private String partNumber;
	private String partDescription;
	
	public Invoice(int quantityPurchased, int pricePerItem, String partNumber, String partDescription) {
		this.quantityPurchased = quantityPurchased;
		this.pricePerItem = pricePerItem;
		this.partNumber = partNumber;
		this.partDescription = partDescription;
	}

	public int getQuantityurchased() {
		return quantityPurchased;
	}
	public void setQuantityPurchased(int quantityPurchased) {
		if(quantityPurchased < 0) {
			quantityPurchased = 0;
		}else if(quantityPurchased > 0) {
			this.quantityPurchased = quantityPurchased;
		}
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem < 0.0) {
			pricePerItem = 0.0;
		}else if(pricePerItem > 0.0)
		this.pricePerItem = pricePerItem;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public double getInvoiceAmount(double amount) {
		amount = quantityPurchased * pricePerItem;
		return amount;
		}	
}
