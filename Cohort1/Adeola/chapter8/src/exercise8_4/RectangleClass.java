package exercise8_4;

public class RectangleClass {
	private float length = 1;
	private float width = 1;
	float area;
	float perimeter;
	
	
	public RectangleClass(float length, float width) {
		if((length > 0.0)&&(length <20.0)) {
			this.length = length;
		}
		if((width > 0.0)&&(width <20.0)) {
			this.width = width;
		}
	}
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if((length > 0.0)||(length <20.0)) {
			this.length = length;
		}
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if((width > 0.0)||(width <20.0)) {
			this.width = width;
		}
	}
	
	public float calArea() {
		area = length * width;
		return area;
	}
	public float calPerimeter() {
		perimeter = 2*(length + width);
		return perimeter;
	}
	
	
}
