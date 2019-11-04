package exercise10_13;

public class Tetrahedron extends Three_DimensionalShape {

	private double edge;
	
	public Tetrahedron(double edge) {
		this.edge = edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}
	
	public double getArea() {
		double area = Math.sqrt(3) * Math.pow(edge, 2);
		return area;
	}
	
	public double getVolume() {
		double volume =(Math.pow(edge, 3) / 6 ) * Math.sqrt(2)  ;
		return volume;
	}

}
