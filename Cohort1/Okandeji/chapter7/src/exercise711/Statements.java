package exercise711;

public class Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
		System.out.println("Q1");
		int[] counts = {0,0,0,0,0,0,0,0,0,0};
		
		for(int counter : counts) {
		System.out.printf("%s ", counts[counter]);
		}
		System.out.printf("%n%n");
		
		//Question 2
		System.out.println("Q2");
		int[] bonus = {2,3,4,5,6,7,8,9,8,7,6,5,4,3,2};
		
		for(int count = 0; count < 15; count++) {
			bonus[count] = 1 + bonus[count];
			
			System.out.printf("%s ", bonus[count]);
		}
		System.out.printf("%n%n");
		
		//Question 3
		System.out.println("Q3");
		int[] bestScores = {4,3,4,3,4};
		System.out.println("int[] bestScores in column format is: ");
		for(int count = 0; count < bestScores.length; count++) {
			System.out.printf("%d%n", bestScores[count]);
		}
	}
}
