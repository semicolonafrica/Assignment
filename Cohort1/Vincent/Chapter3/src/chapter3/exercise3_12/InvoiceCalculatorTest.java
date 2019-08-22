package chapter3.exercise3_12;
	import java.util.Scanner;
public class InvoiceCalculatorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the quantity of item purchased");
		int quantity = input.nextInt();
		
		System.out.println("Enter the price of item purchased");
		double price = input.nextDouble();
		
		InvoiceCalculator calculator = new InvoiceCalculator("AA12A","durable",quantity,price);
		
		calculator.getInvoicemount();
		
		
	}

}
