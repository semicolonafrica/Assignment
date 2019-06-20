package exercise5_32;
import java.util.Scanner;

public class Tax {
	private String items;
	private int price;
	private String space = "";
	
	public void getItem() {
		Scanner item = new Scanner(System.in);
		
		if(price !=-1) {
		System.out.print("Enter Object Item: ");
		items = item.nextLine();
		
		System.out.print("Enter Object Price: ");
		price = item.nextInt();
		
		System.out.print("");
		space = item.nextLine();
		
		price++;		
	}
		if (price == -1) {
			int total = 0; total += price;		
		System.out.print("Price of all Items sold is: "+item +price);
		
		double tax = 0; tax = total*0.23;
		System.out.print("Tax on all Items sold is: "+tax);
		}
}
}
