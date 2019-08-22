package chapter4.exercise4_22;

public class TabularLoop {
	
	public void makeLoop() {
	int number1 = 1;
	int number2= 10;
	int number3 = 100;
	int number4 = 1000;
	int counter = 1;
	
	System.out.printf("%4s%6s%6s%7s","N", "10*N" ,"100*N" ,"1000*N");
	System.out.println();
	while(counter <= 5) {
		System.out.printf("%4d %4d %4d %6d%n",(counter * number1),(counter * number2),(counter * number3),(counter * number4));
		
		counter++;
	}

   }

	public static void main(String[] args) {
		TabularLoop loop1 = new TabularLoop();
		loop1.makeLoop();
	}
}
