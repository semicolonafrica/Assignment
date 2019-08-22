package chapter3.exercise3_12;

public class HealthRecord {
	
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private double height;
	private int weight;
	public HealthRecord(String firstName, String lastName, double height, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void displayDateofBirth(int month, int day, int year) {
		
		System.out.println(day +"/" + month +"/" + year);	
	}
	
	public int dateofBirth(int presentyear, int yearofbirth) {
		
		 int age = 0 ;
		
		age =  presentyear - yearofbirth;
		 System.out.printf("your age is: %s%n", age);

		return age;		
	}
	public int maximumHeartRate(int age) {
		int maxrate = 220 - age;
		System.out.printf("your maximum heart rate is: %d%n", maxrate);
		return maxrate;
	}
	public int targetHeartRate(int age) {
		int targetRate = (int) (age * 0.60);
		System.out.printf("your target heart rate is: %d%n", targetRate);
		return targetRate;
	}
//
//	weightInPounds × 703
//	heightInInches × heightInInches
	public double calculateBMI(int weight, double height) {
		
		this.weight = weight;
		this.height = height;
		
       double heigh = Math.sqrt(height);
		
		double bodyIndex = weight * 703 / heigh;
		System.out.printf("your BMI is: %.2f%n", bodyIndex);
		return bodyIndex;
		
	
	}
}
