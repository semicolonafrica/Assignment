package exercise312;

public class Invoice {

	private String partNumber;
	private String partDescription;
	private int itemQuantity;
	private double itemPrice;

	
	public Invoice(String partNumber, String partDescription, int itemQuantity, double itemPrice) {

		this.partNumber = partNumber;
		this.partDescription = partDescription;
		
		if (itemQuantity > 0)
			this.itemQuantity = itemQuantity;
		
		if (itemPrice > 0.0)
			this.itemPrice = itemPrice;
	
	}


	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}


	public String getPartNumber() {
		return partNumber;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public int getItemQuantity() {
		return itemQuantity;
	}


	public double getItemPrice() {
		return itemPrice;
	}

	
	public double getInvoiceAmount() {
		double invoiceAmount;
		invoiceAmount = itemQuantity * itemPrice;
		return invoiceAmount;
	}
	
}
