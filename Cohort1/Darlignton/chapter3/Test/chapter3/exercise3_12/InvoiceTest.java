package chapter3.exercise3_12;

public class InvoiceTest {
    public static void main(String[] args){
       
        Invoice invoice1 = new Invoice("thirty", "myInvoice", 20, -1.0);

        
        System.out.printf("%s%n", invoice1.getNumber());
        System.out.printf("%s%n", invoice1.getDescription());
        System.out.printf("%d%n", invoice1.getPurchase());
        System.out.printf("%f%n", invoice1.getPrice());
        System.out.printf("%f%n", invoice1.getAmountInvoice());
        
    }
}  
