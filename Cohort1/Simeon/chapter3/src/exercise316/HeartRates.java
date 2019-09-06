package exercise316;

public class HeartRates {

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int day;
	private int month;
	private int year;
	
	
	public HeartRates(String firstName, String lastName, int day, int month, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (day > 0 && day <= 31)
			this.day = day;
		if (month > 0 && month <= 12)
			this.month = month;
		if (year > 0)
			this.year = year;
		this.dateOfBirth = day + "/" + month + "/" + year;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDateOfBirth() {	
		dateOfBirth = day + "/" + month + "/" + year;
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if (day > 0 && day <= 31)
			this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if (month > 0 && month <= 12)
			this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if (year > 0)
			this.year = year;
	}
	
	public int getAge() {
		int age;
		age = 2019 - getYear();
		
		return age;
	}
	
	public int calMaxHeartRate() {
		int maxHeartRate;
		maxHeartRate = 220 - getAge();
		
		return maxHeartRate;
	}
	
	public String getTargetHeartRate() {
		int minHeartRange;
		int maxHeartRange;
		String targetHeartRate;
		
		minHeartRange = (int) (0.5 * calMaxHeartRate());
		maxHeartRange = (int) (0.85 * calMaxHeartRate());
		targetHeartRate = minHeartRange + "-" +  maxHeartRange;
		
		return targetHeartRate;

	}
	
}
