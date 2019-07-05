package chapter3.exercise316;
//import java.util.Scanner;
//program for heartRates //
public class HeartRates {

 // creating the attributes //    
 private String firstName;
 private String lastName;
 private String dateOfBirth;
 private int month;
 private int day;
 private int year;
 private int age;
 private int maximumHeartRate;

 // creating a constructor for the program //
 public HeartRates(String firstName, String lastName, String dateOfBirth) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.dateOfBirth = dateOfBirth;

 }
 
 // creating a setter and getter for the parameters //
 public void setFirstName(String firstName) {
     this.firstName = firstName;
 }
 public String getFirstName(){
     return firstName;
 }

 public void setLastName(String lastName) {
     this.lastName = lastName;
 }
 public String getLastName(){
     return lastName;
 }

 public void setDateOfBirth(int day, int month, int year) {
     this.day = day;
     this.month = month;
     this.year = year;
 }
 public String getDateOfBirth(int day, int month, int year) {
     String date = month+"/"+day+"/"+year;
     return date;
 }


 // creating method to calculate the age //    
 public int calculateAge(int year) {
      age = 2019 - year;
     return age;
 }

 // creating a method to calculate the maximum heart rate //
 public int calculateMaximumHeartRate() {
     maximumHeartRate = 220 - age;
     
     return maximumHeartRate;
 }
 
 // method to calculate rate range A and B //
 public double calculateRateRangeA() {
     double targetRate = maximumHeartRate * 0.85;
         return targetRate;
 }
 public double calculateRateRangeB() {
     double targetRate = maximumHeartRate * 0.50;
     
     return targetRate;
 }
}
