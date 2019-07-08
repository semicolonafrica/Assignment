package exercise3_14;




public class Date{
	
    private int month;
    private int day;
    private int year;


    public Date( int thisDay, int thisMonth, int thisYear){
        this.month = thisMonth;
        this.day = thisDay;
        this.year = thisYear;    

}

    public void setDay( int days){
            this.day = days;
    }
    public int getDay(){
        return day;
    }
    public void setMonth(int months){
        this.month = months;
    }

    public int getMonth(){
        return month;
    }

    public void setYear(int years){
        this.year = years;
    }
    public int getYear(){
        return year;
    }
    public String displaydate(){
        return day + "/" + month + "/" + year;
    }
}
