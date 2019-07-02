
import java.util.Scanner;

/**
 * TemperatureConversionTest
 */
public class TemperatureConversionTest {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value to convert: ");
        int value =  input.nextInt();
        
        System.out.print("Enter true to convert to fahrenheit and false to convert to celsuis: ");
        boolean correct = input.nextBoolean();
        
        if(correct == true) {
        	
        	
        	System.out.print(TemperatureConversion.fahrenheit(value));
        	
        	
        }
        else {
        	
        	System.out.print(TemperatureConversion.celsius(value));
        }
        
        
        
        	input.close();
    }
}