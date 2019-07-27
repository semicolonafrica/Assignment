package exercise8_4;

public class Rectangle {
	
	private int length=1;
	private int width=1;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length>0.0&&length<20.0)
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width>0.0&&width<20.0)
		this.width = width;
	}
	
	public double calArea(double length,double width) {
		
		double area=getWidth()*getLength();
		return area;
	}
	
	public double calPerimeter(double length,double width) {
		double p=2*(getLength() + getWidth());
		return p; 
	}

}
