package chapter3.exercise317;

//Program to create a starter health profile for a person

public class HealthProfile {
	


	    // class attributes //
	    private String lastName;
	    private String firstName;
	    private boolean isMale;
	    private int dayOfBirth;
	    private int monthOfBirth;
	    private int yearOfBirth;
	    private double height;
	    private int weight;
	    private int ageInYears;
	    private int heartRate;

	    // using a constructor //
	    public HealthProfile(String firstName, String lastName, boolean isMale,
	     int dayOfBirth, int monthOfBirth, int yearOfBirth, double height, int weight) {

	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.isMale = isMale;
	        this.dayOfBirth = dayOfBirth;
	        this.monthOfBirth = monthOfBirth;
	        this.yearOfBirth = yearOfBirth;
	        this.height = height;
	        this.weight = weight;
	     }


	    // creating a setter and getter method //
	     public void setFirstName(String firstName) {
	         this.firstName = firstName;
	     }
	     public String getFirstName() {
	        return firstName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getLastName(){
	        return lastName;
	    }
	    public void setGender(boolean isMale) {
	        this.isMale = isMale;

	    }
	    public boolean getGender() {

	        return isMale;
	    }
	    public void setDayOfBirth(int dayOfBirth) {
	        this.dayOfBirth = dayOfBirth;
	    }
	    public int getDateOfBirth() {
	        return dayOfBirth;
	    }
	    public void setMonthOfBirth(int monthOfBirth) {
	        this.monthOfBirth = monthOfBirth;
	    }
	    public int getMonthOfBirth() {
	        return monthOfBirth;
	    }
	    public void setYearOfBirth(int yearOfBirth) {
	        this.yearOfBirth = yearOfBirth;
	    }
	    public int getYearOfBirth() {
	        return yearOfBirth;
	 }

	    public void setHeight(double height) {
	        this.height = height;
	    }
	    public double getHeight() {
	        return height;
	    }
	    public void setWeight(int weight) {
	        this.weight = weight;
	    }
	    public int getWeight() {
	        return weight;
	    }

	    public int calculateAge() {
	        int ageInYears = 2019 - yearOfBirth;
	        this.ageInYears = ageInYears;
	        return ageInYears;
	    }

	    public int calculateHeartRate() {
	       
	        int heartRate = 220 - ageInYears;
	        this.heartRate = heartRate;
	        return heartRate;
	    }

	    public double calculateTargetHeartRate() {

	        double targetHeartRate = 0.7*heartRate;
	        return targetHeartRate;
	    }

	    public double calculateBMI() {
	        double BMI = (weight*703)/(height*height);
	        return BMI;
	    }



	

}
