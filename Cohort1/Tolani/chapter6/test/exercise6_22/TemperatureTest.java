package exercise6_22;

import java.util.Scanner;

public class TemperatureTest {

	public static void main(String[] args) {
		Scanner insert = new Scanner(System.in);
		
		System.out.println("Enter C to calculate temperature in Celsius or F to calculate in Fahrenheit: ");
		char temp = insert.next().charAt(0);
		while(temp !='C' || temp != 'F') {
			System.out.println("Enter C to calculate temperature in Celsius or F to calculate in Fahrenheit: ");
			temp = insert.next().charAt(0);
			if(temp =='C' || temp == 'F') {
				break;
			}
		}
		if(temp == 'C' || temp == 'F') {
			System.out.println("Enter value: ");
			int value = insert.nextInt();
			
			if(temp == 'F') {
					System.out.println(Temperature.fahrenheit(value)+"'F");
					
				
			}else if(temp == 'C') {
					System.out.printf("%.2f%s",Temperature.celsius(value),"'C");
				
			}
		}
			
		
		
		
		
		insert.close();
	}
	

}
