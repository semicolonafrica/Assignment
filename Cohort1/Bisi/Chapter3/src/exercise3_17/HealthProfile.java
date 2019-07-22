package exercise3_17;

public class HealthProfile {
	private String firstName;
	private String lastName;
	private String gender;
	private int day;
	private int month;
	private int year;
	private int height;
	private int weight;
	
	public HealthProfile(String firstName, String lastName, String gender, int day, int month, int year, int height,
			int weight) {		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.day = day;
		this.month = month;
		this.year = year;
		this.height = height;
		this.weight = weight;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		int age = 2019 - year;
		return age;
	}
	public int getMaximumHeartRate(){
		int MaximumHeartRate = 220 - getAge();
		return MaximumHeartRate;
	}
	public double getTargetHeartRateRange() {
		double targetHeartRateRange = getMaximumHeartRate() * 0.5;
		return targetHeartRateRange;		
	}
	public double getBMI() {
		double bMI = (weight * 703) / (height * height);
		return bMI;
		
	}
	
	

}
