package chapter5.exercise518;

public class ValueOfPie {

	public static void main(String[] args) {
		
		
		//int first = 4;
		double store = 0.0;
		double numberOfTerms = 136121.00;
		//double num1 = 0.0;
		//double num2 = 0.0;
		
		for(double i = 1.0; i <= numberOfTerms; i++) {
			
			if(i == 1.0) {
				store += 4.0;
			}else if(i % 2.0 == 0) {
				store =store - (4.0/(i + (i - 1.0)));
				
			}
			else {
				store += 4.0/(i + (i - 1.0));
			}
				//store += num1;
				System.out.printf("%.1f\t%.5f%n",i,store);
		}
		

	}

}
