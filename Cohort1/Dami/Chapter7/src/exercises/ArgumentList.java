package exercises;

public class ArgumentList {

		public static int calcProduct(int[] array) {
			int product = 1;
					
				for(int i = 0; i < array.length; i++) {
					
					product *= array[i];			
		}
		return product; 
	}

}
