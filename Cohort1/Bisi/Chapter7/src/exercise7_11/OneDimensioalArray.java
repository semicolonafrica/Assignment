package exercise7_11;

public class OneDimensioalArray {

	public static void main(String[] args) {
		
	//	Answer to Question 1
		int [] array = new int [10];
		System.out.println("Count \t Value");
		for(int count = array.length - 1; count >= 0; count--) {
			System.out.println(count + " \t  " + array[count]);
		}
		
	// Answer to Question 2
		System.out.println();
		int[] bonus = new int [15];
		System.out.print("{");
		for(int count = 0; count < bonus.length; count++) {
				System.out.print(bonus[count] + ",");
				}
		System.out.print("}");
		System.out.println();
		System.out.print("The added value gives:\n");
		System.out.print("{");
		for(int count = 0; count < bonus.length; count++) {
			bonus[count] += 1;
			System.out.print(bonus[count] + ",");
				}
		System.out.print("}");
		System.out.println();
		
	// Answer to Question 3
		System.out.println();
		int [] bestScores = new int [5];
		System.out.print("{");
	for(int count = 0; count < bestScores.length; count++)
		System.out.println(bestScores[count] + ",");
		System.out.print("}");
	}

}
