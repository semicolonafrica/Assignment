package chapter5.exercise5_15;

public class TrianglePrint {

	public static void formulateTriangle() {
		
		int a = 1;
		
		for(int j = 1; j <= 10; j++) {
		
			for(int i = 1; i <= a; i++) {
				
				
				System.out.print("*");
		}
		
			System.out.println();
			a +=1;
		}
		System.out.println();
	    }

		public static void TurnTriangle() {
		
			int a = 1;
			
			for(int j = 10; j >= 1; j--) {
			
				for(int i = 10; i >= a; i--) {
					System.out.print("*");
		}
			
				System.out.println();
				a +=1;
		}
			
		
			
		}
	public static void triangle() {
		int a = 1;
		int c = 0;
		
		for(int j = 1; j <= 10; j++) {
			
			for(int i = 1; i <= c; i++) {
				System.out.print(" ");
			}
		
		for(int counter = 10; counter >= a; counter--)
				System.out.print("*");
		
		System.out.println();
		a++;
		c++;
			
	}
		
	
	}

	public static void anotherTriangle() {
		
		int a = 10;
		int c = 0;
		
		for(int j = 1; j <= 10; j++) {
			
			for(int i = 1; i <= 10; i++) {
				
			}
		
		for(int counter = 1; counter <= a; counter++)
				System.out.print("*");
		
		System.out.println();
		a--;
		c++;
			
	}
		
		
		
		
	}


}
			

