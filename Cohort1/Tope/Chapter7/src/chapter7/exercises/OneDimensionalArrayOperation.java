package chapter7.exercises;
//Exercise 7.11
//Program written by Oyemade Temitope
//2nd Of July 2019

public class OneDimensionalArrayOperation {

	public static void main(String[] args) {
		
		//Write statements that perform the following one-dimensional-array
		//operations:
		
		//Question one 
		//Set the 10 elements of integer array counts to zero.
		int[] count = new int[10];
		
		for(int i = 0; i<count.length; i++) {
			
			count[i] = 0;
		}
		
		//Question two
		//Add one to each of the 15 elements of integer array bonus.
		int[] bonus = new int[15];
		
		for(int x =0; x< bonus.length; x++)
			bonus[x] = 1;
		
		
		//Question three
		//Display the five values of integer array bestScores in column
		//format.
		int[] bestScores = {1,2,3,4,5};
		
		for(int i =0; i<bestScores.length; i++) {
			
			System.out.printf("%d  ", bestScores[i]);
		}
		

	}

}
