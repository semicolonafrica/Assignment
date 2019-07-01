package exercise6_22;
import java.util.Scanner;
public class TemperatureConversionsTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter value" );
		int value = input.nextInt();
		System.out.println("Enter true to convert to celsius and false for fahrenheit");
		boolean p =input.nextBoolean();
		if (p==true) {
			System.out.println((TemperatureConversions.celsius(value)));
			
		}
		else
		{
			System.out.println((TemperatureConversions.fahrenheit(value)));
		}

     input.close();
	}

}
