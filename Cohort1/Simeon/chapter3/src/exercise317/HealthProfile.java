package exercise317;

public class HealthProfile {

	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private int height;
	private int weight;
	
	private int day;
	private int month;
	private int year;
	
	public HealthProfile(String firstName, String lastName, String gender, String dateOfBirth, int height, int weight) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
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

	public String getDateOfBirth() {
		dateOfBirth = day+"/"+month+"/"+year;
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
	
	public double bmi() {

		return (weight * 703) / (height * height);
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
	
	public void getTargetHeartRate() {
		int minHeartRange;
		int maxHeartRange;
		
		
		minHeartRange = (int) (0.5 * calMaxHeartRate());
		maxHeartRange = (int) (0.85 * calMaxHeartRate());

		System.out.printf("%d-%d", minHeartRange, maxHeartRange);

	}
	
}


