/**
 * 
 */
package chapter3.exercise3_16;

/**
 * @author Emmanuel Akinbode
 *
 */
public class HeartRates {
	
	
	    private String firstName;
	    private String lastName;
	    private int year;
	    private int month;
	    private int day;
	    private int age;
	    private int maxRates;


	    public HeartRates(String firstName, String lastName, int year, int month, int day){
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.year = year;
	        this.month = month;
	        this.day = day;
	    }
	    public void setfirstName(String firstName){
	        this.firstName = firstName;
	    }
	    public String getfirstName(){
	        return firstName;
	    } 
	    public void setlastName(String lastName){
	        this.lastName = lastName;
	    }
	    public String getlastName(){
	        return lastName;
	    } 
	    public void setYear(int year){
	        this.year = year;
	    }
	    public int getYear(){
	        return year;
	    } 
	    public void setMonth(int month){
	        this.month = month;
	    }
	    public int getMonth(){
	        return month;
	    }
	    public void setDay(int day){
	        this.day = day;
	    }
	    public int getDay(){
	        return day;
	    } 
	    public void displayDate(int year, int month, int day){
	        this.year = year;
	        this.month = month;
	        this.day = day;

	        System.out.println("DOB is: " + year + "/" + month + "/" + day);
	    }
	    
	    public int calculateAge(int currrentYear){   
	        age = currrentYear - year;
	        return age;
	    }
	    public int calMaxHeartRates(){
	        maxRates = 220 - age;
	        return maxRates;
	    }
	    public double calLowerTargetRate(){

	        double lowerPercent = 0.5 * maxRates;
	        
	        return lowerPercent;
	    }
	    public double calHigerTargetRate(){

	        double highPercent = 0.85 * maxRates;

	        return highPercent;
	    }


	}
  