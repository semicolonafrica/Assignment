package chapter3.exercise314;

//program for Date.java //
public class Date {
 
 
 private int month;
 private int day;
 private int year;

 // creating a constructor for the class //
 public Date(int month, int day, int year) {
     this.month = month;
     this.day = day;
     this.year = year;
 }

 // creating a getter and setter method //

 public void setMonth(int month) {
     this.month = month;
 }
 public int getMonth() {
     return month;
 }

 public void setDay(int day) {
     this.day = day;
 }
 public int getDay() {
     return day;
 }

 public void setYear(int year) {
     this.year = year;
 }
 public int getYear() {
     return year;
 }


 // creating a method to display date //
 public String displayDate() {
    String date = month + "/" + day + "/" + year;
       return date;
 }

}
