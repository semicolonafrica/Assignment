package exercise10_13;
 	
public class Cube extends ThreeDimensional {
	private double side;
	private double edge;
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getEdge() {
		return edge;
	}
	public void setEdge(double edge) {
		this.edge = edge;
	}
	
	
	public double calArea() {
		
		return 6*(Math.pow(2, side));
	} 
	public double calVolume() {
		return Math.pow(side, 3) - edge;
	}

	
	public String toString() {
		return String.format("%s%n%.2f%n%.2f", super.toString(),calArea(),calVolume());
	}
}
