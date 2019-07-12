package chapter7Exercises;

public class PrintStatements {
	
	public void findSmallestNumber() {
		
		double[] w = {10.0,50.0,6.0,100.0,5.0,6.0,70.0,8.0,9.0,10.0};
	
		double smallest = w[7];
		double largest = 0;
		double small = 0;
		
		for(int counter=0; counter < w.length; counter++) {
			small = w[counter];
			if (smallest > small) {
				smallest = small;
			}else if(largest < small) {
				largest = small;
			}
		}
		System.out.println("The smallest number is: "+smallest);
		System.out.println("The largest number is: "+largest);
	}
}
