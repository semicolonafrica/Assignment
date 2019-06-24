package exercise6_11;

// @author CHIMA CHUKWUEBUKA
import java.security.SecureRandom;
public class RandomIntegers {

	// @param args
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		SecureRandom hit = new SecureRandom();
		
		int mode1 = 1 + hit.nextInt(2); // 6.12a
		System.out.println(mode1);
		
	    int mode2 = 1 + hit.nextInt(100); // 6.12b
	    System.out.println(mode2);
		
		int mode3 = 0 + hit.nextInt(9); // 6.12c
	    System.out.println(mode3);
		
		int mode4 = 1000 + hit.nextInt(1112); // 6.12d
		System.out.println(mode4);
		
		int mode5 = -1 + hit.nextInt(1); // 6.12e
		System.out.println(mode5);
		
		int mode6 = -3 + hit.nextInt(11); // 6.12f
	    System.out.println(mode6);
	}
}
