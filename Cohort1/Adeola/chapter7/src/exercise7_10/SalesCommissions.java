package exercise7_10;
import java.security.SecureRandom;

public class SalesCommissions {
	
	static SecureRandom random = new SecureRandom();
	public static void setArray() {
		int[] gross = new int[10];
		for(int i=0; i< gross.length ;i++) {
			gross[i] = 1+ random.nextInt(10);
		}
		for(int counter = 1; counter <gross.length; counter++) {
			if(counter == gross.length-1) {
				System.out.printf("$%3d%9s: %2d", 1000," and over ", gross[counter-1]);
			}
			else {
				System.out.printf("$%02d-%02d: %2d", (counter+1)*100, (counter+1)*100+99, gross[counter-1]);
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		setArray();
	}

}
