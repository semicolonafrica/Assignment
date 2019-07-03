package examples;

public class StudentPoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] responses = {1,2, 5, 4, 3, 5, 2, 1, 3, 3,5, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
		int[] frequency = new int[6];
		
		for(int answer = 0; answer <responses.length; answer++) {
			try {
				++frequency[responses[answer]];
			}
			catch (ArrayIndexOutOfBoundsException b) {
				System.out.println(b);
				System.out.printf(" responses[%d]= %d%n%n", answer , responses[answer]);
			}
		}
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		for(int rating = 1; rating <frequency.length; rating++) {
			System.out.printf("%d%10d%n", rating, frequency[rating] );
		}

	}

}