package exercise4_22;


public class TabularLoop {
	
	public void displayTable() {
		
		
		int number1 = 1;
		int number2= 10;
		int number3 = 100;
		int number4 = 1000;
		int counter = 1;
		
		System.out.println("N\t 10*N\t 100*N\t 1000*N");
		System.out.println();
		while(counter <= 5) {
			System.out.printf("%d\t %d\t %d\t %d\t %n",(counter * number1),(counter * number2),(counter * number3),(counter * number4));
			
			counter++;
		}

	}
}