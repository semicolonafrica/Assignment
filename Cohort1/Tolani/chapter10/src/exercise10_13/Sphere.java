package exercise10_13;

public class Sphere extends Three_DimensionalShape {
	
	public double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 4 * Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public double getVolume() {
		double volume = (4 /3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}

}
