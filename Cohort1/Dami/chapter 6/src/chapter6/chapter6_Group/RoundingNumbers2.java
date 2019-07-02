package chapter6;

public class RoundingNumbers2 {
	public double roundInteger(double number) {
		double y = Math.floor(number + 0.5);
		return y;
	}
	
	public double roundToTenths(double number) {
		double y = Math.floor(number * 10 + 0.5)/10;
		return y;
	}
	
	public double roundToHundredths(double number) {
		double y = Math.floor(number * 100 + 0.5)/100;
		return y;
	}
	
	public double roundToThousandths(double number) {
		double y = Math.floor(number * 1000 + 0.5)/1000;
		return y;
	}
}
