package exercise6_10;

 // @author ebuka
 
public class RoundingNumbers2 {

 // @param args
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double w = 4.67;
	    double q = Math.floor(w * 100 + 0.5) / 100;
	    q = (int)Math.floor(4.67 * 100 + 0.5) / 100;
	    
	    System.out.println("Original Number 4.67..");
	    System.out.println("Integer is: " + q);
	    
	    roundToTenthsNumber();
	}
	
	public static void roundToTenthsNumber() {
		
		double x = 4.67;
		double y = Math.floor(x * 1000 + 0.5) / 1000;
		y = Math.floor(4.67 * 1000 + 0.5) / 1000;
		
		
		System.out.println("Original Number 4.67...");
		System.out.println("Tenths Number is: " + y);	
}
}
	
	//public static void round