package chapter8;

public class Date {

	private int month; // 1-12
	private int day;
	private int year;
	
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	// constructor: confirm proper value for month and day given the year
	
	public Date(int month, int day, int year)
	{
		// check if month in range
		if(month <= 0 || month > 12)
			throw new IllegalArgumentException(
			"month (" + month + ") must be 1-12"); 
		
		//check if day in range for month
		if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day +
					") out-of-range for the specified month and year");
		
		//check for leap year if month is 2 and day is 29
		if(month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
			throw new IllegalArgumentException("day (" + day +
					") out-of-range for the specified month and year");
	
		//check if year in range
		if(year >= daysPerMonth[1] && year <= daysPerMonth[12])
			throw new IllegalArgumentException("year (" + year + ") is out of range");
		
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("Date object constructor for date %s%n%n", this);
		
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
		return String.format("%d/%d/%d",month,day,year);
	}
	
	public int nextDay() {
		
		int value = getDay() + 1;
		
		return value;
		
		
	}
	
	public int incMonth() {
		return getMonth() + 1;
	}
	
	public int incYear() {
		return getYear() + 1;
	}
	
	
}
