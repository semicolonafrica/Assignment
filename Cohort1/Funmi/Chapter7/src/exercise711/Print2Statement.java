package exercise711;

public class Print2Statement {
	

	public static void main(String[] args) {
		int []count = new int [10];
		
		int [] bonus = {2,5,20,24,15,5,42,71,40,22,10,21,4,32,65};
		for(int k = 0; k < bonus.length; k++) {
			bonus[k] += 1;
			System.out.printf("%s%5d%4s%4d%n", "bonus element",k, "is",bonus[k]);
		}
		System.out.println();
		
		int [] bestScore = new int [5];
		for(int i = 0; i < bestScore.length; i++) {
			System.out.printf("%5s%5d%10s%2d%n ", "element of:", i," bestScore is", bestScore[i]);
			
		}

	}

}
