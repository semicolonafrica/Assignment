package exercise314;

public class Date {

	private int month;
	private int day;
	private int year;
	
	
	public Date(int month, int day, int year) {
		
		if (month > 0)
			this.month = month;
		if (day > 0)
			this.day = day;
		if (year > 0)
			this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		if (month > 0)
			this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		if (day > 0)
			this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		if (year > 0)
			this.year = year;
	}
	
	public void displayDate() {
		
		System.out.printf("%d/%d/%d",getMonth(), getDay(), getYear());
	}
	
	
}
