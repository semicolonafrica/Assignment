package chapter3.exercise312;

//Invoice.java for a store for invoice issuing //
public class Invoice {

 // creating the class variables //
 private String partNumber;
 private String partDescription;
 private int itemQuantity;
 private double pricePerItem;

 // providing a constructor for the variables //
 public Invoice(String partNumber, String partDescription, int itemQuantity, double pricePerItem) {
     this.partNumber = partNumber;
     this.partDescription = partDescription;
     this.itemQuantity = itemQuantity;
     this.pricePerItem = pricePerItem;
 }

 // creating a set and get method //
 public void setPartNumber(String partNumber) {
     this.partNumber = partNumber;
 }
 public String getPartNumber() {
     return partNumber;
 }

 public void setPartDescription(String partDescription) {
     this.partDescription = partDescription;
 }
 public String getPartDescription() {
     return partDescription;
 }

 public void setItemQuantity(int itemQuantity) {
     this.itemQuantity = itemQuantity;
 }
 public int getItemQuantity() {
     return itemQuantity;
 }

 public void setPricePerItem(double pricePerItem) {
     this.pricePerItem = pricePerItem;
 }
 public double getPricePerItem() {
     return pricePerItem;
 }


 public double invoiceAmount() {
     return itemQuantity * pricePerItem;
 }


}
