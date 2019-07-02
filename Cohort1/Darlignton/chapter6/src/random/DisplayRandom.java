package random;
import java.security.SecureRandom;

public class DisplayRandom {
public static void main(String args[]) {
	SecureRandom randomNumber = new SecureRandom();
	
	int num1 = 2 + 2 * randomNumber.nextInt(5);
	int num2 = 3 + 2 * randomNumber.nextInt(5);
	int num3 = 6 + 4 * randomNumber.nextInt(5);
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	
//	for(int i = 1; i <= 10; i++) {
//		
//		System.out.println(num3);
//	}
//	
//	
//	//System.out.println(num1);
//	
}
}
