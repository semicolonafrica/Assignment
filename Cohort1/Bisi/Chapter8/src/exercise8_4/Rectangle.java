package exercise8_4;

public class Rectangle {
	private float length = 1;
	private float width = 1;
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if(length <= 20.0) {
			this.length = length;
		}
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if(width <= 20.0) {
			this.width = width;  
		}
		this.width = width;
	}
	public float calPerimeter() {
		float perimeter = 2 * ( length + width);
		return perimeter;
	}
	public float calArea() {
		 float area = length * width;
		return area;
	}
}
