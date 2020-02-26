package exercise7_11;

public class Statements {
	public void displayCount() {
		int count [] = new int [10];
		
		System.out.printf("%s%7s%n", "Index", "Value");
		for(int counter = 0; counter < count.length; counter++)
			System.out.printf("%5d%10d%n", counter,  count[counter]);
		System.out.println();
	}
	
	public void displayBonus() {
		int bonus [] = new int [15];
		
		System.out.printf("%s%7s%n", "Index", "Value");
		for(int counter = 0; counter < bonus.length; counter++)
			bonus[counter] = 1 + 1 * counter;
		
		for(int counter = 0; counter < bonus.length; counter++)
			System.out.printf("%5d%10d%n", counter,  bonus[counter]);
	}
	
	public void displayScore() {
		int bestScores [] = {3, 4, 5, 7, 8};
		for(int counter = 0; counter < bestScores.length; counter++)
			System.out.println(bestScores[counter]);
	}
}
