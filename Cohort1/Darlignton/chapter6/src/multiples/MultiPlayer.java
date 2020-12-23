package multiples;

//This program checks if the second set of game players are
//a multiple of the first set.

public class MultiPlayer {
	public void detectPlayers(int set1, int set2) {
		boolean result = Multiple.isMultiple(set1, set2);
		if(result == true) {
			System.out.println("Good to go");
		}
		else {
			System.out.println("Get more men");
		}
	}

}
