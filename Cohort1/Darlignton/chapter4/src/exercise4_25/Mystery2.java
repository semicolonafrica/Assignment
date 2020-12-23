package exercise4_25;

public class Mystery2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int counter = 1;
		
		while (counter <= 10) {
			
			System.out.println(counter % 2 == 1 ? "****" : "+++++++++");
		
			++counter;
		}
	}

}