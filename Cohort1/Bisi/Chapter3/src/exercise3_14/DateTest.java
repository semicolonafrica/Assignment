package exercise3_14;
import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date(0, 0, 0);
		
		Scanner in = new Scanner(System.in);
			
		System.out.print("Enter value for year: ");
		int year = in.nextInt();
		date.getYear();
		
		System.out.print("Enter value for day: ");
		int day = in.nextInt();
		date.getDay();
		
		System.out.print("Enter value for month: ");
		int month = in.nextInt();
		date.getMonth();
		
		System.out.println(date.displayDate());
		
	}

}
