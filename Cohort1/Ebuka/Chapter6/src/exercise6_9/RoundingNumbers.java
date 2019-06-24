package exercise6_9;

// @author ebuka

public class RoundingNumbers {

	// @param args
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 3.99;
		
		double y = Math.floor(x + 0.5);
			y = (int)Math.floor(3.99 + 0.5);
		
		
		System.out.println("Initial Number Was 3.99...");
		System.out.println("New Number is:" + y);
	}

}
