package exercise7_11;

import java.util.Random;

public class Others {
	
	public static void main(String[] args) {
		Random randum = new Random();
		
		//int [] counts = new int[10];
		
		int [] bonus = new int[15];
		System.out.printf("%3s%n%n","value of Bonus");
		
		for(int i =0; i < bonus.length; i++) {
			
			bonus[i] = 1 + randum.nextInt(10);
			
			System.out.printf("%d\t%d%n", i, bonus[i]);
			
		}
		System.out.println();
		System.out.printf("%3s%n%n","one added to each value of Bonus");
		for(int j = 0; j < bonus.length; j++) {
			
			bonus[j] += 1;
			System.out.printf("%d\t%d%n", j, bonus[j]);
			
			
		}
	}
	

}
