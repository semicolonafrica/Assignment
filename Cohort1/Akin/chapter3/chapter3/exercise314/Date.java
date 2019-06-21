/**
 * 
 */
package chapter3.exercise314;

/**
 * Date
 */

public class Date {

    private int month,day,year;

    public Date(int month, int day, int year){
        if(day < 0 && month < 0 && year < 0) {
            System.out.print("Wrong value entered, try again!"); 
        } 
        if(day > 0 && month > 0 && year > 0){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    // Method that displays the month, day and year with
    // a forward slash. 
    
    public String displayDate() {
        String date;
        if((day < 0 && day >31) || (month < 0 && month > 12) || year > 0){
         
            date =  "Wrong value entered, try again!";
        }
        else {
            
            date = month + "/" + day + "/" + year;
        }
        return date;
    }
}


