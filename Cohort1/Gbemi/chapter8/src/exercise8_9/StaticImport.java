package exercise8_9;
/*
 * 
 * Rewrite the code in Fig. 8.14 to use a separate import declaration for each static member
of class Math that’s used in the example*/

public class StaticImport {
	public static void main(String[] args) {
		System.out.printf("sqrt(900.0)=%.1f%n",Math.sqrt(900.0));
		System.out.printf("ceil(-9.8)=%.1f%n",Math.ceil(-9.8));
		System.out.printf("E =%f%n", Math.E);
		System.out.printf("PI =%f%n", Math.PI);
		
	}
	

}
