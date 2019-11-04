package exercise7_11;

public class OneDimensionalArray {
	
	public static void printArrayCounts() {
		int [] counts = {3,4,5,6,7,8,9,6,2,1};
		
		System.out.println("Initial elements:");
		
		System.out.printf("%5s%8s%n" ,"Index","Value");
		
		for(int i = 0; i<counts.length;i++) {
			
			System.out.printf("%5d%8d%n" ,i ,counts[i]);
		}
		System.out.println("New elements after setting it to zero:");
		
		System.out.printf("%5s%8s%n" ,"Index","Value");

		for(int i = 0; i<counts.length;i++) {
			
			counts[i] = 0;
			
			System.out.printf("%5d%8d%n" ,i ,counts[i]);
		}
		
		System.out.println();
	}
	
	
	public static void printArrayBonus() {
		int [] bonus = {1,2,3,4,54,67,23,43,14,15,58,80,70,40,51};
		
		System.out.println("One plus each 15 elements");
		
		System.out.printf("%5s%8s%n" ,"Index","Value");
		
		for(int i =0;i < bonus.length;i++) {
			
			++bonus[i];
			
			System.out.printf("%5d%8d%n" ,i ,bonus[i]);
		}
	}
	
	public static void printArrayBetSecores() {
		
		int [] betScores = {58,80,70,40,51};
		
		System.out.println("Values for best scores");
		
		System.out.printf("%5s%8s%n" ,"Index","Value");
		
		for(int i =0;i < betScores .length;i++) {
			
			System.out.printf("%5d%8d%n" ,i ,betScores[i]);
		}
	}

}
