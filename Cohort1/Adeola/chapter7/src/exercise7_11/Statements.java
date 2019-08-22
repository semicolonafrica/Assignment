package exercise7_11;

public class Statements {

	public static void main(String[] args) {
		int[] counts = new int[10];
		
		int[] bonus = {3,45,2,4,7,3,6,8,9,9,3,5,7,87,64};
		for(int i =0; i<bonus.length; i++) {
			bonus[i]+=1;
			System.out.printf("%s%5d%4s%4d%n", "bonus element", i ," is ", bonus[i]);
		}
		
		System.out.println();
		int[] bestScores = new int[5];
		for(int i=0; i<bestScores.length;i++) {
			System.out.printf("%8s%5d%10s%2d%n"," element", i," of bestScores is", bestScores[i]);
		}
	}
}
