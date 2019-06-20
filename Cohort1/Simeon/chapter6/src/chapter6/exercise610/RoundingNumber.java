package chapter6.exercise610;

public class RoundingNumber {
	
	 static double  x = 5.456345;
	 static double y;
	
		
	public static void roundToInteger() {
		y = Math.floor(x + 0.5);
		System.out.println(y);
	}
		
	public static  void roundToTenths() {
		y = Math.floor(x * 10 + 0.5) / 10;
		System.out.print(y);
	}

	public static void roundToHundredths() {
		y = Math.floor(x * 100 + 0.5) / 100;
		System.out.print(y);
	}

	public static void roundToThousandths() {
		y = Math.floor(x * 1000 + 0.5) / 1000;
		System.out.print(y);			
	}
}


