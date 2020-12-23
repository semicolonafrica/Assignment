package chapter6;

public class GreatestCommonDivisor {
	
	public static void gcd(int value1,int value2) {
		int i;
		int largest=0;
		for( i=1;i<value1||i<value2;i++) {
			
			if(value1%i==0&&value2%i==0 ) {
				int store1= i;
				
				System.out.println(largest=Math.max(store1, i));

			
		}
		 }
		System.out.print("the greatest common divisor is :" +largest);
		
			
	}
	

}
