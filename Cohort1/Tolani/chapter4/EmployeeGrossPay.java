public class EmployeeGrossPay{
    String employeeName;
    int hours;
    int extraHour;
    double rates;
    double straightPay;
    double extraHourPay;

    public EmployeeGrossPay(String employeeName, int hours, double rates){
        this.employeeName = employeeName;
        this.hours = hours;
        this.rates = rates;
    }
    public void calulateHoursPay(){
        

        if(hours > 40){
            extraHour = hours - 40;
            extraHourPay = extraHour * (rates + rates/2);
            System.out.println("Extra Hours pay is: " + extraHourPay);
        }else{
            straightPay = 40 * rates;
            System.out.println("Straight pay for  40 hours is: " + straightPay);
        }

    }
    public void calGrossPay(){
        double grossPay; 

        if(extraHourPay > 0){
            grossPay = (40 * rates) + extraHourPay;
            System.out.println("Employee gross pay is: " + grossPay);
        }
        else{
            grossPay = straightPay;
            System.out.println("Employee gross pay is: " + grossPay);
        }
    }   
}