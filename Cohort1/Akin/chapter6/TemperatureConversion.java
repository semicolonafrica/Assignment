/**
 * TemperatureConversion
 */
public class TemperatureConversion {

    public static int celsius(int f) {

        double celsuis = ((int) (5.0 / 9.0) * (f - 32));

        return (int)celsuis;
    }
    
    public static double fahrenheit(int c) {

        double fahren = (((9.0 / 5.0) * c) + 32);
        return (int)fahren;
    }

}