package chapter6.exercises;

public class CommonDivisor {
	
	public static void checkDivisor(int x, int y) {
		
		int m = 0; 
		
		for(int i=1; i <x || i<y; i++) {
			if(x%i ==0 && y%i ==0) {
				int store = i;				
				System.out.println(m = Math.max(store,i));			
			}
		}
		System.out.println("The largest of the above common divisor is: "+m);
		}
}
