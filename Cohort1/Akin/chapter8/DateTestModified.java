package chapter8;

public class DateTestModified {

	public static void main(String args[]) {
		System.out.println("Increment date");
		
		Date date = new Date(8,1,2019);
		for(int i = 0; i < 30; i++) {
			
			date.nextDay();
			
			System.out.printf("%s%n", date.toString());
		}
	}
	
}
