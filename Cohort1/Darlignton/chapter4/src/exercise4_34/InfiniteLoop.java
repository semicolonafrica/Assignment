package exercise4_34;


public class InfiniteLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 1;
		
		while(counter != 0) {
			counter = 2 * counter;
			
			System.out.printf("%d\t%n",(counter));
		}
	}

}