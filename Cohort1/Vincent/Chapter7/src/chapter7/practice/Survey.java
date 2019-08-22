package chapter7.practice;

public class Survey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] responses = {2,2,3,4,6,9,7,5,2,3,4,5,9,7,5,2,3,9,7,4,};
		int [] frequency = new int [6];
		
		for (int answer = 0; answer < responses.length; answer++) {
			
			try {
				++frequency[responses[answer]];	
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.printf("  responses[%d] = %d\n\n", answer,responses[answer]);
				
			}
		
		}
			System.out.printf("%s%10s\n", "rating", "frequency");
			
			for (int rating = 1; rating < frequency.length; rating++)
				System.out.printf("%6d%10d\n", rating, frequency[rating]);
	} 

}
