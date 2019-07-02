/**
 * 
 */
package chapter3.exercise310;

public class Invoice {

    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String description,int quantity,double price_per_item) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;;
        this.price = price_per_item;
    }
    public void setNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public String getNumber() {
        return partNumber;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPrice(double price_per_item) {
        this.price = price_per_item;
    }
    public double getPrice() {
        return price;
    }
    public void setInvoiceAmount(int quantity, double price) {
        this.quantity = quantity;
        this.price = price; 
    }
    public double getInvoiceAmount() {
        if(quantity < 0 ) {
            return 0;
        }
        else if(price < 0.0) {
            return 0.0;
        }else{
        return quantity * price;
        }
    }
}
   