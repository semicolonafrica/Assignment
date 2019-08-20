package chapter8;

public class Date {

	private int month; // 1-12
	private int day;
	private int year;
	
	
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	// constructor: confirm proper value for month and day given the year
	
	public Date(int month, int day, int year)
	{
		month = checkMonth(month);
		year = checkYear(year);
		day = checkDay(day);
		
		System.out.printf("Date object constructor for date %s%n", toString());
	}
	
	
	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	

	public String toString() {
		return String.format("%d/%d/%d",getMonth(),getDay(),getYear());
	}
	
	public void nextDay() {
		
		int testDay = day + 1;
		
		if(day == testDay) {
			day = testDay;
		} 
			day = 1;
			nextMonth();
		
	}
	
	public  void nextMonth() {
		if(month == 12) {
			year++;
		}
		month = month % 12 + 1;
	}
	
	public int checkYear(int year) {
		if(year > 0) {
			return year;
		} else {
			System.out.printf("Invalid year %d", year);
			return 1;
		}
	}
	
	public int checkMonth(int month) {
		int newmonth = 1;
		if(month > 0 && month <= 12) {
			newmonth = month;
			return newmonth;
		} else {
			System.out.printf("Invalid month %d", month);
			newmonth  = 1;;
		}
		return newmonth;
	}
	
	public int checkDay(int day) {
		
		int[] daysPerMonth = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
		
		if(day > 0 && day <= daysPerMonth[month]) {
			return day;
		}
		
		if(month == 2 && day == 29 && year % 400 == 0 || 
				year % 4 == 0 && year % 100 != 0) {
			return day;
		} else {
		System.out.printf("Invalid day %d.", day);
		return 1;
		}
	}
	
	

	
	
}
