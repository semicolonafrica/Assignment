package chapter4i.exercise419;

public class SalesCalculatorTest {

	public static void main(String[] args) {
		SalesCalculator salesPerson1 = new SalesCalculator("James", 239.99, 129.75, 99.95, 350.89, 20, 50, 100, 30);
        System.out.println(salesPerson1.salesPerson + " total sales: $" + salesPerson1.totalsales());
        System.out.println("Commission on sales: $" + salesPerson1.salescommission());
        System.out.println(salesPerson1.salesPerson + " total earning($200 + commission): "+ "$" +salesPerson1.salesPersonearning());
 
	}

}
