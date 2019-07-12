package chapter7Exercises;

public class OneDirectionalArray {
	
	
	public void display() {
		
		int[] array = new int [10];
		int[] bonus = {2,3,4,5,6,7,8,9,10,9,8,7,6,5,4};
		int[] bestScores = {1,2,3,2,1};
		
		for(int numbers: array) {
			System.out.print(numbers+" ");
		}
		System.out.println();
		
		for(int counter =0; counter<bonus.length; counter++) {
				bonus[counter]++;
			System.out.printf(bonus[counter]++ +" ");
		}
		System.out.println();
		for(int numbers: bestScores) {
			System.out.println(numbers);
		}		
	}

	public static void main(String[] args) {
		OneDirectionalArray obj = new OneDirectionalArray();
		
		obj.display();

	}

}
