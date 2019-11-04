package exercise10_13;

public class Circle extends Two_DimensionalShape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = Math.PI * (Math.pow(radius, 2));
		return area;
	}
}
