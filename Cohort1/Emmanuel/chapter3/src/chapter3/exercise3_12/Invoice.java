/**
 * 
 */
package chapter3.exercise3_12;

/**
 * @author Emmanuel Akinbode
 *
 */
public class Invoice {
	
	    private String partNumber;
	    private String description;
	    private int quantity;
	    private double price;

	    public Invoice(String partNumber, String description, int quantity, double price){
	        this.partNumber = partNumber;
	        this.description = description;
	        this.quantity = quantity;
	        this.price = price;
	    }    
	    public void setPartNumber(String partNumber){
	        this.partNumber = partNumber;
	    }
	    public void setDescription(String description){
	        this.description = description;
	    }
	    public void setQuantity(int quantity){
	        this.quantity = quantity;
	    }
	    public void setPrice(double price){
	        this.price = price;
	    }
	    public String getPartNumber(){
	        return partNumber;
	    }
	    public String getDescription(){
	        return description;
	    }
	    public int getPQuantity(){
	        return quantity;
	    }
	    public double getPrice(){
	        return price;
	    }
	    public double getInvoice(){
	        
	       
	        if(quantity < 0){
	            quantity = 0;
	        }  
	        if(price < 0){
	            price = 0.0;
	        }
	        double amount = quantity * price;
	            return amount;
	        
	    }
	  
	}



