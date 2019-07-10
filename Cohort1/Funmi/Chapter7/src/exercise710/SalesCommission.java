package exercise710;
import java.security.SecureRandom;

public class SalesCommission {
	static SecureRandom random = new SecureRandom();
	
	public static void calArray() {
		int [] gross= new int [11];
		
		for(int i = 0;i < gross.length; i++) {
			gross[i] = 1+ random.nextInt(10);
			
		}
		for(int count = 1; count < gross.length; count++) {
		
			if(count == gross.length-1 ) {
				System.out.printf("$%4d%9s: %2d", 1000, " and over",gross[count -1]);
		
			}else {
				System.out.printf("$%02d-%02d: %2d",(count+1) * 100, (count +1)*100+99, gross[count-1] );
				
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		calArray();
	}

}
