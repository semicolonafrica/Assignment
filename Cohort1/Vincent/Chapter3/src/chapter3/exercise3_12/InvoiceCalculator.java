package chapter3.exercise3_12;

public class InvoiceCalculator {
	
	private String partNumber;
	private String description;
	private int quantityOfItem;
	private double priceItem;
	public InvoiceCalculator(String partNumber, String description, int quantityOfItem, double priceItem) {
		super();
		partNumber = partNumber;
		this.description = description;
		this.quantityOfItem = quantityOfItem;
		this.priceItem = priceItem;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		partNumber = partNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQunatityOfItem() {
		return quantityOfItem;
	}
	public void setQunatityOfItem(int qunatityOfItem) {
		this.quantityOfItem = qunatityOfItem;
	}
	public double getPriceItem() {
		return priceItem;
	}
	public void setPriceItem(double priceItem) {
		this.priceItem = priceItem;
	}
	
	public double getInvoicemount() {
		double invoiceAmount;
		invoiceAmount = quantityOfItem / priceItem;
	
			System.out.printf("The invoice amount of the store: %.2f", invoiceAmount);
			return invoiceAmount;
	}
}
