package exercise6_14;

// @author ebuka
import java.util.Scanner;
public class Exponential {

	// @param args
	public void expo() {
	int x = 3;
	int y = 15;		
	int result = 1;
	
	for(int i = 1; i <= y; i++) {
		result *= x;
		
		System.out.println("Exponent is: " + result);
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exponential test = new Exponential();
		test.expo();
	}
}
