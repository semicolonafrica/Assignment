package chapter3.exercise3_12;

public class HeartRateCalculator {

		private String firstName;
		private String lastName;
		private int day;
		private int year;
		private int month;
		private int age;
		
		public HeartRateCalculator(String firstName, String lastName,int age,int year) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.year = year;
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
	
		public void displayDateofBirth(int month, int day, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
			System.out.println(day +"/" + month +"/" + year);
			
		}
	public int dateofBirth(int presentyear, int yearofbirth) {
	
		 int age = 0 ;
		 this.age = age;
		age =  presentyear - yearofbirth;
		 System.out.printf("your age is: %s%n", age);

		return age;
		
		
	}
	public int maximumHeartRate(int age) {
		this.age = age;
		int maxrate = 220 - age;
		System.out.printf("your maximum heart rate is: %d%n", maxrate);
		return maxrate;
	}
	public int targetHeartRate(int age) {
		this.age = age;
		int targetRate = (int) (age * 0.60);
		System.out.printf("your target heart rate is: %d%n", targetRate);
		return targetRate;
	}
}
