package chapter7Exercises;

public class FibonacciSeries {
	
	int nTerm = 40;
	
	int[]fibonacci = new int [nTerm];
	
	
	public void getFibonacci() {
		int initialValue =1;
		
		for(int counter =0; counter< fibonacci.length; counter++) {
			
			if (counter ==1) {
			fibonacci[counter] = initialValue;
			}
			if (counter >1) {
					fibonacci[counter] += fibonacci[counter-2] + fibonacci[counter-1];
				}
			}
		for(int counter1 = 0; counter1 <fibonacci.length; counter1++) {
			System.out.printf("%d%n",fibonacci[counter1]);
		}
	}

}
