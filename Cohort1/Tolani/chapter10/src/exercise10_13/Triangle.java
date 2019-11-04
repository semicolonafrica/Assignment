package exercise10_13;

public class Triangle extends Two_DimensionalShape {
	
	private double breadth;
	
	private double height;
	
	public Triangle(double breadth,double height) {
		this.breadth = breadth;
		this.height = height;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return (0.5 ) * breadth * height;
	}

}
