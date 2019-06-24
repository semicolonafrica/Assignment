package exercise6_13;

// @author CHIMA CHUKWUEBUKA
import java.security.SecureRandom;
public class RandomNumbers {

// @param args
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecureRandom bit = new SecureRandom();
		
		int mode1 = 2 + bit.nextInt(10);
		System.out.println(mode1);
		
		int mode2 = 3 + bit.nextInt(11);
		System.out.println(mode2);
		
		int mode3 = 6 + bit.nextInt(22);
		System.out.println(mode3);
	}

}
