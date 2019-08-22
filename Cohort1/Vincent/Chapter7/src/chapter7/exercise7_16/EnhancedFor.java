package chapter7.exercise7_16;

public class EnhancedFor {

	public static void main(String[] args) {
		int count =0;
		int total = 0;
		int arrayLength =10;
		int [] array1 = new int [arrayLength];
		for (int numbers : array1) {
			count++;
			total +=numbers;
			System.out.printf("%d",numbers);
	
		}


	
		
	}
}
