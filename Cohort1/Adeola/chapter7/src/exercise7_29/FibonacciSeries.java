package exercise7_29;

public class FibonacciSeries {
	public static void fibonacci(int n) {
		int[] nthterm = new int[n+1];
		nthterm[0]=0;
		nthterm[1]=1;
		
		for(int i=2; i<nthterm.length; i++) {
			nthterm[i]= nthterm[i-1]+nthterm[i-2];
		}
		System.out.println(nthterm[n-1]);
	}

	public static void main(String[] args) {
		for(int i=0;i<50; i++) {
			fibonacci(i+1);
		}
	}

}
