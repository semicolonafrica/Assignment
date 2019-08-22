package chapter7.practice;

public class SumArray {

		private static int total = 0;
		public static int sum() {
		
			int [] array = {87,45,64,23,45,11};
			
			System.out.printf("%2s%8s\n", "index", "values");	
			for(int counter = 0; counter < array.length; counter++) {
			total += array[counter];
			System.out.printf("%2d%8d\n", counter, array[counter]);
	}
			System.out.println( "sum of values are: " +total);
			return total;
}
		public static void main(String [] args) {
			SumArray summy = new SumArray();
			summy.sum();
		}
}