package exercise10_13;

public class TwoDimensional extends Shape {
	
	private double area;
	
	public  double calArea() {
		return area;
		
	}
	
	public String toString() {
		return String.format("%s%nTwoDimensional", super.toString());
	}

}
