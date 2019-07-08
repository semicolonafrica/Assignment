package chapter4i.exercise419;

public class SalesCalculator {
	public String salesPerson;
    private double priceItem1;
    private double priceItem2;
    private double priceItem3;
    private double priceItem4;
    private int numberOfItem1Sold;
    private int numberOfItem2Sold;
    private int numberOfItem3Sold;
    private int numberOfItem4Sold;
    private double sales;

    public SalesCalculator(String salesPerson ,double priceItem1, double priceItem2, double priceItem3, double priceItem4, 
    int numberOfItem1Sold, int numberOfItem2Sold, int numberOfItem3Sold,int numberOfItem4Sold){
        this.salesPerson = salesPerson;
        this.priceItem1 = priceItem1;
        this.priceItem2 = priceItem2;
        this.priceItem3 = priceItem3;
        this.priceItem4 = priceItem4;
        this.numberOfItem1Sold = numberOfItem1Sold;
        this.numberOfItem2Sold = numberOfItem2Sold;
        this.numberOfItem3Sold = numberOfItem3Sold;
        this.numberOfItem4Sold = numberOfItem4Sold;
    }

    public double totalsales(){
        double sales = (priceItem1*numberOfItem1Sold) + (priceItem2*numberOfItem2Sold) + (priceItem3*numberOfItem3Sold) + (priceItem4*numberOfItem4Sold); 
        this.sales = sales;
        return sales;
    }
    public double salescommission(){
        double commission = 0.09 * sales;
        return commission;
    }
    public double salesPersonearning(){
        double earning = 200 + (0.09 * sales);
        return earning;
    } 

}
