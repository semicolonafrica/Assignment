package chapter3.exercise3_12;
import java.util.Scanner;
public class DateDisplayerTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter day");
		int day = input.nextInt();
		System.out.println("enter month");
		int month = input.nextInt();
		System.out.println("enter month");
		int year = input.nextInt();
		
		DateDisplayer todayDate = new DateDisplayer(day,month, year);
		
		todayDate.displayDate();
		
		
	}

}
