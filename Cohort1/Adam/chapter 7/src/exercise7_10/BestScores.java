package exercise7_10;

import java.util.Random;

public class BestScores {
	
	public static void main(String[] args) {
		
		 Random random = new Random();
		int[] bestScores =  new int[5];
		
		for (int i = 0; i < bestScores.length; i++) {
			
			bestScores[i] =  random.nextInt(5);
		}
		
		for(int value : bestScores) {
			System.out.printf("%d ", bestScores[value]);
		}
	}

}
