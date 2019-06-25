package exercise6_22;

public class Temperature {
	public void celsius() {
		double fahrenheit = 5.6;
		double celsius = 5.0 / 9.0 * (fahrenheit - 32);
		
		System.out.println("Temperture in celsius " + celsius);
	}
	public void farenheit() {
		double fahrenheit;
		double celsius = 3.0;
		fahrenheit = 9.0 / 5.0 * celsius + 32;
		System.out.print("Temperture in fahrenheit is " + fahrenheit);
	}
	
}
