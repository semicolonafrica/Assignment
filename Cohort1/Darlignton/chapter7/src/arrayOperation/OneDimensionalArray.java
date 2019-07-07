package arrayOperation;

public class OneDimensionalArray {
	
	public static void main(String[] args) {
		
		//Write statements that perform the following one-dimensional-array
		//operations:
		
		//Question one 
		//Set the 10 elements of integer array counts to zero.
		int[] counts = new int[10];
		
		for(int i = 0; i<counts.length; i++) {
			
			counts[i] = 0;
		}
		
		//Question two
		//Add one to each of the 15 elements of integer array bonus.
		int[] bonus = new int[15];
		
		for(int counter =0; counter < bonus.length; counter++)
			bonus[counter] = 1;
		
		
		//Question three
		//Display the five values of integer array bestScores in column
		//format.
		int[] bestScores = {1,2,3,4,5};
		
		for(int i =0; i<bestScores.length; i++) {
			
			System.out.printf("%d  ", bestScores[i]);
		}
		

	}

}
