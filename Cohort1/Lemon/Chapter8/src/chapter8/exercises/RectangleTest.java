package chapter8.exercises;

public class RectangleTest {

	public static void main(String[] args) {
		
		
		try{	
			Rectangle lem = new Rectangle(0.0, 10.0);			
			lem.getRectangle();	
			
		}
		
		catch(IllegalArgumentException e) {			
		System.out.println(e.getMessage());
		}		
	}
}
