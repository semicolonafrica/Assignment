package exercise5_13;

public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factorial = 1;
		int counter = 1;
		
		System.out.println("Number\t Factorial");
		while(counter <= 20) {
			while(counter <= 20) {
				factorial = factorial * counter;
			
				System.out.println(counter + "!\t" + factorial);
				 counter++;
			}
			counter++;
		}

	}

}

