package muscleBuilder;

public class BarChart {

	public static void main(String[] args) {
		int[] dami = {15,2,98,3,67,80,0,100,9,78};
		
		for(int counter = 0; counter < dami.length; counter++) {
			if(counter == 9) {
				System.out.printf("%5d: ", 100);
			}
			else {
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
			}
			for(int a = 0; a < dami[counter]; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
