/**
 * RoundingNumbers1
 */
public class RoundingNumbers1 {

    public static double getFirstRandomNumber() {

        double x = 5.5;

        double y = Math.floor(x + 0.5);

        System.out.print( x + " " + y);

        return y;

    }

    public static double roundToInteger(double number){

       double y =  Math.floor(number * 10.0 + 0.5);
        return y;
    }

    public static double roundToTenths(double number) {
        double  y = Math.floor(number * 10.0 + 0.5) / 10.0;
        return y;
    }
    public static double roundToHundredths(double number) {
        double y = Math.floor((number * 100.0 + 0.5) / 100.0);
        return y;
    }
    public static double roundToThousands(double number) {
        double y = Math.floor(number * 1000.0 + 0.5) / 1000.0;
        return y;
    }

    public static void main(String[] args) {
        //RoundingNumbers1 round = new RoundingNumbers1();

        System.out.print("Original number and rounded number" + 5.50 + " " +RoundingNumbers1.getFirstRandomNumber());
        System.out.print("Original number and rounded number" + 10.50 + " " + RoundingNumbers1.roundToInteger(10.5));
        System.out.print("Original number and rounded number " + 23.50  + " "+ RoundingNumbers1.roundToTenths(23.5));
        System.out.print("Original number and rounded number " + 15.50 + " " + RoundingNumbers1.roundToHundredths(15.5));
        System.out.print("Original number and rounded number " + 12.50 + " " +RoundingNumbers1.roundToThousands(12.5));
    }
    
}