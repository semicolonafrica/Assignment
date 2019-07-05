package chapter5.exercise5_21;
import java.util.Scanner;
import java.security.SecureRandom;

public class PythagoreanTriples {
	
	static SecureRandom random = new SecureRandom();
	
	public static void inputNumbers() {
		
	Scanner input = new Scanner(System.in);
			
		int side1;
		int side2;
		int hypotenous;
	
		System.out.println("enter side1");
		side1 = input.nextInt();
		System.out.println("enter side2");
		side2 = input.nextInt();
	
	
		int total = 0;
		int value = random.nextInt(10);
		
		for(int i = 1; i <= 10; i++) {
		
			for(int j =1; j<=5; j++) 
						
		total= (int) Math.pow(2*side1 + side2*2, 0);
		int c = (int) Math.pow(value, 0); 
				
		}

		if(total== value)
			System.out.println("right pytogorean");
	System.out.printf("%d%d",value, total);
}
	
}	
	
	