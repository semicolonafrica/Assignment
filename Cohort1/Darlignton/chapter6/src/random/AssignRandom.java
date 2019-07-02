package random;
import java.security.SecureRandom;

public class AssignRandom {
	public static void main(String args[]) {
		SecureRandom randomNumber = new SecureRandom();
		
		int num1 = 1 + randomNumber.nextInt(2);
		int num2 = 1 + randomNumber.nextInt(100);
		int num3 =  randomNumber.nextInt(10);
		int num4 = 1000 + randomNumber.nextInt(113);
		int num5 = -1 +  randomNumber.nextInt(3);
		int num6 = -3 + randomNumber.nextInt(15);
		
		
		
		//System.out.println(num1);
		//System.out.println(num2);
//		for(int i =1; i <= 50; i++) {
//			int num7 = 1 + randomNumber.nextInt(11);
//			if(num7 == 11) {
//				System.out.println(num7);	
//			}
//			else {
//				System.out.println("not found");
//			}
//			
//		}
		
		//System.out.println(num4);
		//System.out.println(num5);
		//System.out.println(num6);
	}

}
