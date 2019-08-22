package exercise7_29;

public class FibonacciSeriesDouble {
	public static void fibonacci(int n) {
		double[] nthterm = new double[n+1];
		nthterm[0]=0;
		nthterm[1]=1;
		
		for(int i=2; i<nthterm.length; i++) {
			nthterm[i]= nthterm[i-1]+nthterm[i-2];
		}
		System.out.println(nthterm[n-1]);
	}

	public static void main(String[] args) {
		for(int i=0;i<1480; i++) {
			System.out.print(i + "th term = ");
			fibonacci(i+1);
		}
	}

}
