	package chapter8;

	import java.util.Scanner;

	public class DateTest {

		public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the month, day and year respectively: ");
		
		int month = input.nextInt();
		int day	  = input.nextInt();
		int year  = input.nextInt();
		
		
		Date date = new Date(month, day, year);
		
		int dayAdd = date.getDay();
		int monthAdd = date.getMonth();
		int yearAdd = date.getYear();
		
		for(int i = 0; i <= 100; i++) {

			if(date.getDay() > 0 && date.getDay() <= 31)
				dayAdd++;
			else if(date.getDay() > 31) {
				monthAdd++;
			} else if(month > 12) {			
				yearAdd++;
			}
			System.out.println();	
			//	System.out.printf("%02d/%02d/%02d%n ",monthAdd,dayAdd,yearAdd);
			}

		input.close();
		}
		
		

	}


