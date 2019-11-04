package exercise10_13;

public class Cube extends Three_DimensionalShape {
	
	private double edge;
	
	public Cube(double edge) {
		this.edge = edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}
	
	public double getArea() {
		double area = 6 * (Math.pow(edge,2));
		return area;
	}

	public double getVolume() {
		double volume = Math.pow(edge, 3);
		return volume;
	}
}
