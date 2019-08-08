package exercise8_14;
/*
 * Date Class) Create class Date with the following capabilities:
a) Output the date in multiple formats, such as
MM/DD/YYYY
June 14, 1992
DDD YYYY
b) Use overloaded constructors to create Date objects initialized with dates of the formats
in part (a). In the first case the constructor should receive three integer values. In the
second case it should receive a String and two integer values. In the third case it should
receive two integer values, the first of which represents the day number in the year.
[Hint: To convert the String representation of the month to a numeric value, compare
Strings using the equals method. For example, if s1 and s2 are Strings, the method
call s1.equals(s2) returns true if the Strings are identical and otherwise returns*/

public class Date2 {
	private int month,day,year,store;
	
private static final int[] daysPerMonth= {0, 31,28,31,30,31,30,31,31,30,31,30,31};
private static final String [] nameOfMonth= {"blank","jan","feb","march","april","may","jun","jul","aug","sep","oct","nov","dec"};
	
	public Date2(int month,int day,int year) {
		if(month<=0 || month>12)
			throw new IllegalArgumentException("month(" + month + ")must be 1-12");
		
		if(day<=0 ||(day>daysPerMonth[month]&&!(month==2 && day==29)))
			throw new IllegalArgumentException("day(" + day +")out of range for the specified month and year");
		
		
		if(month==2 && day==29 && !(year % 400==0||(year % 4==0 && year%100 !=0)))
			throw new IllegalArgumentException("day(" + day +") out of range for the specified month and year");
		
		
	
//		if(year<=0)
//			throw new IllegalArgumentException("year (" + year + ") must be start from 1");
		
		this.day=day;
		this.month=month;
		this.year=year;
		
		System.out.printf("Date objecct constructor for date %s%n", this);
	}
	
	public Date2(String month, int day, int year) {
		
		for(int i=1; i<nameOfMonth.length; i++) {
			
			if (month.equals(nameOfMonth[i])){
				store=i;
				
			}
			
		}
		
		this.month=store;
		this.day=day;
		this.year=year;
		
	}
	
	public Date2(int day,int year) {
		
		int count = 1;
		while(day >= 31) {
			
			day -= daysPerMonth[count];
			
			count++;
		}
			

		this.day=day;
		this.year=year;
		this.month=count;
		
	}
	
	
	public String toString() {
		
		return String.format("%d/%d/%d", month,day,year);
	}
	
	public String toUniversalString() {
		
 		return String.format("%02d:%02d:%02d", getMonth(),getDay(),getYear());
 		
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
	public static int[] getDayPerMonth() {
		return daysPerMonth;
	}
	

}
