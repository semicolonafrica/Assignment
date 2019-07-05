package chapter5.exercise532;
import java.util.Scanner;
public class FairTax {

	public void getFairTax() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter total number of categories");
		int counter = input.nextInt();
		
	double total;
	double total_percent = 0.00;
	
	for(int i = 1; i <= counter; i++) {
		
		System.out.printf("%s\t%s%n", ">>", "Enter Quantity/Volume of item");
		int quantity = input.nextInt();
		
		System.out.println("Enter unit cost");
		int cost = input.nextInt();
		
		double total_temp = quantity * cost;
		System.out.printf("%,.2f%n", total_temp);
		total = 0.23 * total_temp;
		System.out.printf("%s%,.2f%n", "FairTax for the item listed above is: ", total);
		
		total_percent += total;
		//System.out.println(total_percent);
		
	}
	System.out.println();
	System.out.printf("%s%d%s%,.2f%n", "Total FairTax for the ", counter, " items above is ", total_percent);
		
		
	}

}
