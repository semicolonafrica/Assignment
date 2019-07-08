package exercises;

public class ArrayState {

	public static void main(String[] args) {
		//Exercise 7.11.1
		int[] count = new int[10];
		
		//7.11.2
		int[] bonus = new int[15];
		
		for(int i = 0; i < bonus.length; i++) {
			++bonus[i];
		}
		for(int a = 0; a < bonus.length; a++) {
			System.out.println(a + "\t" + bonus[a]);
		}
		
		//Exercise 7.11.3
		
		final int SCORE = 5;
		int[] bestScore = new int[SCORE];
		
		for(int a = 0; a < bestScore.length; a++) {
			bestScore[a] = a+1;
			System.out.printf("%5d", bestScore[a]);
		}
	}

}
