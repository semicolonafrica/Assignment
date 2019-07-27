/**
 * 
 */
package exercise8_8;

/**
 * @author User
 * (Enhancing Class Date) Modify class Date of Fig. 8.7 to perform error checking on the initializer
values for instance variables month, day and year (currently it validates only the month and
day). Provide a method nextDay to increment the day by one. Write a program that tests method
nextDay in a loop that prints the date during each iteration to illustrate that the method works correctly.
Test the following cases:
a) incrementing into the next month and
b) incrementing into the next year.
 *
 */
public class Date {
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth= {0, 31,28,31,30,31,30,31,31,30,31,30,31};
	
	public Date(int month,int day,int year) {
		if(month<=0 || month>12)
			throw new IllegalArgumentException("month(" + month + ")must be 1-12");
		
		if(day<=0 ||(day>daysPerMonth[month]&&!(month==2 && day==29)))
			throw new IllegalArgumentException("day(" + day +")out of range for the specified month and year");
		
		
		if(month==2 && day==29 && !(year % 400==0||(year % 4==0 && year%100 !=0)))
			throw new IllegalArgumentException("day(" + day +") out of range for the specified month and year");
		
		if(year<=0)
			throw new IllegalArgumentException("year (" + year + ") must be start from 1");
		this.day=day;
		this.month=month;
		this.year=year;
		
		System.out.printf("Date objecct constructor for date %s%n", this);
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month,day,year);
	}
	
	public void nextDay() {
		
		if(day<daysPerMonth[month]) {
			
			day++;
			
		}
		 if(day==daysPerMonth[month]) {
			++month;
			day=1;
		}
		 if (month>12) {
			++year;
			month=1;
		}
		
		
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

	public static int[] getDayspermonth() {
		return daysPerMonth;
	}

}
