package exercise6_10;

public class RoundingNumbers {


	public static void roundToInteger(double number) {
		int y = (int)(Math.floor(number + 0.5));
		System.out.println("The original number is: " + number);
		System.out.println("The rounded value is: " + y);
	
	}
	public static void roundToTenths(double number) {
		double y = Math.floor(number*10  + 0.5) / 10;
		System.out.println("The original number is: " + number);
		System.out.println("Rounded value to the tenth position: " + y);
	}
	public static void roundToHundredths(double number) {
		double y = Math.floor(number*100 +0.5 ) / 100;
		System.out.println("The original number is: " + number);
		System.out.println("Rounded value to the hundredth position: " + y);
	}
	public static void roundToThousandths(double number) {
		double y = Math.floor(number*1000+ 0.5 ) / 1000;
		System.out.println("The original number is: " + number);
		System.out.println("Rounded value to the thousandth position: " + y);
	}
	

	public static void main(String[] args) {

		roundToInteger(32.5677);
		roundToTenths(32.5677);
		roundToHundredths(32.5677);
		roundToThousandths(32.5677);
		
		double y = Math.floor(7.5 * 1000 + 0.5) / 1000;
		
		System.out.println(y);
		// TODO Auto-generated method stub

	}

}
