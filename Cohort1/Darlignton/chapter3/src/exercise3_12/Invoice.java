package chapter3.exercise3_12;

public class Invoice{
    private String number;
    private String description;
    private int purchase;
    private double price;
    // private double amount;
    // private double amount2;

    public Invoice (String num, String descript, int purchaseQuan, double priceIt){
        this.number = num;
        this.description = descript;
        
        if(purchaseQuan < 0)
           purchaseQuan = 0;
           this.purchase = purchaseQuan;

        if(priceIt < 0.0)
            priceIt =0.0;
            this.price = priceIt;
    }

    public void setNumber(String number){
        
    }
    public String getNumber(){
        return number;
    }

    public void setDescription(String description){

    }
    public String getDescription(){
        return description;
    }

    public void setPurchase(int purchase){

    }
    public int getPurchase(){
        return purchase;
    }

    public void setPrice(double price){

    }
    public double getPrice(){
        return price;
    }
   
    public double getAmountInvoice(){
        double amount = purchase * price;
        return amount;

    }


}
