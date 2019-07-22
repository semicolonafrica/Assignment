package exercise8_4;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle  box = new Rectangle(0, 0);
		
		box.setLength(5);
		
		box.setWidth(4);
		
		System.out.println(box.calArea()+ "m");
		
		System.out.println(box.calPerimeter()+ "m");
	}

}
